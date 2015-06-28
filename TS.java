import java.util.Hashtable;
import java.util.ArrayList;
import java.util.List;



/*
* TAD - Tabela de Simbolos
*/
public class TS {

	private List<Hashtable<String,Simbolo>> hashtab;
	private Simbolo simbolo;
	
	public TS ()
	{
		hashtab = new ArrayList<Hashtable<String,Simbolo>>();
		hashtab.add(new Hashtable<String, Simbolo> ());						//cria nivel 0
	}
	
	
	public Simbolo Busca(String id)
	{
		Simbolo simbolo_aux = null;
		
		for(int i = hashtab.size() - 1; i >= 0 ; i--)
		{
			simbolo_aux = hashtab.get(i).get(id); 
		
			if(simbolo != null)
				break;
			
		}
		
		return simbolo_aux;
	}
	
	public boolean Declarado(String id, int nivel)
	{
		if(hashtab.get(nivel).get(id) == null)
		{
			return false;
		} else 
		{
			return true;
		}

	}
	
	public boolean Elimina(int nivel)
	{
		try{
			hashtab.remove(nivel);
		} catch( Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
	}
	
	public boolean Insere(String id, Simbolo simbolo)
	{
		try{
			Hashtable hash_aux = (Hashtable) hashtab.get(hashtab.size()-1);
			hash_aux.put(id, simbolo);
			hashtab.set(hashtab.size()-1,hash_aux);
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		return true;
		
	}
	
	public void SetaAtributos(Simbolo simbolo, Atributos atrib)
	{
	
	
	}
	
}

