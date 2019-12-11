package source.ast.data;

import static java.lang.String.format;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestUtils {
    
    public static String unquote(String t, char quoteChar) {
        String t1 = t.trim();
        if (t1.charAt(0) == quoteChar) t1 = t1.substring(1);
        if (t1.charAt(t1.length() - 1) == quoteChar) t1 = t1.substring(0, t1.length() - 1);
        return t1;
    }
    
    public static String quote(String t, char quoteChar) {
        String t1 = t;
        if (t1.charAt(0) != quoteChar) t1 = quoteChar + t1;
        if (t1.charAt(t1.length() - 1) != quoteChar) t1 = t1 + quoteChar;
        return t1;
    }
    
    private static final String ESC_PATTERN = 
            "\\\\t|\\\\b|\\\\n|\\\\r|\\\\f|\\\\'|\\\\\"|\\\\\\\\|\\\\u\\d{4}";
    
    public static String unescape(String t) {
        StringBuilder sb = new StringBuilder();
        Pattern r = Pattern.compile(ESC_PATTERN);
        Matcher m = r.matcher(t);
        int ini = 0;
        int fin = 0;
        while (m.find()) {
            ini = m.start();
            String s1 = t.substring(fin, ini);
            sb.append(s1);
            fin = m.end();
            String esc = t.substring(ini, fin);
            if (esc.equals("\\t")) {
                sb.append('\t');
            }
            else if (esc.equals("\\b")) {
                sb.append('\b');
            }
            else if (esc.equals("\\n")) {
                sb.append('\n');
            }
            else if (esc.equals("\\r")) {
                sb.append('\r');
            }
            else if (esc.equals("\\f")) {
                sb.append('\f');
            }
            else if (esc.equals("\\\'")) {
                sb.append('\'');
            }
            else if (esc.equals("\\\"")) {
                sb.append('\"');
            }
            else if (esc.startsWith("\\u")) {
                String h = esc.substring(2);
                int c = Integer.parseInt(h, 16);
                sb.append((char)c);
            }
            else {
                sb.append(esc);
            }
        }
        String rest = t.substring(fin, t.length());
        sb.append(rest);
        return sb.toString();
    }
    
    public static String escape(String t) {
        StringBuilder sb = new StringBuilder();
        for (char c: t.toCharArray()) {
            if (c == '\t') {
                sb.append("\\t");
            }
            else if (c == '\b') {
                sb.append("\\b");
            }
            else if (c == '\n') {
                sb.append("\\n");
            }
            else if (c == '\r') {
                sb.append("\\r");
            }
            else if (c == '\f') {
                sb.append("\\f");
            }
            else if (c == '\'') {
                sb.append("\\\'");
            }
            else if (c == '\"') {
                sb.append("\\\"");
            }
            else if (c == '\\') {
                sb.append("\\\\");
            }
            else if (c > 0xff) {
                sb.append(format("\\u%04X", (int)c));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
