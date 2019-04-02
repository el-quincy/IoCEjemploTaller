package com.cice.taller.service;

import com.cice.taller.entidades.EstadoTransporte;

public interface TallerService {
	public EstadoTransporte recibirTransporte(EstadoTransporte estado);
	public EstadoTransporte repararTransporte(EstadoTransporte estado);
	public EstadoTransporte entregarTransporte(EstadoTransporte estado);	
}
