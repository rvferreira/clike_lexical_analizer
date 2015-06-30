# C-Like Semantic Analizer

## Funcionalidade

Este é um analizador semântico para a Linguagem C-like. Encontra erros semanticos no codigo, sem interromper a compilacao. Logo, os erros apos o primeiro podem nao ser validos.

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
						    	*. sendo que alguns arquivos teste sao providenciados na pasta Testes. Ex: `java AnalSin < Testes_semanticos/teste1.txt`

## TAD Tabela de Símbolos: classes
	Descrição das classes utilizadas.

### TS
	Classe que representa a tabela de símbolos.
#### Parametros:
	- private List<Hashtable<String, Simbolo>> hashtab : Lista de hashtables de símbolos, onde cada elemento é um nível da TS.
	- private Simbolo simbolo : 
	- public static int nivel : Nível atual da TS.
#### Metodos:
	- public TS() : Construtor da TS. Instancia a lista de hashtables.
	- public Simbolo Busca(String id) : Busca um simbolo na TS dado um identificador, começando pelo nivel atual.
	- public boolean Declarado(String id, int nivel) : Verifica se um dado identificador está declarado no dado nível.
	- public boolean Elimina(int nivel) : Elimina o dado nivel e retorna True se bem sucedido, False caso contrário.
	- public boolean Insere(Simbolo simbolo) : Insere um símbolo na TS e retorna True se bem sucedido, False caso contrário.
	- public void SetaAtributos(Simbolo simbolo, Atributos atrib) : Inicializa um dado simbolo como os atributos dados.

### SimboloFactory
	Classe que instancia um objeto Simbolo de acordo com a categoria requerida.
#### Parametros:
	- Nao tem.
#### Metodos:
	- public static Simbolo getInstance(Atributos atrib) : Retorna um objeto de uma classe filha de Simbolo de acordo com a categoria encontrada em Atributos.

### Simbolo
	Classe que representa um simbolo, ou seja, uma linha da TS.
#### Parametros:
	protected String ident : Identificador do simbolo.
	protected int nivel : Nivel (ou escopo) do simbolo.
	protected int categoria : Categoria do simbolo.
#### Metodos:
	- public Simbolo (Atributos atrib) : Construtor. Seta os atributos ident, nivel e categoria, comuns a todos os tipos de Simbolos.
	- public String getIdent() : Retorna o identificador do Simbolo.
	- public int getNivel() : Retorna o nivel. 
	- public int getCategoria() : Retorna a categoria.
	- public void setIdent(String ident) : Seta o identificador.
	- public void setNivel(int nivel) : Seta o nivel.
	- public void setCategoria(int categoria) : Seta a categoria.
	- public abstract Atributos ObtemAtributos() : Deve ser implementada pela classes filhas. Retorna os atributos do simbolo.

### Atributos
	Classe que guarda os campos de um Simbolo.
#### Parametros:
	- private String ident : Campo identificador.
	- private int nivel : Campo nivel.
	- private int categoria : Campo categoria.
	- private int tipo : Campo tipo.
	- private String valor : Campo valor.
	- private int nbytes: Campo numero de bytes.
	- private int ender : Campo endereco.
	- private int classe_transf : Campo classe de transferencia.
	- private int npar : Campo numero de parametros.
	= private int tamanho : Campo tamanho.
#### Metodos:
	- public Atributos(String ident, int nivel, int categoria, int tipo, String valor, int nbytes, int ender, int classe_transf, int npar, int tamanho) : Construtor.

### CampoTipo
	Classe que mapeia dos tipos (VOID, INT, CHAR) possíveis para um Simbolo.
#### Parametros:
	- Nao tem.
#### Metodos:
	- Nao tem.

### Categoria
	Classe que mapeia as categorias (TIPO, CONSTANTE, PROCEDIMENTO, FUNCAO, PARAMETRO, VARIAVEL) possíveis para um Simbolo.
#### Parametros:
	- Nao tem.
#### Metodos:
	- Nao tem.

### Constante
	Classe filha de Simbolo, representa uma Constante.
#### Parametros:
	private int tipo : Tipo da Constante.
	private String valor : Valor da Constante.
#### Metodos:
	- public Constante (Atributos atrib) : Construtor.
		
	- @Override public Atributos ObtemAtributos() : Retorna atributos da Constante.

### Funcao
	Classe filha de Simbolo, representa uma Funcao.
#### Parametros:
	- private int tipo
	- private int ender
	- private int npar
#### Metodos:
	- @Override public Atributos ObtemAtributos()

### Parametros:
	Classe filha de Simbolo, representa um Parametro.
#### Parametros:
    private int tipo
    private int ender
    private int classe_transf
#### Metodos:
	- @Override public Atributos ObtemAtributos()

### Procedimento
	Classe filha de Simbolo, representa um Procedimento.
#### Parametros:
    private int npar
    private int ender
#### Metodos:
	- @Override public Atributos ObtemAtributos()

### Tipo
	Classe filha de Simbolo, representa um Tipo.
#### Parametros:
    private int tipo
    private int nbytes
#### Metodos:
	- @Override public Atributos ObtemAtributos()

### Variavel
	Classe filha de Simbolo, representa uma Variavel.
#### Parametros:
    private int tipo
    private int ender
#### Metodos:
	- @Override public Atributos ObtemAtributos()

### Rotinas
	Classe que contém as regras que compoem as rotinas semanticas.
#### Parametros:
#### Metodos:


## Testes
	Apresentamos uma bateria de testes para ilustrar o comportamento do analisador semântico. Enquanto o primeira teste apresenta casos de uso válidos, os demais mostram possíveis erros detectados.

###Teste 1
	Exemplo de programa fonte reconhecido como correto pelo Analizador Semântico.

###Teste 2

	A variável usada não foi declarada previamente.

###Teste 3

	Função utiliza um parâmetro não existente (ou variável não declarada).

###Teste 4

	Variável com tipo inexistente.

###Teste 5

	Parâmetro com tipo inexistente.

###Teste 6

	Dois parâmetros são dados a uma função que recebe apenas um.

###Teste 7

	Um parâmetros é dado a uma função que recebe dois.

###Teste 8

	Declaracao tardia da funcao.

###Teste 9

	Uso do TYPEDEF com um tipo inexistente.

###Teste 10

	Uso de um TYPEDEF inexistente no escopo.


## Correção
	Na regra 22' das rotinas semanticas fornecidas, note que a verificação (c_id <> variavel OU c_id <> parametro) sempre será verdadeira. O correto seria (c_id <> variavel AND c_id <> parametro).
