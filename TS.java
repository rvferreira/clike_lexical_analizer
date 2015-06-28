import java.util.Hashtable;

/*
* TAD - Tabela de Simbolos
*/
public class TS {

	private Hashtable <String, Simbolo> hashtab;
	private Simbolo simbolo;
	
	public TS ()
	{
		hashtab = new Hashtable <String, Simbolo>();
	}
	
	
	public Simbolo Busca(String id)
	{
		if(hashtab.containsKey(id))
		{
			return hashtab.get(id);
			
		}else
		{	
			return null;
		}
		
	}
	
	public boolean Declarado(String id, int nivel)
	{
		/*
		Simbolo =
		if(simbolo.getNivel() == nivel)
		{
			return true;
		}
		else{
			return false;
		}
		*/
		return true;
	}
	
	public boolean Elimina(int nivel)
	{
		//Enumeration elems = new Enumeration();
		//elem = hashtab.elements();
		
		return true;
	}
	
	public boolean Insere(String id, Simbolo simbolo)
	{
		hashtab.put(id, simbolo);
		return true;
		
	}
	
	public boolean Atualiza()
	{
		return true;
	}
	
	
}

