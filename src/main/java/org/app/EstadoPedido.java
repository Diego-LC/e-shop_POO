package org.app;

public enum EstadoPedido {
	NUEVO,
	CREADO,
	DESPACHADO,
	RECIBIDO,
	CERRADO;

	private int estado;

	/**
	 * 
	 * @param estado
	 */
	EstadoPedido(String estado) {
		// TODO - implement EstadoPedido.EstadoPedido
		throw new UnsupportedOperationException();
	}

	EstadoPedido() {

	}

	public void getEstado() {
		// TODO - implement EstadoPedido.getEstado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

}