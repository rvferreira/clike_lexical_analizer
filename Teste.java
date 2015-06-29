//ident, nivel, categoria, tipo, valor, nbytes, ender, classe_transf, npar, tamanho
public class Teste
{ 	

	public static void main(String[] args)
	{
		TS tabela = new TS();
		
		Atributos atributos = new Atributos ("int",0,Categoria.TIPO,CampoTipo.INT,"0",4,0,0,0,0);
		Simbolo simbolo = SimboloFactory.getInstance(atributos);
		tabela.Insere(simbolo);

		Atributos atributos2 = new Atributos ("int",3,Categoria.TIPO,CampoTipo.INT,"0",4,0,0,0,0);
		Simbolo simbolo2 = SimboloFactory.getInstance(atributos2);
		tabela.Insere(simbolo2);

		Atributos atributos3 = new Atributos ("float",0,Categoria.TIPO,CampoTipo.INT,"0",4,0,0,0,0);
		Simbolo simbolo3 = SimboloFactory.getInstance(atributos3);
		tabela.Insere(simbolo3);
	}
}