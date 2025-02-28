package areasfiguras;

import java.util.*;

public class Cuadrado {

    private float lado;
    private float area;

    public Cuadrado(float la) {
        lado = la;
    }

    public void areaCuadrado() {
        area = lado * lado;
        System.out.println("El area del cuadrado es:" + area);
    }
}
