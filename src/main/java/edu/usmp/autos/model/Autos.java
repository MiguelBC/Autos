package edu.usmp.autos.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Autos implements Serializable{

	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	@Size(min=2, max=30,message="mi mensaje")
	private String firstName;
	@NotNull
	private String marca;
	@NotNull
	private int recorrido;
	@NotNull
	private double galon;
	private String mensaje;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public int getRecorrido() {
		return recorrido;
	}
	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}
	
	public double getGalon() {
		return galon;
	}
	public void setGalon(double galon) {
		this.galon = galon;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	
	
}
