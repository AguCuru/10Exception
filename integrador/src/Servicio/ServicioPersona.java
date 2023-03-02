
package Servicio;

import objeto.Persona;


public class ServicioPersona {
    
    public void conocerNombre (Persona x){
        
        System.out.println("la persona se llama" + x.getNombre());
            

    }
    
    public void concocerNombre (String nombre){
        System.out.println("La persona se llama " + nombre);
    }
    

}
