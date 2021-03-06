package nickPackage;


/**
 * 
 * @author Di Huang
 *
 */
public interface Tickable {
	/**
	 * This interface works as a tunnel that transmits ticks 
	 * from central clock to other components
	 */
	public void tick(int tick);
	
	public boolean suspend(int suspticks, int currtick);
	
}