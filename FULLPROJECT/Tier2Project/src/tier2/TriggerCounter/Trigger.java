package tier2.TriggerCounter;

public class Trigger {

	private static Trigger instance = null;
	private static int count;
	   protected Trigger() {
	      // Exists only to defeat instantiation.
	   }
	   
	   
	   public synchronized static Trigger getInstance() {
	      if(instance == null) {
	         instance = new Trigger();
	         count=0;
	      }
	      return instance;
	   }
	   
	   public synchronized void addCount(){
		   count++;
	   }
	
	   public synchronized int getCount(){
		   return count;
	   }
	   
	   public synchronized void setCountToZero(){
		   count=0;
	   }
	 
}
