package com.cice.taller.entidades;

public class Transporte {
	private int id;
	private int numRuedas;
	private String descripcion;
	
	
	public Transporte(int numRuedas, String descripcion) {
		this.numRuedas = numRuedas;
		this.descripcion = descripcion;
	}	
	public Transporte() {
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNumRuedas() {
		return numRuedas;
	}
	
	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	@Override
	public String toString() {
		return "transporte [id=" + id + ", numRuedas=" + numRuedas + ", descripcion=" + descripcion + "]";
	}	
	
}
