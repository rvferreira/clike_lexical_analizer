public class Atributos
{
	private String ident;
	private int nivel;
	private int categoria;
	private int tipo;
	private String valor;
	private int nbytes;
	private int ender;
	private int classe_transf;
	private int npar;
	private int tamanho;
	
	public Atributos()
	{
		this.ident = null;
		this.nivel = -1;
		this.categoria = -1;		
		this.tipo = -1;
		this.valor = null;
		this.nbytes = -1;
		this.ender = -1;
		this.classe_transf = -1;
		this.npar = -1;
		this.tamanho = -1;
	}
	
	public Atributos(String ident, int nivel, int categoria, int tipo, String valor, int nbytes, int ender, int classe_transf, int npar, int tamanho)
	{
		this.ident = ident;
		this.nivel = nivel;
		this.categoria = categoria;		
		this.tipo = tipo;
		this.valor = valor;
		this.nbytes = nbytes;
		this.ender = ender;
		this.classe_transf = classe_transf;
		this.npar = npar;
		this.tamanho = tamanho;
		
	}

	public String getIdent(){
		return ident;
	}
	
	public int getNivel(){
		return nivel;
	}
	
    public int getCategoria() {
        return categoria;
    }

    public int getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public int getNbytes() {
        return nbytes;
    }

    public int getEnder() {
        return ender;
    }

    public int getClasse_transf() {
        return classe_transf;
    }

    public int getNpar() {
        return npar;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setNbytes(int nbytes) {
        this.nbytes = nbytes;
    }

    public void setEnder(int ender) {
        this.ender = ender;
    }

    public void setClasse_transf(int classe_transf) {
        this.classe_transf = classe_transf;
    }

    public void setNpar(int npar) {
        this.npar = npar;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
	
	public void setIdent (String ident) {
        this.ident = ident;
    }
	
	public void setNivel (int nivel) {
        this.nivel = nivel;
    }


}