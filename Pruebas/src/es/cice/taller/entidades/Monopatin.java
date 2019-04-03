package es.cice.taller.entidades;

import es.cice.taller.enums.Categoria;
import es.cice.taller.enums.EstadoVehiculo;

public class Monopatin extends Vehiculo{

	private String color;

	public Monopatin(EstadoVehiculo estado, Categoria categoria, String color) {
		super(estado, categoria);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
