# LeAnal - C-Like Lexical Analizer

## Funcionalidade

Este é um analizador lexico para a Linguagem C-like

## Autoria

Trabalho desenvolvido dentro das dependencias da USP Sao Carlos, na disciplina SCC605, Teoria da Computacao e Compiladores, sob orientacao da professora Sandra Aluisio pelos alunos:

    Lais Pessine		laispc19@gmail.com 
    Roberto Freitas		roberto.martinsdefreitas@gmail.com
    Raphael Ferreira	raphael.rvf@gmail.com

Copyright: Use à vontz! Mas mantenha a autoria =)

## Instrucoes de uso

1. Compile o arquivo usando o javaCC: `javacc AnalSin.jj`

2. Compile os arquivos java: `javac *.java`

3. Rode o caso teste desejado: `java AnalSin < caminho/para/arquivoteste`
    *. sendo que alguns arquivos teste sao providenciados na pasta Testes. Ex: `java AnalSin < Testes/teste1.txt`

## Arquivos teste

### teste1.txt
Arquivo que compila com sucesso e exemplifica o reconhecimento da maioria dos tokens da linguagem.

### teste2.txt
Falha na declaracao de variaveis. Atribuicao junto com declaracao.

### teste3.txt
Declaração de typedef inválida com três argumentos.

### teste4.txt
Falta de ponto e vírgula.

### teste5.txt
Falta um operador para que a expressão seja válida.

### teste6.txt
Declaração 'else' não fechada.

### teste7.txt
Falta de parâmetros para o 'while' 


