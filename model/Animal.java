package model;

public class Animal
{
	private String id;
	private double weight;
	
	public Animal(double weight)
	{
		id = SlaughterhouseUtilities.generateId();
		this.weight = weight;
	}
	
	public double getWeight()
	{
		return weight;
	}
}
