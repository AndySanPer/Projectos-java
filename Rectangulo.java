package areasfiguras;

import java.util.*;

public class Rectangulo {

    private float base;
    private float altura;
    private float area;

    public Rectangulo(float b, float a) {
        base = b;
        altura = a;
    }

    public void areaRectangulo() {
        area = base * altura;
        System.out.println("El area del Rectangulo es:" + area);
    }
}
