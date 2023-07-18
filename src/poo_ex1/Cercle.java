package poo_ex1;
import java.lang.Math;

public class Cercle {
	
	private double rayonCercle;
	private double x;
	private double y;
	
	
	
	public void setRayonCercle(double rayonCercle) {
		this.rayonCercle = rayonCercle;
	}
	
	public void setCentre(double x,double y) {
		this.x = x;
		this.y = y;
	}
	
	
	
	public double surface() {
		
		return Math.PI * rayonCercle * rayonCercle ;
	}
	
	
//	public boolean estInterieur(double x, double y) {
//		
//		
//		 
//	}
	
	
	 

	
}
