package areasfiguras;

import java.util.*;

public class Circulo {

    private float radio;
    private float area;

    public Circulo(float r) {
        radio = r;
    }

    public void areaCirculo() {
        area = (radio * radio) * 3.14f;
        System.out.println("El area del Circulo es:" + area);
    }
}
