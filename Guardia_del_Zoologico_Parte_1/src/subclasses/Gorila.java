package subclasses;

import classes.Mammal;

public class Gorila extends Mammal{
	
	public void throwSomething() {
		System.out.println("¡Gorila ha lanzado una roca!");
		this.energyLevel-=5;
	}
	
	public void eatBananas() {
		System.out.println("¡Gorila comio una banana!");
		this.energyLevel+=10;
	}
	
	public void climb() {
		System.out.println("¡Gorila ha trepado a la cima de un arbol!");
		this.energyLevel-=10;
	}
}
