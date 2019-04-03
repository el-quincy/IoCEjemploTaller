package es.cice.taller.service;

import es.cice.taller.entidades.Vehiculo;

public interface TallerService {

	
	public void recibir(Vehiculo vehiculo);
	public void reparar(Vehiculo vehiculo);
	public void entregar(Vehiculo vehiculo);
}
