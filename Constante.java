public class Constante extends Simbolo
{
	private CampoTipo tipo;
	private String valor;
	
	public Constante (Atributos atrib)
	{
		super(atrib);
		this.tipo = atrib.getTipo();
		this.valor = atrib.getValor();
	}
	
	public CampoTipo getTipo() {
        return tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setTipo(CampoTipo tipo) {
        this.tipo = tipo;
    }

    public void setValor(String valor) 
	{
        this.valor = valor;
	}
		
	@Override
	public Atributos ObtemAtributos()
	{
		Atributos atrib_aux = new Atributos();
		
		atrib_aux.setIdent(super.ident);
		atrib_aux.setNivel(super.nivel);
		atrib_aux.setCategoria(super.categoria);
		
		atrib_aux.setTipo(this.tipo);
		atrib_aux.setValor(this.valor);
		
		return atrib_aux;
	}
}


