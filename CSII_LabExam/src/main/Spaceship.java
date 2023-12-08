package main;

public class Spaceship implements Comparable<Spaceship>{

	private String name;
	private int hp;
	private float sheildLevel;
	
	
	public Spaceship() {
		name = "Unnamed Vessel";
		hp = 100;
		sheildLevel = 100.0f;
		
	}
	public  String getName() {
		return this.name;
	}
	public int getHp() {
		return this.hp;
	}
	public float getSL() {
		return this.sheildLevel;
	}
	
	public Spaceship(String n, int h, float s){
		if(n.equals("")) {
			throw new IllegalArgumentException();
			
		}
		name = n;
		
		if(h > 255 || h < 0) {
			throw new IllegalArgumentException();
		}
		hp = h;
		if(s > 100 || s < 0) {
			throw new IllegalArgumentException();

		}
		sheildLevel = s;
	}
	
	public int compareTo(Spaceship s) {
		return (int)(this.getHp() * this.getSL() - (s.getHp() * s.getSL()));
		
	}
	public String toString() {
		return "" + this.getName() +"has " + this.getHp() + " hp and a shield level of: " +this.getSL();

	}

}
