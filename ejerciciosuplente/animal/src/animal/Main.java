package animal;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		Gatoo leia = new Gatoo ("leia", "atigrada", 1,"cortos");
		JOptionPane.showMessageDialog(null,leia);
		
		Perro mateo = new Perro ("mateo", "negro", 9,"");
		JOptionPane.showMessageDialog(null,mateo);
		
		Serpiente cascabel = new Serpiente ("cascabel", "verde", 2,"si");
		JOptionPane.showMessageDialog(null,cascabel);
		
		mateo.makeSound();
		leia.makeSound();
		cascabel.makeSound();
		
		
	}
	

}
