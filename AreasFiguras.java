package areasfiguras;

import java.util.*;

public class AreasFiguras {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float base;
        float altura;
        int salir;
        do {

            int op;

            System.out.println("Menu Area figuras\n 1.Cuadrado\n 2.Triangulo \n 3.Circulo \n 4.Rectangulo");
            op = sc.nextInt();

            switch (op) {
                case 1:

                    System.out.println("Ingresa el lado del cuadrado");
                    base = sc.nextFloat();
                    Cuadrado objc = new Cuadrado(base);
                    objc.areaCuadrado();
                    break;
                case 2:
                    System.out.println("Ingresa la base del Triangulo");
                    base = sc.nextInt();
                    System.out.println("Ingresa la altura del Triangulo");
                    altura = sc.nextFloat();
                    Triangulo objt = new Triangulo(base, altura);
                    objt.areaTriangulo();
                    break;
                case 3:
                    System.out.println("Ingresa el radio del Circulo");
                    base = sc.nextFloat();
                    Circulo objci = new Circulo(base);
                    objci.areaCirculo();

                    break;
                case 4:
                    System.out.println("Ingresa la base del Rectangulo");
                    base = sc.nextFloat();
                    System.out.println("Ingresa la altura del Rectangulo");
                    altura = sc.nextFloat();
                    Rectangulo objr = new Rectangulo(base, altura);
                    objr.areaRectangulo();

                    break;
                default:
                    System.out.println("Lo sentimos opcion invalida");
                    break;

            }
            System.out.println("¿Quieres salir? SI[1],NO[2]");
            salir = sc.nextInt();
        } while (salir == 2);

    }

}
