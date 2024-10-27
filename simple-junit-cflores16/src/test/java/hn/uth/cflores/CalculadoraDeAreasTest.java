package hn.uth.cflores;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraDeAreasTest {

    private static CalculadoraDeAreas calculadora;

    @BeforeClass
    public static void setup() {
        calculadora = new CalculadoraDeAreas();
    }

    @Test
    public void testCalcularAreaCirculo() {
        assertEquals(28.27, calculadora.calcularAreaCirculo(3), 0.01);
    }

    @Test
    public void testCalcularAreaCirculoConRadioCero() {
        assertEquals(0, calculadora.calcularAreaCirculo(0), 0.01);
    }

    @Test
    public void testCalcularAreaCirculoConRadioNegativo() {
        assertTrue(Double.isNaN(calculadora.calcularAreaCirculo(-3)));
    }
    @Test
    public void testCalcularAreaCuadrado() {
        assertEquals(16, calculadora.areaCuadrado(4), 0.01);
    }

    @Test
    public void testCalcularAreaCuadradoLadoCero() {
        assertEquals(0, calculadora.areaCuadrado(0), 0.01);
    }

    @Test
    public void testCalcularAreaCuadradoLadoNegativo() {
        assertTrue(Double.isNaN(calculadora.areaCuadrado(-4)));
    }
    
    @Test
    public void testCalcularAreaRectangulo() {
        assertEquals(20, calculadora.areaRectangulo(4, 5), 0.01);
    }

    @Test
    public void testCalcularAreaRectanguloConAnchoCero() {
        assertEquals(0, calculadora.areaRectangulo(0, 5), 0.01);
    }

    @Test
    public void testCalcularAreaRectanguloConAltoNegativo() {
        assertTrue(Double.isNaN(calculadora.areaRectangulo(4, -5)));
    }

    @Test
    public void testCalcularAreaTriangulo() {
        assertEquals(6, calculadora.areaTriangulo(4, 3), 0.01);
    }

    @Test
    public void testCalcularAreaTrianguloConBaseCero() {
        assertEquals(0, calculadora.areaTriangulo(0, 3), 0.01);
    }

    @Test
    public void testCalcularAreaTrianguloConAlturaNegativa() {
        assertTrue(Double.isNaN(calculadora.areaTriangulo(4, -3)));
    }
}
