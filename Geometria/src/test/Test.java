package test;

import modelo.Punto;
import modelo.Circulo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Punto punto1 = new Punto(2,4);
		Punto punto2 = new Punto(3,5);
		Punto punto3 = new Punto(4,6);
		
		Circulo circulo1 = new Circulo(punto1, 10);
		Circulo circulo2 = new Circulo(punto3, 20);
		
		System.out.println(circulo1.equals(circulo2));
		
		System.out.println("La distancia entre punto 1 y punto 3 es: " + punto1.calcularDistancia(punto3));
		
		System.out.println("El perimetro del circulo 1 es: " + circulo1.calcularPerimetro(circulo1));
		System.out.println("El perimetro del circulo 2 es: " + circulo2.calcularPerimetro(circulo2));
		
		System.out.println("El area del circulo 1 es: " + circulo1.calcularArea(circulo1));
		System.out.println("El area del circulo 2 es: " + circulo2.calcularArea(circulo2));
		
		System.out.println("La distancia entre circulos es: " + circulo1.calcularDistancia(circulo2));
	}

}
