package amigos;

public class Persona {

    private String nombre;
    private int edad;
    private String ciudad;
    private int telefono;

    public Persona(String n, int e, String c, int t) {
        this.nombre = n;
        this.edad = e;
        this.ciudad = c;
        this.telefono = t;
    }

    public Persona() {
        nombre = "andrea";
        edad = 21;
        ciudad = "Estado de México";
        telefono = 0;

    }

    public String consultarNombre(){
    return nombre;
    }
    
    public int consultarEdad(){
    return edad;
    }
    
    public String consultarCiudad(){
    return ciudad;
    }
    
    public int consultarTelefono(){
    return telefono;
    }
    
    public void cambiarEdad(int e){
    this.edad = e;
    }
}
