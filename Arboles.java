package arboles;

public class Arboles {

    public Arboles() {
        System.out.println("Un arbol generico");
    }

    public Arboles(String tipo) {
        System.out.println("un arbol tipo\t" + tipo);
    }

    public Arboles(int altura) {
        System.out.println("un de\t" + altura + "\tmetros");
    }

    public Arboles(int altura, String tipo) {
        System.out.println("un\t" + tipo + "\tde\t" + altura + "\tmetros");
    }

    public static void main(String[] args) {

    Arboles arbol1 = new Arboles();
    Arboles arbol2 = new Arboles(4);
    Arboles arbol3 = new Arboles("roble");
    Arboles arbol4 = new Arboles(5,"pino");
    }

}
