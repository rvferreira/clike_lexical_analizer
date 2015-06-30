import static java.lang.Math.*;

public class Rotinas
{
	private static TS tabela;
	public static String varType;
	public static int endType;
	public static int npar;
	public static Simbolo p_id;
	public static int c_id;
	public static Simbolo pos;
	public static int classet;
	public static String typedefType;
	private static boolean verbose = false;	//Turn on some prints for an awesome debbuging
	
	private static int verificaTipo(String tipo){
		switch(tipo){
			case "int":
				return CampoTipo.INT;
			case "char":
				return CampoTipo.CHAR;    
			case "void":
				return CampoTipo.VOID;
		}
		return -1;
	}

	public Rotinas()
	{
	}
	
	public static void regra0 (){
		if (verbose) System.out.println("regra0");
		pos = null;
		npar = 0;
		tabela = new TS();
		tabela.Insere(SimboloFactory.getInstance(new Atributos("int", tabela.getNivel(), Categoria.TIPO, -1, null, 4, -1, -1, -1, -1)));
		tabela.Insere(SimboloFactory.getInstance(new Atributos("char", tabela.getNivel(), Categoria.TIPO, -1, null, 1, -1, -1, -1, -1)));
		tabela.Insere(SimboloFactory.getInstance(new Atributos("void", tabela.getNivel(), Categoria.TIPO, -1, null, 0, -1, -1, -1, -1)));
	}

	public static void regra3 (String id){
		if (verbose) System.out.println("regra3");
		if (tabela.Declarado(id, tabela.getNivel())){
			System.out.println("Erro: id " + id + " já declarado.");
		}
		Atributos atrib = new Atributos(id, tabela.getNivel(), Categoria.VARIAVEL, verificaTipo(varType), "", -1, -1, -1, -1, -1);
		Simbolo s = SimboloFactory.getInstance(atrib);
		tabela.Insere(s);
	}

	public static void regra5 (String id){
		if (verbose) System.out.println("regra5");
		if (tabela.Declarado(id, tabela.getNivel())){
			System.out.println("Erro: id " + id + " já declarado.");
		}
		Atributos atrib = new Atributos(id, tabela.getNivel(), Categoria.PROCEDIMENTO, CampoTipo.VOID, null, -1, -1, -1, 0, -1);
		tabela.Insere(SimboloFactory.getInstance(atrib));
		tabela.setNivel(tabela.getNivel()+1);
	}

	public static void regra8 (String id){
		if (verbose) System.out.println("regra8");
		tabela.Elimina();
	}

	public static void regra9 (String id){
		if (verbose) System.out.println("regra9");
		Simbolo s = tabela.Busca(id);
		if ((s == null)||(s.getCategoria() != Categoria.TIPO)){
			System.out.println("Erro: Tipo nao definido.");
		}
		
		endType = verificaTipo(typedefType);
	}

	public static void regra13 (String procID){
		if (verbose) System.out.println("regra13");
		pos = tabela.Busca(procID);
	}
	
	public static void regra14 (int valor){
		if (verbose) System.out.println("regra14");
		classet = valor;
	}
	
	public static void regra18 (String id){
		if (verbose) System.out.println("regra18");
		if (tabela.Declarado(id, tabela.getNivel())){
			System.out.println("Erro: id " + id + " já declarado.");
		}
		Atributos atrib = new Atributos(id, tabela.getNivel(), Categoria.PARAMETRO, -1, null, -1, -1, classet, -1, -1);
		tabela.Insere(SimboloFactory.getInstance(atrib));
		npar = npar + 1;
	}

	public static void regra20 (){
		if (verbose) System.out.println("regra20");
		if (pos!=null) ((Procedimento) pos).setNpar(npar);
		npar = 0;		
		
	}

	public static void regra21 (String id){
		if (verbose) System.out.println("regra21");
		Simbolo s = tabela.Busca(id);
		if (s == null){
			System.out.println("Erro: id " + id + " nao declarado.");
		}
		
		c_id = s.getCategoria();
		p_id = s;
		
	}
	
	public static void regra22l (){
		if (verbose) System.out.println("regra22l");
		if ((c_id != Categoria.VARIAVEL)&&(c_id != Categoria.PARAMETRO)){
			System.out.println("Erro: Variavel ou Parametro não definidos.");
		}
	}

	public static void regra23 (){
		if (verbose) System.out.println("regra23");
		npar = npar + 1;
		
	}

	public static void regra24 (){
		if (verbose) System.out.println("regra24");
		if (p_id.getCategoria() == Categoria.PROCEDIMENTO){
			if (((Procedimento) p_id).getNpar() != npar) {
				System.out.println("Erro: Incompatibilidade no numero de parametros.");
			}
		}
		npar = 0;		
	}

	public static void regra25 (){
		if (verbose) System.out.println("regra25");
		if (c_id != Categoria.PROCEDIMENTO){
			System.out.println("Erro: Procedimento nao definido.");
		}
		
	}
	
	public static void regra25l (){
		if (verbose) System.out.println("regra25");
		if ((c_id != Categoria.VARIAVEL)||(c_id != Categoria.PARAMETRO)){
			System.out.println("Erro: Variavel ou Parametro nao definido.");
		}
	}

	public static void regra26 (String number){
		if (verbose) System.out.println("regra26");
		int t = Integer.parseInt(number);
		if ((t<-2147483648)||(t>2147483647)) System.out.println("Erro: Overflow de integer.");
	}
	
	public static void regra27 (String id){
		if (verbose) System.out.println("regra27");
		if (tabela.Declarado(id, tabela.getNivel())){
			System.out.println("Erro: id " + id + " já declarado.");
		}
		
		Atributos atrib = new Atributos(id, tabela.getNivel(), Categoria.TIPO, verificaTipo(typedefType), null, -1, -1, classet, -1, -1);
		tabela.Insere(SimboloFactory.getInstance(atrib));
		
	}
}
