package common.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Tray implements Serializable
{
	private String id;
	private String type;
	private final double maxWeight= 1000.0;
	private double weight;
	private AnimalCollection animals;
	
	public Tray(String partType)
	{
		this.id = SlaughterhouseUtilities.generateId();
		type = partType;
		this.weight = 0;
		this.animals = new AnimalCollection();
	}
	
	public String getId()
	{
		return id;
	}
	
	public String getType()
	{
		return type;
	}

	public double getMaxWeight()
	{
		return maxWeight;
	}

	public double getWeight()
	{
		return weight;
	}

	public AnimalCollection getAnimals()
	{
		return animals;
	}
	

	public void addPartFromAnimal(Animal animal, double weight)
	{
		animals.add(animal);
		this.weight+=weight;
	}
	
	public boolean isReadyForPackaging()
	{
		return weight >= maxWeight - 50.0;	
	}
	
}
