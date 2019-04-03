package es.cice.taller.entidades;

import es.cice.taller.enums.Categoria;
import es.cice.taller.enums.EstadoVehiculo;

public class Bicicleta extends Vehiculo {

	private boolean isCarretera;

	public Bicicleta(EstadoVehiculo estado, Categoria categoria, boolean isCarretera) {
		super(estado, categoria);
		this.isCarretera = isCarretera;
	}

	public boolean isCarretera() {
		return isCarretera;
	}

	public void setCarretera(boolean isCarretera) {
		this.isCarretera = isCarretera;
	}

	@Override
	public String toString() {
		return "Bicicleta [isCarretera=" + isCarretera + "]";
	}
	
	
	
}
