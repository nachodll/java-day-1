package first_pack;

public class Main {

	public static void main(String[] args) {
		
		Perro ninu = new Perro("ninu", "caniche", 23, true, Perro.MACHO);
		Gato conchita = new Gato("conchita", "naranja", 1998, Gato.HEMBRA);
		Urraca paca = new Urraca("paca");
		
		Habitacion hab = new Habitacion(ninu, paca);
		hab.batalla();
	}

}
