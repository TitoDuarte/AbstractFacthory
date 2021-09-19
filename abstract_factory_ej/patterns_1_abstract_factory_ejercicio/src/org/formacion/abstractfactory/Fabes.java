package org.formacion.abstractfactory;

public class Fabes implements FabAs{

	@Override
	public Saludos getEdu() {
		return new SaludosEs();
	}

	@Override
	public Preguntas getCuestiones() {
		return new PreguntasEs();
	}
}
