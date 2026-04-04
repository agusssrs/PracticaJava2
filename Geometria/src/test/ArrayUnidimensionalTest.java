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
	}
}
