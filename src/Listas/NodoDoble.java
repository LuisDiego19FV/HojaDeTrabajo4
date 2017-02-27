/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

import java.util.HashSet;

/**
 *
 * @author OscarIvan
 */
public class NodoDoble <T> {
    protected T  Valor; 
    protected NodoDoble Siguiente; 
    protected NodoDoble Anterior;

    public NodoDoble(T valor) {
        this.Valor = valor;
    }

    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    public T getValor()
    {
        return this.Valor;
    } 
    
    
    public void setSiguiente(NodoDoble siguiente)
    {
  
    	this.Siguiente = siguiente;
    	siguiente.setAnterior(this);        
    		
    }
    
    
    public NodoDoble getSiguiente()
    {
        return this.Siguiente;
    }
    
    public void setAnterior(NodoDoble anterior)
    {
        this.Anterior = anterior;
    }
    
    public NodoDoble getAnterior()
    {
        return this.Anterior;
    }
    
}
