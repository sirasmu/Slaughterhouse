package common.model;
import java.util.ArrayList;
import java.util.Iterator;

public class TrayCollection
{
	private ArrayList<Tray> trays;
	
	public TrayCollection()
	{
		trays = new ArrayList<>();
	}
	
	public void add(Tray tray)
	{
		trays.add(tray);
	}
	
	public boolean isAllTraysOfType(PartType type)
	{
		Iterator<Tray> iterator = trays.iterator();
		
		while(iterator.hasNext()) {
		    Tray currentTray = iterator.next(); 
		    if( currentTray.getType() != type)
		    {
		    	return false;
		    }
		} 
		return true;
	}
}
