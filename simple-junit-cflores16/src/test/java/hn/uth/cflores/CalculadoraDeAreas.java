package hn.uth.cflores;

public class CalculadoraDeAreas {

    public double calcularAreaCirculo(double radio) {
        if (radio < 0) {
            return Double.NaN;
        }
        return Math.PI * Math.pow(radio, 2);
    }

    public double areaCuadrado(double lado) {
        if (lado < 0) {
            return Double.NaN;
        }
        return lado * lado;
    }

    public double areaRectangulo(double ancho, double alto) {
        if (ancho < 0 || alto < 0) {
            return Double.NaN;
        }
        return ancho * alto;
    }

    public double areaTriangulo(double base, double altura) {
        if (base < 0 || altura < 0) {
            return Double.NaN;
        }
        return (base * altura) / 2;
    }
}
