public class SimboloFactory 
{
	public static Simbolo getInstance(Categoria categoria, Tipo tipo, String valor, int nbytes, int ender, int classe_transf, int npar)
	{
		switch (categoria)
		{
			case CONSTANTE:
				return new Constante(tipo, valor);
				break;
			case TIPO:
				return new Tipo(tipo, nbytes);
				break;
			case PARAMETRO:
				return new Parametro(tipo, ender, classe_transf);
				break;
			case VARIAVEL:
				return new Variavel(tipo, ender);
				break;
			case PROCEDIMENTO:
				return new Procedimento(npar, ender);
				break;
			case FUNCAO:
				return new Funcao(tipo, npar, ender);
				break;
			default:
				break; //lança exception
		}
	}
}