public class Funcao extends Simbolo
{
	private int tipo;
	private int ender;
	private int npar;
	
	public Funcao (Atributos atrib)
	{
		super(atrib);
		this.tipo = atrib.getTipo();
		this.ender = atrib.getEnder();
		this.npar = atrib.getNpar();
	}

        public int getTipo() {
            return tipo;
        }

        public int getEnder() {
            return ender;
        }

        public int getNpar() {
            return npar;
        }

        public void setTipo(int tipo) {
            this.tipo = tipo;
        }

        public void setEnder(int ender) {
            this.ender = ender;
        }

        public void setNpar(int npar) {
            this.npar = npar;
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
			atrib_aux.setNpar(this.npar);
			
			return atrib_aux;
		}
        
}