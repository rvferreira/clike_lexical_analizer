enum Categoria {
	CONSTANTE, TIPO, PROCEDIMENTO, FUNCAO, PARAMETRO, VARIAVEL
}

enum Tipo {
	INT, FLOAT, CHAR
}

public abstract class Simbolo {
				
	private String ident;
	private int nivel;
	private Categoria categoria;

	

	private int nbytes;
	private String valor;
	private int tamanho;
	private int npar;	
	
	public Simbolo()
	{}
	
	public Simbolo (String ident, int nivel, Categoria categoria, Tipo tipo)
	{
		this.ident = ident;
		this.nivel = nivel;
		this.categoria = categoria;
	}
	



}
