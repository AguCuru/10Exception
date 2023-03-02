/*
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
 */
package Service;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;


public class Lista {
    Scanner leer = new Scanner(System.in);
    


    
    public void llenarListaBis (){
        int Lista [] = new int [5];
        System.out.println("Esta Lista puede guardar 5 numeros");
        try {
            
        for (int i = 0; i < 10; i++) { //   Arreglo de 5 posicion y quiere recorrer 10
            System.out.println("Numero " + (i+1));
            Lista [i] = leer.nextInt();
        }
        System.out.println("Ingrese la posicion a buscar: " );
        int pos = leer.nextInt();
        for (int i = 0; i < 7; i++) {
            if (pos == i) {
                
                System.out.println("El numero guardado en la posicion " + pos + " es " + Lista [i]);
            }
        }            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: La lista solo guarda 5 numeros. ");
        }


            


        
    }

}

        
  

