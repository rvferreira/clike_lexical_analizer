public abstract class Simbolo {
				

	protected String ident;
	protected int nivel;
	protected int categoria;
	
	
	public Simbolo (Atributos atrib)
	{
		this.ident = atrib.getIdent();
		this.nivel = atrib.getNivel();
		this.categoria = atrib.getCategoria();
	}
	
	public String getIdent(){
		return ident;
	}

	public int getNivel(){
		return nivel;
	}
	
	public int getCategoria(){
		return categoria;
	}

	public void setIdent(String ident) {
		this.ident = ident;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	
	public abstract Atributos ObtemAtributos();
}
