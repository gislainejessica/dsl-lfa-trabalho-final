package source.jogar;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;

import source.gramatica.TamagotchiCatLexer;
import source.gramatica.TamagotchiCatParser;

// ...
import java.io.PrintWriter;
import java.util.Optional;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import source.ast.data.Context;
import source.ast.data.Expr;
import source.ast.data.FloatLit;
import source.ast.data.Ops;


public class Jogar implements Runnable {
    /*   public static void Jogar(String[] args) throws IOException {  

        CharStream input = CharStreams.fromFileName("./src/tests/exemplo.txt");
        TamagotchiCatLexer lexer = new TamagotchiCatLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamagotchiCatParser parser = new TamagotchiCatParser(tokens);
        
        //TamagotchiCatParser.TipagemContext ans = parser.tipagem();         
        TamagotchiCatParser.ValorContext ans1 = parser.valor();
  
        //LaricaDoSurfParser.Definicao_funcaoContext ans = parser.definicao_funcao();
        // TamagotchiCatParser.Expressao_condicionalContext ans = parser.expressao_condicional();
        //LaricaDoSurfParser.BlocoContext ans = parser.bloco();
                        
        System.out.printf(">>> %s\n", ans.result);   
        
        fis.close();        
        
    }
    */

    // ...
    private static final String VERSION = "1.0 (Permaneça Vivo)";
    private static final String PROGNAME = "Tamagochi";
    
    private Scanner reader;
    private PrintWriter writer;
    private Boolean showExpr = false;

