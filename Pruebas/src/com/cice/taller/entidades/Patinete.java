package com.cice.taller.entidades;

public class Patinete extends Transporte {
	private int longTabla;

	public int getLongTabla() {
		return longTabla;
	}

	public void setLongTabla(int longTabla) {
		this.longTabla = longTabla;
	}

	@Override
	public String toString() {
		return "Patinete [longTabla=" + longTabla + "]";
	}
	
	
}
