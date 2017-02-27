/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author OscarIvan
 */
public class ListaDoble <V> 
{
    protected NodoDoble Cabeza;
    
    
    public void AgregarNodoCabeza(V valor)
    {
    	try{
    		
    		NodoDoble NuevoNodo = new NodoDoble( valor);
    		NuevoNodo.setSiguiente(Cabeza);
    		Cabeza.setAnterior(NuevoNodo);
    		Cabeza = NuevoNodo;    
    		
    	} catch (Exception w){
    		AgregarNodo(valor);
    	}
    }
    
    
    public void AgregarNodo(V valor)
    {
        NodoDoble Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if ( Cola== null)
            Cabeza = new NodoDoble (valor);
        else
        {             
            Cola.setSiguiente(new NodoDoble(valor));                                            
            Cola.getSiguiente().setAnterior(Cola);            
        }
        
    }
    
    
    public NodoDoble EliminarNodo()
    {
        NodoDoble NodoADevolver = Cabeza; 
        Cabeza = Cabeza.getSiguiente();
        if (Cabeza != null)
            Cabeza.setAnterior(null);
        return NodoADevolver;
    
    }
    
    public String ObtenerCabeza()
    {
        return Cabeza.getValor().toString();
    }
    
    public NodoDoble ObtenerUltimo()
    {
        NodoDoble NodoActual = Cabeza;
        if (NodoActual == null)
            return null;
        while (NodoActual.getSiguiente() !=  null)
        {
            NodoActual = (NodoDoble) NodoActual.getSiguiente();
            
        }
        return NodoActual;        
    }
    
        public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            NodoDoble NodoActual = Cabeza;
            while (NodoActual!= null)
            {
                sb.append(NodoActual.getValor());
                sb.append ("->");
                NodoActual = NodoActual.getSiguiente();
            }            
        }
        sb.append("null");
        return sb.toString();
    }
}
