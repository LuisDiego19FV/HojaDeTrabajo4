/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Listas;

/**
 *
 * @author OscarIvan
 * @param <W>
 */
public class ListaCircular<W> 
{
    NodoCircular Cabeza;
    
    public void AgregarNodoCabeza(W valor)
    {
    
    	NodoCircular NuevoNodo = new NodoCircular( valor);
    	NuevoNodo.setSiguiente(Cabeza);
    	NuevoNodo.setAnterior(Cabeza.getAnterior());
    	Cabeza.setAnterior(NuevoNodo);
    	Cabeza = NuevoNodo;        
    	
    }
    
    
    
    public void AgregarNodo(W valor)
    {
        NodoCircular Cola = ObtenerUltimo();
        //si no existe ningun nodo, crea la cabeza, de lo contrario agrega el nuevo Nodo al siguiente de la cola
        if ( Cola== null)
        {
            Cabeza = new NodoCircular(valor);
            Cabeza.setCabeza(true);
            Cabeza.setSiguiente(Cabeza);
            Cabeza.setAnterior(Cabeza);
        }
        else
        {             
            Cola.setSiguiente(new NodoCircular(valor));                                            
            Cola.getSiguiente().setAnterior(Cola);
            
            Cola.getSiguiente().setSiguiente(Cabeza);
            Cabeza.setAnterior(Cola.getSiguiente());
            
        }
        
    }
    
    
    
    public NodoCircular ObtenerCabeza()
    {
        return Cabeza;
    }
    public NodoCircular ObtenerUltimo()
    {
        NodoCircular NodoActual = Cabeza;
        if (NodoActual == null)
            return null;
        return (NodoCircular) Cabeza.getAnterior();
    }
    
    
    
    public NodoCircular EliminarNodo()
    {   
        if (Cabeza == Cabeza.getSiguiente())
            return null;
        Cabeza.getSiguiente().setAnterior(Cabeza.getAnterior());
        Cabeza.getAnterior().setSiguiente(Cabeza.getSiguiente());                
        Cabeza.getSiguiente().setCabeza(true);
        NodoCircular NodoADevolver = Cabeza;
        Cabeza = Cabeza.getSiguiente();                        
        return NodoADevolver;    
    }
    
    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        if (Cabeza != null)
        {
            NodoCircular NodoActual = Cabeza;
            do
            {
                sb.append(NodoActual.getValor());
                sb.append ("->");
                NodoActual = NodoActual.getSiguiente();
            }
            while (!NodoActual.IsCabeza());
        }
        sb.append("null");
        return sb.toString();

    }
    
}
