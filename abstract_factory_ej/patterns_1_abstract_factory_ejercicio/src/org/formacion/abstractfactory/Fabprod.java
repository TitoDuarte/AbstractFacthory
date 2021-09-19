package org.formacion.abstractfactory;

public class Fabprod {
	
	public static FabAs getFab(String idioma) {
		if(idioma == "es") {
			return new Fabes();
		}
		else if(idioma == "en") {
			return new Faben();
		}
		else {
			return null;
		}
	}

}
