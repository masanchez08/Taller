/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.poo;

import Ejercicios.Ej2;
import Ejercicios.Ej4;
import Ejercicios.Ej6;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TALLERPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         System.out.println("Ingrese un numero");
        Scanner entrada = new Scanner(System.in);
        int op = entrada.nextInt();
        switch(op){
            case 1:
                Ej2 a =new Ej2();
                a.Salario();
                break;
            case 2:
                Ej4 b = new Ej4();
                b.Viaje();
                break;
            case 3:
                Ej6 c = new Ej6();
                c.Examen();
                break;
        }
        
    }
    
}
