package common.model;
import java.io.Serializable;
import java.util.ArrayList;

public class PackageCollection implements Serializable
{
	private ArrayList<AbstractPackage> packages;
	
	public PackageCollection()
	{
		packages = new ArrayList<>();
	}
	
	public void add(AbstractPackage p)
	{
		packages.add(p);
	}
	
	public ArrayList<AbstractPackage> getPackageCollection(){
		return packages;
	}
}

