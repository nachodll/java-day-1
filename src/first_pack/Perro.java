package first_pack;

public class Perro extends SuperAnimal{
	
	public static final int MACHO = 0;
	public static final int HEMBRA = 1;
	
	private String raza;
	private int peso;
	private boolean vacunado;
	private int sexo;
	
	public Perro(String nombre, String raza, int peso, boolean vacunado, int sexo) {
		super(nombre);
		this.raza = raza;
		this.peso = peso;
		this.vacunado = vacunado;
		this.sexo = sexo;
		sonido = "GRRRRRRRRRRRRRRRRRRRRR";
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
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public boolean isVacunado() {
		return vacunado;
	}
	public void setVacunado(boolean vacunado) {
		this.vacunado = vacunado;
	}
	public int getSexo() {
		return sexo;
	}
	public void setSexo(int sexo) {
		this.sexo = sexo;
	}
	
	public void ladrar () {
		System.out.println("[" + nombre + "]: GUAU!!!!!");
	}
	@Override
	public void atacar (Animal animal) {
		super.atacar(animal);
	}
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", raza=" + raza + ", peso=" + peso 
				+ ", vacunado=" + vacunado + ",  sexo=" + sexo + "]";
	}
	
}
