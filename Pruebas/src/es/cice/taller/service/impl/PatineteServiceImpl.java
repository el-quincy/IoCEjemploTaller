package es.cice.taller.service.impl;

import es.cice.taller.entidades.Vehiculo;
import es.cice.taller.enums.EstadoVehiculo;
import es.cice.taller.service.TallerService;

public class PatineteServiceImpl implements TallerService {
	
	
	@Override
	public void recibir(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.RECIBIDO);
		System.out.println("RECIBIENDO Patinete-> " +vehiculo.toString());
	}

	@Override
	public void reparar(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.REPARANDO);
		System.out.println("REPARANDO Patinete-> " +vehiculo.toString());
		
	}

	@Override
	public void entregar(Vehiculo vehiculo) {
		vehiculo.setEstado(EstadoVehiculo.ENTREGADO);
		System.out.println("ENTREGANDO Patinete-> " +vehiculo.toString());
		
	}

}
