package com.cice.taller.entidades;

public class PatineteElectrico extends Transporte {
	private int potenciaMotor;
	
	public PatineteElectrico (int potenciaMotor) {
		this.potenciaMotor= potenciaMotor;
	}

	public int getPotenciaMotor() {
		return potenciaMotor;
	}

	public void setPotenciaMotor(int potenciaMotor) {
		this.potenciaMotor = potenciaMotor;
	}

	@Override
	public String toString() {
		return "PatineteElectrico [potenciaMotor=" + potenciaMotor + "]";
	}	
		
}
