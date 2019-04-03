package es.cice.taller;

import es.cice.taller.entidades.Bicicleta;
import es.cice.taller.entidades.Patinete;
import es.cice.taller.enums.Categoria;
import es.cice.taller.service.TallerService;
import es.cice.taller.utils.ServiceFactory;
import es.cice.taller.utils.VehiculosFactory;

public class Main {

	public static void main(String[] args) {
		
		
			TallerService service = ServiceFactory.getService(Categoria.BICICLETA);
			
			Bicicleta bicicleta = (Bicicleta)VehiculosFactory.getVehiculo(Categoria.BICICLETA);
			
			service.recibir(bicicleta);
			service.reparar(bicicleta);
			service.entregar(bicicleta);
			
			service = ServiceFactory.getService(Categoria.PATINETE);
			
			Patinete patinete = (Patinete)VehiculosFactory.getVehiculo(Categoria.PATINETE);
			
			service.recibir(patinete);
			service.reparar(patinete);
			service.entregar(patinete);
 	 
	}

}
