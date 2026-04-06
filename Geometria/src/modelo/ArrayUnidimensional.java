package modelo;

public class ArrayUnidimensional {
	int array1[] = new int[5];
	
	public void cargarArray() {
	    for (int i = 0; i < array1.length; i++) {
	    	array1[i] = i + 1;
	    }
	}
	
	public void mostrarArray() {
		for (int i = 0; i<array1.length;i++) {
			System.out.println(array1[i]);
		}
	}
	
	public int traerElMenor() {
		int menor = this.array1[0];
		
		for(int i = 0; i < 5; i++) {
			if (this.array1[i] < menor) {
				menor = this.array1[i];
			}
		}
		
		return menor;
	}
	
	public int traerElMayor() {
		int mayor = this.array1[0];
		
		for(int i = 0; i < 5; i++) {
			if (this.array1[i] > mayor) {
				mayor = this.array1[i];
			}
		}
		
		return mayor;
	}
	
	public double calcularPromedio() {
		int acum = 0;
		double promedio;
		int i = 0;
		for (i = 0; i < this.array1.length; i++) {
			acum = array1[i] + acum;
		}
		
		promedio = acum / i;
		return promedio;
	}
	
	public void ordenarDeMayorAAmenor() {
		int i = 0;
		int z = 0;
		int temp = 0;
		
		for(i=0; i<this.array1.length-1; i++) {
			for(z=0; z<this.array1.length-1; z++) {
				if (array1[z] < array1[z+1]) {
					temp = array1[z];
					array1[z] = array1[z+1];
					array1[z+1] = temp;
				}
			}
		}
	
	}
	
	public void ordenarDeMenorAMayor() {
		int i = 0;
		int z = 0;
		int temp = 0;
		
		for(i=0; i<this.array1.length-1; i++) {
			for(z=0; z<this.array1.length-1; z++) {
				if (array1[z] > array1[z+1]) {
					temp = array1[z];
					array1[z] = array1[z+1];
					array1[z+1] = temp;
				}
			}
		}
	
	}
	
}