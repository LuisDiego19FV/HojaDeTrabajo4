/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author Luis Diego Fernandez
 * 
 */
public class StackDoble<W extends Comparable> {
    ListaDoble <W>lista;
    
    
    public StackDoble()
    {	
    	lista = new <W>ListaDoble();
    }
    public void Push(W valor)
    {
        lista.AgregarNodoCabeza(valor);
    }
    
    public String Get(){
    	if(lista.Cabeza != null)
    		return (lista.ObtenerCabeza().toString());
    	
    	else
    		return "null";
    }
    
    public NodoDoble Pop()
    {
        return lista.EliminarNodo();
    }
    
    public String toString()
    {
        return lista.toString();
    }

}
