/*
Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.
 */
package Servicio;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AdivinaNumero {
    Scanner leer = new Scanner (System.in);
    
    public void inicio(){
        try {
        int numIntento = 0;
        ArrayList <Integer> lista = new ArrayList();
        boolean bandera = false;
        int num;
        int ng =  (int) ((Math.random() * 500+1));
        System.out.println("Adivine el numero escondido");
        System.out.println(ng);
        
        do {            
            System.out.println("Ingrese un numero:");
            num = leer.nextInt();
            lista.add(num);
            numIntento++;
            if (num == ng) {
                System.out.println("Genio, acertaste en el intento numero  " + numIntento);
                bandera = true;
                break;
            } else if (ng > num) {
                System.out.println("Itente un numero mas grande ");
            } else {
                System.out.println("Intente un numero mas bajo");
            }
            
            System.out.println("Numeros ingresados");
            for (Integer mostrarLista : lista) {
                
                System.out.print(mostrarLista + " - ");
                
            }
            System.out.println(" ");
        } while (bandera == false);            
        } catch (InputMismatchException e) {
            System.out.println("Error: No ingreso un numero, intentelo de nuevo.");
            
        }
    }
}    