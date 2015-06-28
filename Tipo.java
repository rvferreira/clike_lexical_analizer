
public class Tipo extends Simbolo {

    private CampoTipo tipo;
    private int nbytes;

    public Tipo(Atributos atrib) {
        super(atrib);
        this.nbytes = atrib.getNbytes();
        this.tipo = atrib.getTipo();
    }

    public CampoTipo getTipo() {
        return tipo;
    }

    public int getNbytes() {
        return nbytes;
    }

    public void setTipo(CampoTipo tipo) {
        this.tipo = tipo;
    }

    public void setNbytes(int nbytes) {
        this.nbytes = nbytes;
    }

	@Override
	public Atributos ObtemAtributos()
	{
		Atributos atrib_aux = new Atributos();
		
		atrib_aux.setIdent(super.ident);
		atrib_aux.setNivel(super.nivel);
		atrib_aux.setCategoria(super.categoria);
		
		atrib_aux.setTipo(this.tipo);
		atrib_aux.setNbytes(this.nbytes);
		
		return atrib_aux;
	}
}
