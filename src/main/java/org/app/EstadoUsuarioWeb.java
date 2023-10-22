package org.app;

public enum EstadoUsuarioWeb {
	NUEVO,
	ACTIVO,
	TEMP_BLOQ,
	PROHIBIDO;

	private int estado;

	public void getEstado() {
		// TODO - implement EstadoUsuarioWeb.getEstado
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param estado
	 */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	EstadoUsuarioWeb() {
		// TODO - implement EstadoUsuarioWeb.EstadoUsuarioWeb
		throw new UnsupportedOperationException();
	}

}