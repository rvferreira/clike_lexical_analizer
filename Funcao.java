public class Funcao extends Simbolo
{
	private Tipo tipo;
	private int ender;
	private int npar;
	
	public Funcao (Tipo tipo, int npar, int ender)
	{
		this.tipo = tipo;
		this.ender = ender;
		this.npar = npar;
	}


}