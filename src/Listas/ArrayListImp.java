
package Listas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * 
 * @author Luis Diego Fernandez (16344)
 * @version 26.02.2017
 *
 */

public class ArrayListImp implements Calculadora {
	
	private ArrayList<String> array;
	private int returnRes;
	
	@Override
	public int method() {
		
		
		String cadena;
		array = new ArrayList<String>();
		
		try {
			FileReader lecT = new FileReader(System.getProperty("user.dir") + "/datos.txt");
			BufferedReader buff = new BufferedReader(lecT);
			
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
	            	
	            	array.add(cadena.substring(n, n + digits));
	            	n = n + digits;
	            }
				
			}
			
		} catch (Exception IOException){
			
		}
		
		if(array.get(0) != null){
        	//Se inicializan las variables a utilizar.
			ArrayList<Integer> momentaryArray = new ArrayList<Integer>();
        	int result = Integer.parseInt((String) array.get(0));
        	boolean operation = false;
        	String operant = "";
        	
        	array.remove(0);
        	
        	while (operation == false){
        		
        		try{
        			//Siempre que se puda se agregara nuevos valores a momentaryStack, hasta que encuentre un
        			// operando
        			momentaryArray.add(Integer.parseInt(array.get(0).toString()));
        			array.remove(0);
        			
        		} catch(Exception e){
        			//El catch se encarga de que a la hora de encontrar un operando, se operen todos los 
        			// valores en momentaryStack utilizando dicho operando. Y quita todos los nodos utilizados
        			// en momentaryStack.
        			try {
        				operant = (String) array.get(0);
        				
        			} catch (Exception d) {
        				
        				operation = true;
            			returnRes = result;
        			
        			}
        			
        			if (operant.equals("+")){
        				
        				while (!(momentaryArray.isEmpty())){
        					result += Integer.parseInt(momentaryArray.get(0).toString());
        					momentaryArray.remove(0);
        				}
        			}
        			
        			else if (operant.equals("-")){
        				
        				while (!(momentaryArray.isEmpty())){
        					result -= Integer.parseInt(momentaryArray.get(0).toString());
        					momentaryArray.remove(0);
        				}
        			}
        			
        			else if (operant.equals("*")){
        				
        				while (!(momentaryArray.isEmpty())){
        					result = result * Integer.parseInt(momentaryArray.get(0).toString());
        					momentaryArray.remove(0);
        				}
        			}
        			
        			else if (operant.equals("/")){
        				
        				while (!(momentaryArray.isEmpty())){
        					result = result / Integer.parseInt(momentaryArray.get(0).toString());
        					momentaryArray.remove(0);
        				}
        			}
        			
        			try {
        				array.remove(0);
        			} catch(Exception d){
        				
        			}
        				
        			
        		}
        		
        	}
        	
        }
		
		return returnRes;
	}

}

