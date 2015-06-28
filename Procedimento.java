
public class Procedimento extends Simbolo {

    private int npar;
    private int ender;

    public Procedimento(Atributos atrib) {
        super(atrib);
        this.npar = atrib.getNpar();
        this.ender = atrib.getEnder();
    }

    public int getNpar() {
        return npar;
    }

    public int getEnder() {
        return ender;
    }

    public void setNpar(int npar) {
        this.npar = npar;
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
		
		atrib_aux.setEnder(this.ender);
		atrib_aux.setNpar(this.npar);
		
		return atrib_aux;
	}
		
}
