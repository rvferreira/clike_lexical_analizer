public class Parametro extends Simbolo
{
	private Tipo tipo;
	private int ender;
	private int classe_transf;
	
	public Parametro (Tipo tipo, int ender, int classe_transf)
	{
		this.tipo = tipo;
		this.ender = ender;
		this.classe_transf = classe_transf;
	}


}