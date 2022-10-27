package animal;

public class Serpiente extends Animal{

	private String veneno;

	public String getVeneno() {
		return veneno;
	}

	public void setVeneno(String veneno) {
		this.veneno = veneno;
	}


	@Override
	public String toString() {
		return "Serpiente [veneno=" + veneno + ", getNombre()=" + getNombre() + ", getColor()=" + getColor()
				+ ", getEdad()=" + getEdad() + "]";
	}

	public Serpiente(String nombre, String color, int edad, String veneno) {
		super(nombre, color, edad);
		this.veneno = veneno;
	}
	
	public void makeSound() {
		System.out.println("ttttsssssss");
	}
	
	
	
}
