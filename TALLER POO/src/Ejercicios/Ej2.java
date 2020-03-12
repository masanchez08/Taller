/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


public class Ej2 {
    public void Salario() throws IOException{
        float sb=0,r=0,sn=0,tm=80000*10;
        Scanner leer = new Scanner(System.in);
        BufferedReader in = new BufferedReader (new InputStreamReader(System.in));
        String nombre;
        int i,n,nh,tf;
        String codigo;
        String sexo;
        System.out.println("SALARIO EMPLEADOS ");
        System.out.println("ingrese la cantidad de empleados ");
        n=leer.nextInt();
        System.out.println("ingrese la tarifa ");
        tf=leer.nextInt();
        i=0;
        while(i<n){
            
            System.out.println("Nombre: ");
            nombre=in.readLine();
            System.out.println("Horas: ");
            nh = leer.nextInt();
            System.out.println("Codigo: ");
            codigo=in.readLine();
            System.out.println("Sexo: ");
            sexo=in.readLine();
            if(nh>=240&&nh<300) 
              sb=(float) ((tm-nh)*2.5);  
            
             else if(nh>=300 )
                sb=(float) ((tm-nh)*1.7);
                
             else if(nh<240)
                sb=(tf*nh);
                                             
            if(sb<tm)
			sn=sb;
			//r=0;
		if(sb>=tm&&sb<1000000){
			r=(float) (sb*0.5);
			sn=sb-r;
		}
		else if(sb>=1000000 && sb<2000000) {
			r=(float) (sb*0.1);
			sn=sb-r;
		}
		else if(sb>=2000000){
			r=(float) (sb*0.2);
			sn=sb-r;
		}
            
              System.out.println("DATOS FINALES DEL EMPLEADO: ");  
              System.out.println("Nombre del empleado "+nombre);
              System.out.println("Codigo:"+codigo);
              System.out.println("Sexo del empleado:"+sexo);
              System.out.println("Horas trabajadas:"+nh);
              System.out.println("Salario bruto:"+sb);
              System.out.println("Salario neto:"+sn);
              System.out.println("Retencion:"+r);
              i++;
              
                 
            
            
            
            
        } 
        
        
        
           
        
        
    }
    
}
