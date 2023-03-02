
package integrador;

import Servicio.ServicioPersona;
import objeto.Persona;


public class Integrador {

    public static void main(String[] args) {
       Persona p1 = new Persona();
       Persona p2 = new Persona();
       ServicioPersona sp = new ServicioPersona (); 
       p1.setNombre("agu");
       p2.setNombre(p1.getNombre());
       
        System.out.println(p1.equals(p2));
        System.out.println(p1.getNombre().equals(p2.getNombre()));
        
        sp.conocerNombre(p2);
        
                try {
             {

        } catch (Exception e){
                
                }
        }
                try {
                    if (!p1.getNombre().equals(null))
        } catch (Exception e) {
            System.out.println("nombre");
        }
        

        }
    }
    
    
    
    

