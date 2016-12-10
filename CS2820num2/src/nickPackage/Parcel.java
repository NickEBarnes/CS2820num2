package nickPackage;

//author: Ted Herman, Nicholas Barnes


public class Parcel {
	public final Order order;
	private Point point;
	private boolean isFinished;
	
	public Parcel(Order order, Point point){
		this.order = order;
		this.point = point;
	}
	public Point getParcelLocation() {
		return point;
	}
	public void setParcelLocation(Point point) {
		this.point = point;
	}
	
	public boolean isitFinished(){
		return isFinished;
	}
	public void setFinished(){
		isFinished = true; 
	}
}

