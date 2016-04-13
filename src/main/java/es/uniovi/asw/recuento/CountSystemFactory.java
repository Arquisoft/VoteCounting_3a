package es.uniovi.asw.recuento;

public class CountSystemFactory {

	public static CountSystem newStdCountSystem() {
		return new StdCountSystem();
	}
}
