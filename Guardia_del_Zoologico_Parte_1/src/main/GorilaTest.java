package main;

import subclasses.Gorila;

public class GorilaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorila gorila = new Gorila();
		System.out.println("Energia inicial: "+gorila.displayEnergy());
		gorila.throwSomething();
		gorila.throwSomething();
		gorila.throwSomething();
		gorila.eatBananas();
		gorila.eatBananas();
		gorila.climb();
		System.out.println("Energia final: "+gorila.displayEnergy());
	}

}
