package Listas;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author Luis Diego Fernandez
 *
 */
public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String seguirStr = "";
		boolean seguir = true;
		Scanner teclado = new Scanner(System.in);
		
		while (seguir){
			
			String respuesta = "";
			
			while (!respuesta.equals("array") && !respuesta.equals("listas")){
				
				System.out.println("Con que metodo desea realizar los calculos? (Array, Listas)");
				respuesta = teclado.nextLine();
				
				respuesta = respuesta.toLowerCase();
				
				if (!respuesta.equals("array") && !respuesta.equals("listas"))
					System.out.println("Porfavor Ingrese solamente una de las opciones");
				
			}
			
			while (!respuesta.equals("array") && !respuesta.equals("lista") && !respuesta.equals("listadoble") && !respuesta.equals("listacircular")){
				
				System.out.println("Con que metodo desea realizar los calculos con listas? (lista, listaDoble, listaCircular)");
				respuesta = teclado.nextLine();
				
				respuesta = respuesta.toLowerCase();
				
				if (!respuesta.equals("lista") && !respuesta.equals("listadoble") && !respuesta.equals("listacircular"))
					System.out.println("Porfavor Ingrese solamente una de las opciones");
				
			}
			
			Calculadora resultado = new Factory().getMethod(respuesta);
			
			System.out.print("Respuesta utilizando el metodo de " + respuesta + ": ");
			long startTime = System.currentTimeMillis();
			System.out.println(resultado.method());
			long finishTime = System.currentTimeMillis();
			long time = finishTime - startTime;
			System.out.println("Tiempo tomado: " + time + "ms");
			
			System.out.println("Desea hacer otro calculo con otro metodo (Y/N)");
			seguirStr = teclado.nextLine();
			seguirStr.toLowerCase();
			
			if (seguirStr.equals("y") || seguirStr.equals("n"))
				seguir = true;
			
			else 
				seguir = false;
			
			System.out.println("");
		}

	}

}
