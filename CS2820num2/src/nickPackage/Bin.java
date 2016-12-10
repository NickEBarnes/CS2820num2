package nickPackage;



public class Bin{
    public final Order order;
	private Point point;
	private boolean isFinished;

	
	public Bin(){
		order = null;
		point = null;
	}
	
	public Bin(Order order, Point point){
		this.order = order;
		this.point = point;
	}
	public Point getBinLocation() {
		return point;
	}
	public void setBinLocation(Point point) {
		this.point = point;
	}
	public boolean isitFinished(){
		return isFinished;
	}
	public void setFinished(){
		isFinished = true; 
	}
}

