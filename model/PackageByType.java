package model;
import com.sun.org.apache.xerces.internal.impl.dv.InvalidDatatypeValueException;

public class PackageByType extends AbstractPackage
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
