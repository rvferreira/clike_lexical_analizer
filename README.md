# C-Like Semantic Analizer

## Funcionalidade

Este é um analizador semântico para a Linguagem C-like.

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
#### Parametros:
	Nao tem.
#### Metodos:
	- public static Simbolo getInstance(Atributos atrib) : Retorna um objeto de uma classe filha de Simbolo.
	{

		if(atrib.getCategoria() == Categoria.TIPO)
		{
			return new Tipo(atrib);
		}
		else if (atrib.getCategoria() == Categoria.CONSTANTE)
		{
			return new Constante(atrib);
		}
		else if (atrib.getCategoria() == Categoria.PARAMETRO)
		{
			return new Parametro(atrib);
		}
		else if (atrib.getCategoria() == Categoria.VARIAVEL)
		{
			return new Variavel(atrib);
		}
		else if (atrib.getCategoria() == Categoria.PROCEDIMENTO)
		{
			return new Procedimento(atrib);
		}
		else if (atrib.getCategoria() == Categoria.FUNCAO)
		{
			return new Funcao(atrib);
		}
		else
		{
				System.out.println("ERRO - Categoria não encontrada!");
				return null;
		}

	}
	
	
}

### Simbolo
	Classe que representa um simbolo, ou seja, uma linha da TS.
#### Parametros:
	protected String ident : Identificador do simbolo.
	protected int nivel : Nivel (ou escopo) do simbolo.
	protected int categoria : Categoria do simbolo.

#### Metodos:
	- public Simbolo (Atributos atrib) : Construtor. Seta os atributos ident, nivel e categoria, comuns a todos os tipos de simbolos.
	
	- public String getIdent() : Retorna o identificador do simbolo.

	- public int getNivel() : Retorna o nivel. 
	
	- public int getCategoria() : Retorna a categoria.

	- public void setIdent(String ident) : Seta o identificador.

	- public void setNivel(int nivel) : Seta o nivel.

	- public void setCategoria(int categoria) : Seta a categoria.
	
	- public abstract Atributos ObtemAtributos() : Deve ser implementada pela classes filhas. Retorna os atributos do simbolo.

### Atributos
#### Parametros:
#### Metodos:

### CampoTipo
#### Parametros:
#### Metodos:

### Categoria
#### Parametros:
#### Metodos:

### Constante
#### Parametros:
#### Metodos:

### Funcao
#### Parametros:
#### Metodos:

### Parametro
#### Parametros:
#### Metodos:

### Procedimento
#### Parametros:
#### Metodos:

### Tipo
#### Parametros:
#### Metodos:

### Variavel
#### Parametros:
#### Metodos:

### Rotinas
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
