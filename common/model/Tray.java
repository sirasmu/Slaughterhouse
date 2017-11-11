package common.model;
import java.util.ArrayList;

public class Tray
{
	private String id;
	private PartType type;
	private double maxWeight;
	private double weight;
	private AnimalCollection animals;
	
	public Tray(double maxWeight, PartType type)
	{
		id = SlaughterhouseUtilities.generateId();
		this.type = type;
		this.maxWeight = maxWeight;
		weight = 0;
		animals = new AnimalCollection();
	}
	
	public String getId()
	{
		return id;
	}
	
	public PartType getType()
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
	
	public void addPart(Animal animal)
	{
		animals.add(animal);
	}
	
}
