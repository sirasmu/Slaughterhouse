package common.model;

import java.io.Serializable;


public class PackageByType extends AbstractPackage implements Serializable
{
	private PartType type;
	
	public PackageByType(TrayCollection origins, PartType type)
	{
		super(origins);
		this.type = type;
		if ( !origins.isAllTraysOfType(type) )
		{
			throw new IllegalArgumentException();
		}
	}

	public PartType getType()
	{
		return type;
	}
}
