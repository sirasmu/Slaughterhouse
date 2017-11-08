package model;

public abstract class AbstractPackage
{
	private String id;
	private TrayCollection origins;

	public AbstractPackage(TrayCollection origins)
	{
		id = SlaughterhouseUtilities.generateId();
		this.origins = origins;
	}

	public String getId()
	{
		return id;
	}

	public TrayCollection getOrigins()
	{
		return origins;
	}
}
