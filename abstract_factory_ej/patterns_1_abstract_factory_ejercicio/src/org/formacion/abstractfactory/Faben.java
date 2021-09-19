package org.formacion.abstractfactory;

public class Faben implements FabAs {

	@Override
	public Saludos getEdu() {
		return new SaludosEn();
	}

	@Override
	public Preguntas getCuestiones() {
		return new PreguntasEn();
	}

}
