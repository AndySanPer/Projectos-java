package areasfiguras;

import java.util.*;

public class Triangulo {

    private float base;
    private float altura;
    private float area;

    public Triangulo(float b, float a) {
        base = b;
        altura = a;

    }

    public void areaTriangulo() {
        area = (base * altura) / 2;
        System.out.println("El area del Triangulo es:" + area);
    }
}
