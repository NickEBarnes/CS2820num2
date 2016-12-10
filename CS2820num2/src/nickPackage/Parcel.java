package nickPackage;



/**
 * The Parcel class, used by Belt 
 * @author Ted Herman, Nicholas Barnes
 *
 */
public class Parcel {
	//instance variables for the class
	public final Order order;
	private Point point;
	private boolean isFinished;
	
	/**
	 * Two param constructor, a parcel needs an Order object and a Point object
	 * @param order
	 * @param point
	 */
	public Parcel(Order order, Point point){
		this.order = order;
		this.point = point;
	}
	
	/**
	 * Retrieve the Point coordinates of the parcel
	 * @return
	 */
	public Point getParcelLocation() {
		return point;
	}
	
	/**
	 * Set the Point coordinates of the parcel
	 * @param point
	 */
	public void setParcelLocation(Point point) {
		this.point = point;
	}
	
	/**
	 * Check to see what the objects finished state is
	 * 
	 * @return
	 */
	public boolean isitFinished(){
		return isFinished;
	}
	
	/**
	 * Set the isFinished variable to true
	 * Parcel is complete if true
	 */
	public void setFinished(){
		isFinished = true; 
	}
}

