package common.model;

import java.io.Serializable;


public class PackageByType extends AbstractPackage implements Serializable
{
	private String type;
	
	public PackageByType(TrayCollection origins, String type)
	{
		super(origins);
		this.type = type;
		if ( !origins.isAllTraysOfType(type) )
		{
			throw new IllegalArgumentException();
		}
	}

	public String getType()
	{
		return type;
	}
}
