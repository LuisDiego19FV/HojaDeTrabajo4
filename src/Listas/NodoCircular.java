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
public class NodoCircular<T>{
    
    protected T  Valor;     
    protected NodoCircular Siguiente;
    protected NodoCircular Anterior;
    protected boolean Cabeza;

    public NodoCircular(T valor) {
        this.Valor = valor;
    }  
       public void setSiguiente(NodoCircular siguiente)
    {
        this.Siguiente = siguiente;
    }
    
       
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    public T getValor()
    {
        return this.Valor;
    } 
    
    
    public NodoCircular getSiguiente()
    {
        return this.Siguiente;
    }
    public void setAnterior(NodoCircular siguiente)
    {
        this.Anterior = siguiente;
    }
    
    
    public NodoCircular getAnterior()
    {
        return this.Anterior;
    }
    
    public void setCabeza(boolean cabeza)
    {
        Cabeza = cabeza;
    }
    
    public boolean IsCabeza()
    {
        return Cabeza;
    }
       
}
