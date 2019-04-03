package es.cice.taller.utils;

import es.cice.taller.entidades.Bicicleta;
import es.cice.taller.entidades.Monopatin;
import es.cice.taller.entidades.Patinete;
import es.cice.taller.enums.Categoria;
import es.cice.taller.service.TallerService;
import es.cice.taller.service.impl.BicicletaServiceImpl;
import es.cice.taller.service.impl.MonopatinServiceImpl;
import es.cice.taller.service.impl.PatineteServiceImpl;

public class ServiceFactory {
	
	
	public static TallerService getService(Categoria categoria){
		TallerService service = null;
		switch (categoria) {
		case MONOPATIN:
			service = new MonopatinServiceImpl();
			break;
		case BICICLETA:
			service = new BicicletaServiceImpl();
			break;
		case PATINETE:
			service = new PatineteServiceImpl();
			break;
		}
		
		return service;
	}

}
