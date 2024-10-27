package hn.uth.cflores;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        CalculadoraDeAreas calculadora = new CalculadoraDeAreas();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Seleccione una operación:");
            System.out.println("1. Calcular área de un círculo");
            System.out.println("2. Calcular área de un cuadrado");
            System.out.println("3. Calcular área de un rectángulo");
            System.out.println("4. Calcular área de un triángulo");
            System.out.println("5. Salir");

           
            int opcion;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.next(); 
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    double areaCirculo = calculadora.calcularAreaCirculo(radio);
                    System.out.println("Área del círculo: " + (Double.isNaN(areaCirculo) ? "Valor inválido" : areaCirculo));
                    break;
                case 2:
                    System.out.print("Ingrese el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    double areaCuadrado = calculadora.areaCuadrado(lado);
                    System.out.println("Área del cuadrado: " + (Double.isNaN(areaCuadrado) ? "Valor inválido" : areaCuadrado));
                    break;
                case 3:
                    System.out.print("Ingrese el ancho del rectángulo: ");
                    double ancho = scanner.nextDouble();
                    System.out.print("Ingrese el alto del rectángulo: ");
                    double alto = scanner.nextDouble();
                    double areaRectangulo = calculadora.areaRectangulo(ancho, alto);
                    System.out.println("Área del rectángulo: " + (Double.isNaN(areaRectangulo) ? "Valor inválido" : areaRectangulo));
                    break;
                case 4:
                    System.out.print("Ingrese la base del triángulo: ");
                    double base = scanner.nextDouble();
                    System.out.print("Ingrese la altura del triángulo: ");
                    double altura = scanner.nextDouble();
                    double areaTriangulo = calculadora.areaTriangulo(base, altura);
                    System.out.println("Área del triángulo: " + (Double.isNaN(areaTriangulo) ? "Valor inválido" : areaTriangulo));
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
