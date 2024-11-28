package com.cg.inherit;

public class UseAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal[] anm = new Animal[2];
		anm[0] = new Dog("Johny" , 5);
		anm[1] = new Cat("Pussy" , 3);
		for(Animal a : anm)
		{
			a.makesound();
		}
	}

}
