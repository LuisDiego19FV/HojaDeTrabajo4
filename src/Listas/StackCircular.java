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
public class StackCircular<W extends Comparable> {
    ListaCircular lista;
    
    
    public StackCircular()
    {	
    	lista = new <W>ListaCircular();
    	lista.AgregarNodo("");
    	
    }
    public void Push(W valor)
    {
        lista.AgregarNodoCabeza(valor);
    }
    
    public String Get(){
    	
        return (lista.ObtenerCabeza().getValor().toString());	
    
    }
    
    public NodoCircular Pop()
    {
        return lista.EliminarNodo();
    }
    
    public String toString()
    {
        return lista.toString();
    }

}
