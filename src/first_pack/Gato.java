package first_pack;

public class Gato extends SuperAnimal{
	
	public static final int MACHO = 0;
	public static final int HEMBRA = 1;
	
	private String raza;
	private int anioNacimiento;
	private int sexo;
	
	public Gato(String nombre, String raza, int anioNacimiento, int sexo) {
		super(nombre);
		this.raza = raza;
		this.anioNacimiento = anioNacimiento;
		this.sexo = sexo;
		sonido = "miau...";
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public int getAnioNacimiento() {
		return anioNacimiento;
	}
	public void setAnioNacimiento(int anioNacimiento) {
		this.anioNacimiento = anioNacimiento;
	}
	
	public String maullar () {
		return "[" + nombre + "]: miau...";
	}
	@Override
	public void atacar (Animal animal) {
		super.atacar(animal);
	}
	
	
	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", raza=" + raza + ", anioNacimiento=" + anioNacimiento 
				+ ", sexo=" + sexo + "]";
	}
	
}
