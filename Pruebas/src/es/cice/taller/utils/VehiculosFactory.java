package es.cice.taller.utils;

import es.cice.taller.entidades.Bicicleta;
import es.cice.taller.entidades.Monopatin;
import es.cice.taller.entidades.Patinete;
import es.cice.taller.entidades.Vehiculo;
import es.cice.taller.enums.Categoria;

public class VehiculosFactory {
	
	
	public static Vehiculo getVehiculo(Categoria categoria){
		Vehiculo vehiculo = null;
		switch (categoria) {
		case MONOPATIN:
			vehiculo = new Monopatin(null, categoria, null);
			break;
		case BICICLETA:
			vehiculo = new Bicicleta(null, categoria,false);
			break;
		case PATINETE:
			vehiculo = new Patinete(null, categoria, 0);
			break;
		}
		
		return vehiculo;
		
	}
	

}
