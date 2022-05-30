package first_pack;

public abstract class SuperAnimal implements Animal{
	
	protected String nombre;
	protected int salud;
	protected String sonido;
	
	public SuperAnimal(String nombre) {
		this.nombre = nombre;
		salud = 10;
	}
	
	@Override
	public void atacar (Animal animal) {
		if (salud > 0) {
			System.out.println(sonido);
			animal.sufrir();	
		}else {
			System.out.println(nombre + " esta muerto");
		}
	}
	@Override
	public void sufrir () {
		if (salud > 0) {
			salud -= 1;
			System.out.println(nombre + " sufriendo...");
			if (salud < 1) {
				System.out.println(nombre + "fallecio");
			}else if (salud < 5) {
				System.out.println(nombre + " sangrando copiosamente");
			}
		}else {
			System.out.println(nombre + " esta muerto");
		}
	}
}
