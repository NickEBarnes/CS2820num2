package nickPackage;

//import src.Object;
//import src.String;

/**
 * 
 * @author Wei Gui
 *
 */
public interface Robot{
	
	public String getID();
	public boolean getBatteryState();
	public void gocharge(); 
	public void Activate(Object targetitem,Object targetposition);
	
}
