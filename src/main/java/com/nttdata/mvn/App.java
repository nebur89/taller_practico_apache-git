package com.nttdata.mvn;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

/** @author Rubén Barragán Pérez */


/** Clase principal de la api App */
 
public class App {
	
	//Listado tipo String de la clase principal
	private static final List<String> list = new ArrayList<>(Arrays.asList("hola", null, "este", null, "es", null, " mi", null, "primer", null, "proyecto" ));
	
	
	
	/** Metodo principal de la clase
	 * @param args
	 * */
    public static void main( String[] args ){
  
    	//Llamada al metodo imprimir por consola, pasamos como parametro la "list" de la clase principal
    	imprimirPorConsola(list);
    	
    }
    
    
    
    
    /** Este metodo imprime por pantalla el contenido de la lista, en el caso de ser nulo imprime " * ".
     * Es solo un metodo de prueba para la el uso del metodo StringUtils.isEmpty perteneciente a la
     * dependencia org.apache.commons anexada en el pom.
     * 
	 * @param List<String> */
    public static void  imprimirPorConsola(List<String> lista) {
    	
      	
      	for (String dato : lista) {
  		
      		//Aqui utilizamos el metodo tringUtils.isEmpty de common 
      	 	if(StringUtils.isEmpty(dato)) {
      	 		
      	 		System.out.print(" * ");
      	 	}
      	 	else {
      	 		System.out.print( dato);
      	 	}
  		}
     
    	
  
        
   }
}
