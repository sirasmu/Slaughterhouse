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
	private boolean readyForPacking;
	
	public Tray(String type)
	{
		this.id = SlaughterhouseUtilities.generateId();
		this.type = type;
		this.weight = 0;
		this.animals = new AnimalCollection();
		this.readyForPacking=false;
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
		if(!animals.getAnimalCollection().contains(animal)){
		animals.add(animal);
		}
		this.weight+=weight;
		if(this.weight>maxWeight||this.weight>maxWeight-50)
		{
			readyForPacking=true;
		}
	}
	
	public boolean isReadyForPackaging()
	{
		return readyForPacking;	
	}
	
}
