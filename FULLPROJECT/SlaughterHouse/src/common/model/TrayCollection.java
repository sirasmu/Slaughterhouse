package common.model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;

public class TrayCollection implements Serializable
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
	
	/*
	 * Gets the first available tray which still has not been filled completely
	 */
	public Tray getAvailableTray(double weight, PartType ptype){
		for(Tray tr: trays){
			if(tr.getWeight()+weight<tr.getMaxWeight()&&!tr.isReadyForPackaging()){
				return tr;
			}
		}
		Tray temp = new Tray(ptype);
		trays.add(temp);
		return temp;	
	}
	
	
	public ArrayList<Tray> getTrayCollection(){
		return trays;
	}
	
}
