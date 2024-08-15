package org.example;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String direccion;

	public Address(String direccion) {
		// TODO: validate !
		this.direccion = direccion;
	}

	protected Address() {

	}

	private String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public boolean suCalleEs(String unaCalle) {
		return this.direccion.equals(unaCalle);
	}
}
