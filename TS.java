import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;

/*
* TAD - Tabela de Simbolos
*/
public class TS {

    private List<Hashtable<String, Simbolo>> hashtab;
    private Simbolo simbolo;
    public static int nivel;


    public TS() {
        hashtab = new ArrayList<Hashtable<String, Simbolo>>();
        hashtab.add(new Hashtable<String, Simbolo>());                        //cria nivel 0
        this.nivel = 0;
    }


    public Simbolo Busca(String id) {
        Simbolo simbolo_aux = null;
        for (int i = hashtab.size() - 1; i >= 0; i--) {
            simbolo_aux = (hashtab.get(i)).get(id);

            if (simbolo_aux != null)
                break;

        }

        return simbolo_aux;
    }

    public boolean Declarado(String id, int nivel) {
        try {
            if (hashtab.get(nivel).get(id) == null) {
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            return false;
        }
    }

    public boolean Elimina(int nivel) {
        try {
            hashtab.get(this.nivel).clear();
            hashtab.remove(nivel);
            this.nivel = this.nivel - 1;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }

    public boolean Insere(Simbolo simbolo) {

        if (simbolo.getNivel() > this.nivel) {
            for (int i = 0; i < simbolo.getNivel() - this.nivel; i++)
                hashtab.add(new Hashtable<String, Simbolo>());

            this.nivel = simbolo.getNivel();

        } else if (simbolo.getNivel() < this.nivel) {

            int aux = this.nivel;
            for (int i = 0; i < (aux - simbolo.getNivel()); i++) {
                Elimina(nivel);
            }
        }

        try {
            Hashtable hash_aux = (Hashtable) hashtab.get(simbolo.getNivel());
            hash_aux.put(simbolo.getIdent(), simbolo);
            hashtab.set(simbolo.getNivel(), hash_aux);
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

        return true;

    }

    public void SetaAtributos(Simbolo simbolo, Atributos atrib) {
        simbolo = SimboloFactory.getInstance(atrib);
    }

}

