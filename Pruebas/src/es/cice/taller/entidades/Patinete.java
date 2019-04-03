package es.cice.taller.entidades;

import es.cice.taller.enums.Categoria;
import es.cice.taller.enums.EstadoVehiculo;

public class Patinete extends Vehiculo{

	
	private int numeroDeRuedas;

	

	public Patinete(EstadoVehiculo estado, Categoria categoria, int numeroDeRuedas) {
		super(estado, categoria);
		this.numeroDeRuedas = numeroDeRuedas;
	}



	@Override
	public String toString() {
		return "Patinete [numeroDeRuedas=" + numeroDeRuedas + "]";
	}
	
	
	
	
	
}
