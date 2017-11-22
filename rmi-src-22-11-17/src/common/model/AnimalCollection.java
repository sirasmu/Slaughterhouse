package common.model;

import java.io.Serializable;
import java.util.ArrayList;

public class AnimalCollection implements Serializable
{
	private ArrayList<Animal> animals;
	
	public AnimalCollection()
	{
		animals = new ArrayList<>();
	}
	
	public void add(Animal animal)
	{
		animals.add(animal);
	}
	
	
}
