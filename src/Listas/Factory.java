package Listas;
/**
 * 
 * @author luisd
 *
 */
public class Factory {
	
	public Calculadora getMethod(String method){
		if (method.equals("array"))
			return new ArrayListImp();
		else if (method.substring(0, 4).equals("list")){
			if (method.equals("lista"))
				return new ListaSimpleImp();
			else if (method.equals("listadoble"))
				return new ListaDobleImp();
			else if (method.equals("listacircular"))
				return new ListaCircularImp();
		}
		
		return null;
	}

}
