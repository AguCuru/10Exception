/*
Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables
 */
package Servicio;

import java.util.Scanner;

public class DivisionNumero {
    public void division (){
        Scanner leer = new Scanner (System.in);
        try {
            System.out.println("Ingrese un numero: ");
            String numUno = leer.nextLine();
            System.out.println("Inrgrese otro numero: ");
            String numDos = leer.nextLine();
            double numero1 = Double.parseDouble(numUno);
            double numero2 = Double.parseDouble(numDos);
            System.out.println("Resultado: " +  (numero1 / numero2));
        } catch (ArithmeticException a) {
            System.out.println("Error: No se puede dividir por 0");
        } catch (NumberFormatException n) {
            System.out.println("Error: quiere convertir una letra en un numero");
        }  
    }
}