    public static void main(String[] args) {
        Jogar main = new Jogar();
        main.run();
    }
    
    
    @Override
    public void run() {
        Context ctx = new Context(Optional.empty());
        initGlobalContext(ctx);
        try {
            repl(ctx);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void repl(Context ctx) throws IOException {
        setReader(new Scanner(System.in));
        setWriter(new PrintWriter(System.out, true));
        writer.printf("%s -- Versão %s -- digite :? para ajuda.\n", PROGNAME, VERSION);
        
        boolean finished = false;
        while (!finished) {
            writer.println();
            String line = readInput("Expr>");
            if (line.trim().equals(":q") || line.trim().equals(":quit")) {
                finished = true;                    
            }
            else if (line.trim().equals(":?")) {
                printHelp();
            }
            else if (line.trim().equals(":l") || line.trim().equals(":list")) {
                printContext(ctx);                    
            }
            else if (line.startsWith(":set")) {
                String ts[] = line.split("\\s+");
                setOptions(ts);
            }
            else if (line.startsWith(":show")) {
                String ts[] = line.split("\\s+");
                showOptions(ts);
            }
            else if (line.startsWith(":load")) {
                String[] cmd = line.split("\\s+");
                String fname = cmd[1];
                Expr exp = loadFromFile(fname);
                Expr ans = evalExpr(ctx, exp);
                writer.printf("ans:> %s\n", ans.repr());
            }
            else {
                Expr exp = readExpr(line);
                Expr ans = evalExpr(ctx, exp);
                writer.printf("ans:> %s\n", ans.repr());
            }
        }
        writer.println("Até à vista.");
    }
    
    
    public String readInput(String prompt) {
        writer.printf("Expr> ");
        String line = reader.nextLine();
        if (line.trim().equals(":{")) {
            StringBuilder sb = new StringBuilder();
            line = reader.nextLine();
            while (!line.trim().equals(":}")) {
                sb.append(line).append('\n');
                line = reader.nextLine();
            }
            return sb.toString();
        }
        else {
            return line + '\n';
        }
    }
    
    
    private void setReader(Scanner scanner) {
        this.reader = scanner;
    }
    
    
    private void setWriter(PrintWriter printWriter) {
        this.writer = printWriter;
    }
    
    
    private static final String[][] HELP_TEXT = {
        {"<expressão>", "avalia/executa <expressão>"},
        {":{\\n...\\n:}\\n", "expresão com múltiplas linhas"},
        {":load <filename>", "carrega e executa o arquivo <filename>"},
        {":q|:quit", "termina a execução"},
        {":l|:list", "lista todas as variáveis definidas"},
        {":set debug true|false", "ativa ou desativa o debug"},
        {":set scale n", "ajusta o número de dígitos decimais da divisão"},
        {":show debug|scale", "mostra o estado atual das opções"}
    };
            
    private void printHelp() {
        writer.println("Comandos disponíveis à partir do prompt:\n");
        for (String[] t: HELP_TEXT) {
            writer.printf("  %-30s %s\n", t[0], t[1]);
        }
    }
    
    
    private void printContext(Context ctx) {
        ctx.keySet().stream().sorted().forEach(
                var -> writer.printf("%-20s\t%s\n", var, ctx.get(var).repr())
        );
    }
    
    
    private void setOptions(String[] ts) {
        if (ts.length < 2) {
            System.err.println("!!! Erro: Comando :set não definiu opção.");
        }
        else if (ts[1].equals("debug")) {
            if (ts.length < 3) {
                System.err.println("!!! Erro: Valor não definido.\n");
            }
            else if (ts[2].equals("true") || ts[2].equals("on")) {
                setShowExpr(true);
            }
            else if (ts[2].equals("false") || ts[2].equals("off")) {
                setShowExpr(false);
            }
            else {
                System.err.printf("!!! Erro: Valor inválido: %s\n", ts[2]);
            }
        }
        else if (ts[1].equals("scale")) {
            if (ts.length < 3) {
                System.err.println("!!! Erro: Valor não definido.\n");
            }
            else {
                try {
                    int n = Integer.parseInt(ts[2]);
                    if (n > 0) Ops.setScale(n);
                }
                catch (Exception e) {
                    System.err.printf("!!! Erro: Valor não é inteiro: %s\n", ts[2]);
                }
            }
        }
        else {
            System.err.printf("!!!! Erro: Opção inválida: %s\n", ts[1]);
        }
    }
    
    
    private void showOptions(String[] ts) {
        if (ts.length < 2) {
            System.err.println("!!! Erro: Comando :show não definiu opção.");
        }
        else if (ts[1].equals("debug")) {
            writer.printf("::: debug => %s\n", isShowExpr());
        }
        else if (ts[1].equals("scale")) {
            writer.printf("::: scale => %s\n", Ops.getScale());
        }
        else {
            System.err.printf("!!!! Erro: Opção inválida: %s\n", ts[1]);
        }
    }
    
    
    private Expr readExpr(String line) {
        CharStream input = CharStreams.fromString(line);
        TamagotchiCatLexer lexer = new TamagotchiCatLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamagotchiCatParser parser = new TamagotchiCatParser(tokens);
        TamagotchiCatParser.ProgrContext prog = parser.progr();
        
        Expr expr = Expr.UNIT;
        if (prog.exception != null) {
            System.err.printf("!!!! Erro: %s.\n", prog.exception);
        }
        else {
            expr = prog.result;
            if (isShowExpr()) writer.printf("::::> %s\n", expr);
        }
        return expr;
    }

    
    private Expr loadFromFile(String file) throws IOException {
        CharStream input = CharStreams.fromFileName(file);
        TamagotchiCatLexer lexer = new TamagotchiCatLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        TamagotchiCatParser parser = new TamagotchiCatParser(tokens);
        TamagotchiCatParser.ProgrContext prog = parser.progr();
        
        Expr expr = Expr.UNIT;
        if (prog.exception != null) {
            System.err.printf("!!!! Erro: %s.\n", prog.exception);
        }
        else {
            expr = prog.result;
            if (isShowExpr()) writer.printf("::::> %s\n", expr);
        }
        return expr;
    }

    
    private Expr evalExpr(Context ctx, Expr exp) {
        Expr ans = Expr.UNIT;
        try {
            ans = exp.eval(ctx);
        }
        catch (Exception e) {
            System.err.printf("!!!! Erro: %s\n", e.getMessage());
        }
        return ans;
    }

    
    private boolean isShowExpr() {
        return showExpr;
    }
    
    
    private void setShowExpr(Boolean value) {
        showExpr = value;
    }
    

    private void initGlobalContext(Context ctx) {
        ctx.set("abs", Ops.ABS);
        //uctx.set("sqrt", Ops.SQRT);

        ctx.set("print", Ops.PRINT);
        ctx.set("println", Ops.PRINTLN);
        ctx.set("readln", Ops.READLN);

        ctx.set("format", Ops.FORMAT);
        ctx.set("split", Ops.SPLIT);
        ctx.set("length", Ops.LENGTH);
        ctx.set("nth", Ops.NTH);
        
        ctx.set("cons", Ops.CONS);
        ctx.set("list", Ops.LIST);
        ctx.set("first", Ops.FIRST);
        ctx.set("rest", Ops.REST);
        
        ctx.set("tobool", Ops.TOBOOL);
        ctx.set("tochar", Ops.TOCHAR);
        ctx.set("tofloat", Ops.TOFLOAT);
        ctx.set("toint", Ops.TOINT);
        ctx.set("tostr", Ops.TOSTR);
        
        ctx.set("PI", FloatLit.of(Math.PI));
        ctx.set("E", FloatLit.of(Math.E));
    }

}