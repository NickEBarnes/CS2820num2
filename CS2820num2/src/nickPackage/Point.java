package nickPackage;

//import src.String;

public class Point {
	
	private int x;
	private int y;
	private String name;
	private Point p;
	
	public Point(int x, int y, String name) {
		this.x = x;
		this.y = y;
		this.name = name;
		
	}
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		name = "";
	}
	/**
	 * 
	 * @param x value in the x direction
	 * @param y value in the y direction
	 */
	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void move(Point p){
		this.p = p;
	}
	/**
	 * 
	 * @return int[] containing x and y for particular point
	 */
	public int[] getPoint() {
		int[] point = {this.x,this.y};
		return point;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public String getName() {
		return name;
	}
	public void setNewPoint(Point p){
		this.p = p;
	}
	public Point getNewPoint(){
		return p;
	}
}

