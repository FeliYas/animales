package animal;

public class Perro extends Animal {

	private String olfato;

	@Override
	public String toString() {
		return "Perro [olfato=" + olfato + ", getNombre()=" + getNombre() + ", getColor()=" + getColor()
				+ ", getEdad()=" + getEdad() + "]";
	}

	public String getOlfato() {
		return olfato;
	}

	public void setOlfato(String olfato) {
		this.olfato = olfato;
	}

	public Perro(String nombre, String color, int edad, String olfato) {
		super(nombre, color, edad);
		this.olfato = olfato;
	}
	
	public void makeSound() {
		System.out.println("guau");
		
	}
}
