
package Ejercicios;

import java.util.Scanner;

public class Ej4 {
    public void Viaje (){
        int n, precio = 0, roam = 0;
        System.out.println("Ingrese el numero de alumnos");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();
        if(n>=100){
            precio = n * 65000;
            roam = 65000;
                          
        }else{
            if(n >= 50 && n <= 99){
               	precio = n * 70000;
		roam = 70000;
               
                
            }else{
                if(n >= 30 && n <= 49){
                  precio = n * 95000;
	      	  roam = 95000;  
                    
                    
                }else{
                    precio=400000;
                }
                
            }
            
        }
        System.out.println("El precio total a pagar a la compañia es de: $"+precio);
        	if(precio == 400000){
		roam = 400000 / n;
	         System.out.println("Cada alumno debe pagar: $"+roam);
	}
	else{
                    System.out.println("Cada alumno debe pagar: $"+roam);        
	
	}
                
        
        
        
        
        
        
        
    }
    
}
