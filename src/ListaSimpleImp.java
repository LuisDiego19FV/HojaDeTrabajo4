/**
 * 
 */
package Listas;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 * 
 * @author Luis Diego Fernadez
 * @version 26.02.2017
 *
 */
public class ListaSimpleImp implements ListaInterface {
	private int calculado;
	private Stack stack;

	@Override
	public int method() throws IOException {
		// TODO Auto-generated method stub
		String cadena;
		
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("js");
		
		//Se lee el archivo datos.txt
		FileReader lecT = new FileReader(System.getProperty("user.dir") + "/datos.txt");
		BufferedReader buff = new BufferedReader(lecT);
		
		stack = new Stack();
		calculado = 0;
		Stack momentaryStack = new Stack();
		
		//Ciclo while para meter los valores a utilizar, incluyendo los enteros como los operandos.
        while((cadena = buff.readLine())!=null) {
        	int n = 0;
      
            while(n < cadena.length()){
            	int digits = 1;
            	
            	if (!cadena.substring(n, n+1).equals(" ")){
            		
            		try{
            			while (!cadena.substring(n + digits, n + digits + 1).equals(" ")){
            				digits++;
            			}
            			
            		} catch (Exception e){
            			
            		}
            		
            	}
            	
            	stack.Push((cadena.substring(n, n + digits)));
            	n = n + digits;
            }
            
        }
        
        buff.close();
		
        try {
			calculado =  (int) engine.eval(operando());
		} catch (ScriptException e) {
			// TODO Auto-generated catch block
		};
		
		
		return calculado;
	}
	
	public String operando(){
		boolean numeros = true;
		String operador = stack.Get();
		String resultado = "";
		stack.Pop();
		
		while (numeros){
			try {
				
				if (!stack.Get().equals(" ")) {
					
					resultado = resultado + operador.toString() + Integer.parseInt(stack.Get());
					stack.Pop();
					
				}
				
				else {
					stack.Pop();
				}
				
			} catch (Exception e){
				if (stack.Get() != " "){
					
					operador = stack.Get();
					
					if (operador == "null")
						numeros = false;
					else
						stack.Pop();
					
				}
				
			}
		}
		
		return resultado.substring(1);
	}

}
