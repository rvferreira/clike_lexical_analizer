public class SimboloFactory 
{
	public static Simbolo getInstance(Atributos atrib)
	{
		
		//TODO -> TAMANHO
		switch (atrib.getCategoria())
		{
			case CONSTANTE:
				return new Constante(Atributos atrib);
				break;
			case TIPO:
				return new Tipo(Atributos atrib);
				break;
			case PARAMETRO:
				return new Parametro(Atributos atrib);
				break;
			case VARIAVEL:
				return new Variavel(Atributos atrib);
				break;
			case PROCEDIMENTO:
				return new Procedimento(Atributos atrib);
				break;
			case FUNCAO:
				return new Funcao(Atributos atrib);
				break;
			default:
				break;
		}
	}
	
	
}