package modelo;

public class Punto {

//atributos	
	private double x;
	private double y;

//constructor
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}

//m�todos getter y setter
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	public double calcularDistancia(Punto punto) {
		double puntoX = punto.getX() - this.x;
		double puntoY = punto.getY() - this.y;
		
		return Math.sqrt(Math.pow(puntoX, 2) + Math.pow(puntoY, 2));
	}

//re-definici�n de m�todos de la clase Object
// sobrecarga
	public boolean equals(Punto p) {
		return ((x == p.getX()) && (y == p.getY()));
	}

// re-definici�n
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
