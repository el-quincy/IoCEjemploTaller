package com.cice.taller.entidades;

public class Bici {
	private String tipoBici;
		
	public Bici(String tipoBici) {
		super();
		this.tipoBici = tipoBici;
	}

	public String getTipoBici() {
		return tipoBici;
	}

	public void setTipoBici(String tipoBici) {
		this.tipoBici = tipoBici;
	}

	@Override
	public String toString() {
		return "Bici [tipoBici=" + tipoBici + "]";
	}
	
	
}
