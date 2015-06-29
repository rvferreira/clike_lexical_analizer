public class SimboloFactory 
{
	public static Simbolo getInstance(Atributos atrib)
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