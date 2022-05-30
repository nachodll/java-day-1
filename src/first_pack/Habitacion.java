package first_pack;

public class Habitacion {
	
	private Animal animal1;
	private Animal animal2;
	
	public Habitacion (Animal animal1, Animal animal2) {
		this.animal1 = animal1;
		this.animal2 = animal2;
	}
	
	public void batalla() {
		for (int i=0; i<10; i++) {
			animal1.atacar(animal2);
			animal2.atacar(animal1);
		}
	}
}