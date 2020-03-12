
package Ejercicios;

import java.util.Scanner;


public class Ej6 {
    public void Examen(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("EXAMEN DE ADMISION");
         int respuestas[]= {1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,1,2,3,4,5};
         int N, i, j, cred = 0;
	 int resmat;
	 int respro;
	 int credgan = 0, exam1 = 0, exam2 = 0, maypun = 0, examtot = 0, sumtot = 0, credpro = 0, puntpro = 0;
         int[]bien= new int[60];
         float prom = 0, promtot = 0;
         System.out.println("Ingrese el número de estudiantes que presentaron la prueba");
         N= entrada.nextInt();
         int[]totalmat= new int [30];
         int[]totalpro= new int [30];
         for(i = 0; i < N; i++)
	{
                System.out.println("Ingrese la credencial del "+(i+1)+"° estudiante");
		cred= entrada.nextInt();
                
			
		exam1 = 0;
		for(j = 0; j < 30; j++)
		{
			resmat = 0;
			 System.out.println("Ingrese la "+(j+1)+" respuesta de la prueba");
                         resmat= entrada.nextInt();
								
			if(resmat == respuestas[j])
			{
				examtot++;
				exam1++;
				bien[j] = bien[j] + 1;
				totalmat[j] = totalmat[j] + 1;
			}
			if(j == 29)
			{
			System.out.println("El puntaje de este estudiante es de: "+exam1+" en la primera prueba");
			}		
		}
                exam2 = 0;
		for(j = 30; j < 60; j++)
		{
			respro = 0;
			System.out.println("Ingrese la "+(j+1)+"respuesta de la prueba");
                        respro= entrada.nextInt();
				
			
			if(respro == respuestas[j])
			{
				examtot++;
				exam2++;
				bien[j] = bien[j] + 1;
				totalpro[j] = totalpro[j] + 1;
			}
				if(j == 59)
			{
			System.out.println("El puntaje de este estuduante es de: "+exam2+" en la segunda prueba");
			}	
		}
                System.out.println("El puntaje del estudiante fue:"+examtot);
                prom = examtot / 60;
                System.out.println("El promedio del estudiante fue:"+prom);
                if(bien[i] > bien[i+1])
		{
			credgan = cred;
			maypun = exam1 + exam2;
		}	
                
	          
             
        
    }
        sumtot = sumtot + examtot;
		
	promtot = sumtot / 60;
		
	if(prom >= promtot)
	{
		credpro = cred;
		puntpro = examtot;
	}
        System.out.println("La credencial del estudiante con mayor puntaje es:"+credgan+"con un puntaje de"+maypun);  
        System.out.println("El promedio total fue de"+promtot);
        System.out.println("Estudiante con puntaje mayor o igual al promedio:"+credpro+"con"+puntpro);
        
        
    
}
