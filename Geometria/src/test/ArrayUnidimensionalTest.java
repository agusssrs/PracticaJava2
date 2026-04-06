package test;

import modelo.ArrayUnidimensional;

public class ArrayUnidimensionalTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayUnidimensional a = new ArrayUnidimensional();
		
		a.cargarArray();
		a.mostrarArray();
		
		System.out.println("El menor es: " + a.traerElMenor());
		System.out.println("El mayor es: " + a.traerElMayor());
	
		System.out.println("El promedio del array es: "+ a.calcularPromedio());
		
		System.out.println("Array de mayor a menor:");
		a.ordenarDeMayorAAmenor();
		a.mostrarArray();
		
		System.out.println("Array de menor a mayor:");
		a.ordenarDeMenorAMayor();
		a.mostrarArray();
	}
}
