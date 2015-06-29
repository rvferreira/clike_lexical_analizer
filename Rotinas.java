public class Rotinas
{
	private TS tabela;

	
	public Rotinas()
	{
		this.tabela = new TS();

	}
	public static void regra0 (String Id){
		if(tabela.Declarado(id,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		Simbolo simbolo = new Simbolo(new Atributos(Id,tabela.getNivel(),));
		tabela.Insere(simbolo);
		
	}
	
	public static void regra0l (){
			
	}
	public static void regra0ll (String Id){
		Simbolo simbolo = new Simbolo(); 
		simbolo = tabela.Busca(Id);
		if((simbolo == null) || simbolo.getCategoria() != Categoria.CONSTANTE)
		{
			System.out.println("ERRO - Constante não definida");
		} else 
		{
			
		}

		
	}
	public static void regra0lll (){
		
		
	}
	public static void regra1 (){
		
		
	}
	
	public static void regra2 (){
			
	}
	public static void regra3 (){
		
		if(tabela.Declarado(id,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		Simbolo simbolo = new Simbolo(new Atributos(Id,tabela.getNivel(),));
		tabela.Insere(simbolo);
		
		
	}
	public static void regra4 (){
		
		
	}	
	public static void regra5 (){
		if(tabela.Declarado(id,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		Simbolo simbolo = new Simbolo(new Atributos(Id,tabela.getNivel(),));
		tabela.Insere(simbolo);
		
	}
	
	public static void regra6 (){
		if(tabela.Declarado(id,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		Simbolo simbolo = new Simbolo(new Atributos(Id,tabela.getNivel(),));
		tabela.Insere(simbolo);
	}
	public static void regra7 (){
		
		
	}
	public static void regra8 (){
		
		
	}	
	public static void regra9 (){
		
		
	}
	
	public static void regra10 (){
			
	}
	public static void regra11 (){
		
		
	}
	public static void regra12 (){
		
		
	}	public static void regra13 (){
		
		
	}
	
	public static void regra14 (){
			
	}
	public static void regra15 (){
		
		
	}
	public static void regra16 (){
		
		
	}
	public static void regra17 (){
		
		
	}
	
	public static void regra18 (){
			
		if(tabela.Declarado(id,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		Simbolo simbolo = new Simbolo(new Atributos(Id,tabela.getNivel(),));
		tabela.Insere(simbolo);
	}
	public static void regra19 (){
		
		
	}
	public static void regra20 (){
		
		
	}
	public static void regra21 (){
		
		
	}
	
	public static void regra22 (){
			
	}
	public static void regra23 (){
		
		
	}
	public static void regra24 (){
		
		
	}
	public static void regra25 (){
		
		
	}
	
	public static void regra25l (){
			
	}
	public static void regra26 (){
		
		
	}
	public static void regra27 (){
		
		
	}

}