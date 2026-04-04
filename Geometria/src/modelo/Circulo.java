package modelo;
import java.util.Objects;

public class Circulo {
	private Punto origen;
	private double radio;
	
	public Circulo(Punto origen, double radio) {
		super();
		this.origen = origen;
		this.radio = radio;	
	}

	public Punto getOrigen() {
		return origen;
	}

	public void setOrigen(Punto origen) {
		this.origen = origen;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [origen=" + origen + ", radio=" + radio + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(origen, radio);
	}

	public boolean equals(Circulo circulo) {
		return this.origen.equals(circulo.getOrigen()) && this.radio == circulo.getRadio();
	}
	
	public double calcularPerimetro(Circulo circulo) {
		return circulo.radio*2*Math.PI;
	}
	
	public double calcularArea(Circulo circulo) {
		return Math.PI * Math.pow(circulo.radio, 2);
	}
	
	public double calcularDistancia(Circulo circulo) {
		double distanciaCentros = this.origen.calcularDistancia(circulo.origen);
		return distanciaCentros - (this.radio + circulo.radio);
	}
}
