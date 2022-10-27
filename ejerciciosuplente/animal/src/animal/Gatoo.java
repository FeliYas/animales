package animal;

public class Gatoo extends Animal {

	private String bigotes;

	public Gatoo(String nombre, String color, int edad, String bigotes) {
		super(nombre, color, edad);
		this.bigotes = bigotes;
	}

	public String getBigotes() {
		return bigotes;
	}

	public void setBigotes(String bigotes) {
		this.bigotes = bigotes;
	}

	@Override
	public String toString() {
		return "Gatoo [bigotes=" + bigotes + ", getNombre()=" + getNombre() + ", getColor()=" + getColor()
				+ ", getEdad()=" + getEdad() + "]";
	}

	public void makeSound() {
		System.out.println("miau");
		
	}

	

	
	
	
}
