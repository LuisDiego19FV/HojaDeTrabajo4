/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author OscarIvan
 */
public class Stack<W extends Comparable> {
    Lista <W>lista;
    
    
    public Stack()
    {	
    	lista = new <W>Lista();
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
    
    public Nodo Pop()
    {
        return lista.EliminarNodo();
    }
    
    public String toString()
    {
        return lista.toString();
    }

}
