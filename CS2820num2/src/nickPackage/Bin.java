package nickPackage;

import nickPackage.Belt;

//import java.util.*;

//import warehouse_system.orders.*;
//import warehouse_system.*;


//Couldn't get javadoc's to work, will keep trying


/**
 * 
 * @author Ted Herman, Nick Barnes
 *  
 * A Bin contains an Order that has all its items ready to go
 *
 */
//public class Bin {
//  Order order;  // ready to go on the Belt
//  boolean finished;  // initially false, becomes true when ready to go
//  public Bin() { order = null; finished = false; }
//  public boolean isFinished() { return finished; }
//  public void setFinished() { finished = true; }
//  public Order getOrder() { return order; }
//  public void setOrder(Order o) { order = o; }
//  }

public class Bin extends Belt {
    public Order binOrder;
    private static Point startlocation = pickBelt[0];
    private Point location;
	private boolean finished = false;
	String itemName;
	
	
	public Bin() {
		binOrder = null;
		finished = false;
		System.out.println("Bin needs args");
		


		
	}
	public Bin(Order o, Point p){
		binOrder = o;
		this.location = p;
		finished = false;
		itemName = binOrder.getItemBeingOrderedName();
	
	}
	public Point getBinLocation(){
		return location;
	}
	public void setBinLocation(Point p){
		location = p;
	}
	
	public boolean isFinished(){
		//if order = bin then it is finished
		return finished;
	}
	public void setFinished(){
		//if order = bin then it is finished
		finished = true;
		System.out.println("Order is finished");
	}

    public Order getOrder(){
    	return binOrder;
    }
    public void setOrder(Order o) { 
    	this.binOrder = o; 
    }
    
    public static void pickerAdd(Order o){
    	System.out.println("Picker completes order, puts on belt");
    	Bin b = new Bin(o, pickBelt[0]);
    	pickBins.add(b);
    	//Order myOrd = o;
    //	Bin b = new Bin(o);
    }
    
    

		
    
    public static void populateBins(){
    	for (Bin b : pickBins) {
    	     Point p = b.getBinLocation();
    	     if(p == pickBelt[3]){
    	    	 packParcels.add(Parcel.packIt(pickBins.remove(0)));
    	}
    }
    
    }
}