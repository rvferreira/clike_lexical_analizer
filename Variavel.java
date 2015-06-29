public class Variavel extends Simbolo {

    private int tipo;
    private int ender;

    public Variavel(Atributos atrib) {
        super(atrib);
        this.tipo = atrib.getTipo();
        this.ender = atrib.getEnder();
    }

    public int getTipo() {
        return tipo;
    }

    public int getEnder() {
        return ender;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setEnder(int ender) {
        this.ender = ender;
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
		
		return atrib_aux;
	}
}
