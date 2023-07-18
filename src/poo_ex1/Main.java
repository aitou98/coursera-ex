package poo_ex1;

public class Main {

	public static void main(String[] args) {
		
		Cercle c = new Cercle();
		c.setRayonCercle(2.5);
		c.setCentre(2.0, 3.0);
		
		System.out.println(c.surface());
	}

}
