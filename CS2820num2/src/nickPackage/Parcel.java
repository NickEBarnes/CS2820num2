package nickPackage;



public class Parcel extends Belt{
  /**
   * 
   * @author Ted Herman, Nicholas Barnes
   * 
   * A Parcel has an address and a list of Items
   *
   */
  private Point location;
  private Order parcOrder;
  private boolean finished;
	
  
  
  public Parcel(){
	  System.out.println("Empty Parcel");
  }
  public Parcel(Point p, Order o) { 
	location = p;
    parcOrder = o;
    finished = false;
	
    }
  public boolean isFinished() { 
	  return finished; 
  }
  public void setFinished() { 
	  finished = true; 
  }
  public void setLocation(Point p){
	  location = p;
  }
  public Point getLocation(){
	  return location;
  }
  public void setOrder(Order o){
	  parcOrder = o;
  }
  public Order getOrder(){
	  return parcOrder;
	 
  }
  
  public static Parcel packIt(Bin b){
	  
	  return new Parcel(packBelt[0] , b.getOrder() );
  }
  public static void checkParcel(){
  	for (Parcel pa : packParcels) {
  	     Point p = pa.getLocation();
  	     if(p == packBelt[3]){
  	    	 packParcels.remove(3);
  	     }
  	}
  }
}
