public class Rotinas
//String ident, int nivel, int categoria, int tipo,
// String valor, int nbytes, int ender, int classe_transf, int npar, int tamanho
{
	private static TS tabela;

	public Rotinas()
	{
		this.tabela = new TS();
	}

	public static void regra0 (Simbolo s){
		if(tabela.Declarado(s.getIdent(),tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		else
			tabela.Insere(s);
		
	}
	
	public static void regra0l (){
			
	}

	public static void regra0ll (Simbolo simbolo){
		simbolo = tabela.Busca(simbolo.ident);
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

	public static void regra3 (Simbolo s){
		
		if(tabela.Declarado(s.ident,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		tabela.Insere(s);
	}

	public static void regra4 (){
		
		
	}

	public static void regra5 (Simbolo simbolo){
		if(tabela.Declarado(simbolo.ident,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
		tabela.Insere(simbolo);
		
	}
	
	public static void regra6 (Simbolo simbolo){
		if(tabela.Declarado(simbolo.ident,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
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
		
		
	}

	public static void regra13 (){
		
		
	}
	
	public static void regra14 (){
			
	}

	public static void regra15 (){
		
		
	}

	public static void regra16 (){
		
		
	}

	public static void regra17 (){
		
		
	}
	
	public static void regra18 (Simbolo simbolo){
			
		if(tabela.Declarado(simbolo.ident,tabela.getNivel())){
			System.out.println("ERRO - Id já declarado.");
		}
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