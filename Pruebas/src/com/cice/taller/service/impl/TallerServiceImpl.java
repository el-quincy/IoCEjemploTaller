package com.cice.taller.service.impl;

import com.cice.taller.entidades.EstadoTransporte;
import com.cice.taller.service.TallerService;

public class TallerServiceImpl implements TallerService{	
	
	public EstadoTransporte recibirTransporte(EstadoTransporte estado){
		System.out.println("Transporte "+estado);
		estado=1;
	}
	public void repararTransporte(EstadoTransporte estado){
		System.out.println("Transporte reparado");
		estado=2;
	}
	public void entregarTransporte(EstadoTransporte estado){
		System.out.println("Transporte entregado");
		estado=3;
	}
}
