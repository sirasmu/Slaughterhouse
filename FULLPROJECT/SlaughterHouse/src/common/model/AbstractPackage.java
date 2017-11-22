package common.model;

import java.io.Serializable;

public abstract class AbstractPackage implements Serializable
{
	private String id;
	private TrayCollection origins;
	private double weight;

	public AbstractPackage(TrayCollection origins)
	{
		id = SlaughterhouseUtilities.generateId();
		this.origins = origins;
	}

	public void setOrigins(TrayCollection origins){
		this.origins=origins;
	}
	
	public String getId()
	{
		return id;
	}

	public TrayCollection getTrays()
	{
		return origins;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
