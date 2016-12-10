package nickPackage;


/**
 * 
 * @author Ted Herman, Nicholas Barnes
 *
 */
public class Bin{
	//instance variables for the class
    public final Order order;
	private Point point;
	private boolean isFinished;

	/**
	 * Default constructor
	 */
	public Bin(){
		order = null;
		point = null;
	}
	
	/**
	 * Two parameter Bin constructor
	 * @param order
	 * @param point
	 */
	public Bin(Order order, Point point){
		this.order = order;
		this.point = point;
	}
	
	/**
	 * gets the coords for a Bin
	 * @return
	 */
	public Point getBinLocation() {
		return point;
	}
	
	/**
	 * set the point of the bin
	 * @param point
	 */
	public void setBinLocation(Point point) {
		this.point = point;
	}
	
	/**
	 * checks the finished state of the bin
	 * 
	 * @return
	 */
	public boolean isitFinished(){
		return isFinished;
	}
	
	/**
	 * Sets finished to true when called
	 * 
	 */
	public void setFinished(){
		isFinished = true; 
	}
}

