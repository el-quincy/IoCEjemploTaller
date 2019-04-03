package es.cice.taller.entidades;

import es.cice.taller.enums.Categoria;
import es.cice.taller.enums.EstadoVehiculo;

public class Vehiculo {

	private EstadoVehiculo estado;
	private Categoria categoria;

	
	
	public Vehiculo(EstadoVehiculo estado, Categoria categoria) {
		super();
		this.estado = estado;
		this.categoria = categoria;
	}

	public EstadoVehiculo getEstado() {
		return estado;
	}

	public void setEstado(EstadoVehiculo estado) {
		this.estado = estado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Vehiculo [estado=" + estado + ", categoria=" + categoria + "]";
	}
	
	
	
}
