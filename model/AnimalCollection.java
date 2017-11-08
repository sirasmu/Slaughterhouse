package model;
import java.util.ArrayList;

public class AnimalCollection
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
