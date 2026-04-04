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
}