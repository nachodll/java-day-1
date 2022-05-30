package first_pack;

public class Urraca extends SuperAnimal{
	private String nombre;
	private int salud;
	
	public Urraca(String nombre) {
		super(nombre);
		sonido = "croac croac";
	}
	
	@Override
	public void atacar (Animal animal) {
		super.atacar(animal);
	}
	
}
