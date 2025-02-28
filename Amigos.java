
package amigos;
import java.util.*;

public class Amigos {

  
    public static void main(String[] args) {
        
        Persona p1 = new Persona("Pepe",37,"Mexico",55770080);
        Persona p2=new Persona();
        
        System.out.println("Persona 1");
        System.out.println("Nombre:"+p1.consultarNombre());
        System.out.println("Edad:"+p1.consultarEdad());
        System.out.println("Ciudad:"+p1.consultarCiudad());
        System.out.println("Telefono:"+p1.consultarTelefono());
        
        System.out.println("Persona 2");
        System.out.println("Nombre:"+p2.consultarNombre());
        System.out.println("Edad:"+p2.consultarEdad());
        System.out.println("Ciudad:"+p2.consultarCiudad());
        System.out.println("Telefono:"+p2.consultarTelefono());
        p2.cambiarEdad(30);
        System.out.println("Edad P2:"+p2.consultarEdad());
    }
    
    
}
