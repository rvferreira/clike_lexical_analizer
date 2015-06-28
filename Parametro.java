public class Parametro extends Simbolo {

    private CampoTipo tipo;
    private int ender;
    private int classe_transf;

    public Parametro(Atributos atrib) {
        super(atrib);
        this.tipo = atrib.getTipo();
        this.ender = atrib.getEnder();
        this.classe_transf = atrib.getClasse_transf();
    }

    public CampoTipo getTipo() {
        return tipo;
    }

    public int getEnder() {
        return ender;
    }

    public int getClasse_transf() {
        return classe_transf;
    }
	
	@Override
	public Atributos ObtemAtributos()
	{
		Atributos atrib_aux = new Atributos();
		
		atrib_aux.setIdent(super.ident);
		atrib_aux.setNivel(super.nivel);
		atrib_aux.setCategoria(super.categoria);
		
		atrib_aux.setTipo(this.tipo);
		atrib_aux.setEnder(this.ender);
		atrib_aux.setClasse_tranf(this.classe_transf);
		
		return atrib_aux;
	}
		
}