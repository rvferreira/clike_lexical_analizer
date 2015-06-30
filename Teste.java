//ident, nivel, categoria, tipo, valor, nbytes, ender, classe_transf, npar, tamanho
public class Teste
{ 	

	public static void main(String[] args)
	{
		Rotinas R = new Rotinas();

		Atributos atributos = new Atributos ("int",0,Categoria.TIPO,CampoTipo.INT,"0",4,0,0,0,0);
		Simbolo simbolo = SimboloFactory.getInstance(atributos);
		
	}
}