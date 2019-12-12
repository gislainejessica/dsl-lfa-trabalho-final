# Relatório

*Introdução*:
*__TamagotchiCat__* é uma DSL criada para simular o dia a dia de um gato e suas necessidades e o objetivo é ver se o gato permanece vivo depois de um dia, tudo vai depender das escolhas feitas. É uma dsl inventada com o propósito de aplicação dos conceitos estudados, baseada em fatos reais.

### Objetivo: __Make a Cat and survive the day__ 
**What you do**
Feed: Food and Water, noFood
Play: Move, Hide, Hand, High fall
Make it sleep: Yes, No
---
**What cat do**
Miau: Long, Const, Sundelly, High Up, Snack
Scratch: None, Cool, Medium, Hard
Be Cute: 
---
**Estrutura possíveis**
...

*Definição da DSL*: Deve apresentar uma descrição da sintaxe da DSL, este descrição
deve conter obrigatoriamente a __gramática__ que foi implementada em notação
__EBNF__ e os __diagramas__ de sintaxe gerados pelo ANTLR. Também devem ser dados
alguns __exemplos__ de “código” da linguagem ilustrando as construções sintáticas.

*Definiição da AST*: Descrição sucinta da estrutura de dados criada para reapresentar
os códigos da linguagem (Abstract Syntax Tree – AST). Esta seção deve conter o
__diagrama de classes__ e uma descrição de cada classe. Não é necessário descrever
cada atributo e cada método. A descrição pode ser feita em alto nı́vel com o
essencial para a compreensão da implementação.

---
Relatório


Introdução:
TamagotchiCat é uma DSL criada para ser utilizada em um jogo que simula o dia a dia de um gato e suas necessidades. O objetivo é ver se o gato permanece vivo depois de um dia, tudo vai depender das escolhas feitas. 
O propósito de construção dessa DSL é aplicar os conceitos estudados sobre criação de linguagens utilizando contextos específicos.
TamagotchiCat
Objetivo: 
Fazer o gato sobreviver um dia
What you can do?
Alimentar: Food and Water, noFood
Brincar: Move, Hide, Hand, High fall
“Nanar”: Yes, No
What cat can do?
Miar: Long, Const, Sundelly, High Up, Snack
Interações possíveis
Se gato mia, pode ser:
Fome
Se não come -1
Sede
Se não bebe -1
Brincar (Atenção)
Se não brinca -1
Carinho
Se não carinho -1
Jogo modo Dormir
Jogo modo Comer
Jogo modo Brincar 
Jogo modo Atenção


