package nickPackage;
//package production_unitTesting;
//import warehouse_system.Report;
//import warehouse_system.Tickable;
//import warehouse_system.belt.Bin;

//timing moving the bins has not been implemented yet, still waiting for 
//integration code. 

//integration with items in the orders still needed, will be involved 
//later

import java.util.*;
//Ted Herman, Nicholas Barnes
//Hello 2

public interface Belt {
MockFloor f = new MockFloor();
boolean binAvailable();  // true if Picker can get a new Bin
Bin getBin();  // called by Orders when Picker wants a new Bin 
public static MockBelt mb = new MockBelt(f);
//public static MockFloor mf;
public static Point[] pickBelt = f.PICKERBELT;//{ new Point(0,5,"PICKERBELT5"),new Point(0,4,"PICKERBELT4"),new Point(0,3,"PICKERBELT3") };
public static Point[] packBelt = f.PACKERBELT;//{ new Point(0,2,"PICKERBELT2"),new Point(0,1,"PICKERBELT1"),new Point(0,0,"PICKERBELT0") };
String pick1 = pickBelt[0].getName();
String pick2 = pickBelt[1].getName();
String pick3 = pickBelt[2].getName();
String pack1 = packBelt[3].getName();
String pack2 = packBelt[4].getName();
String pack3 = packBelt[5].getName();
public static Point startPick = pickBelt[0];
public static Point startPack = packBelt[3];
public static Point endPick = pickBelt[2];
public static Point endPack = packBelt[5];

public Belt(){
	  Point curr1 = pickBelt[0];
	  Point curr2 = pickBelt[1];
	  Point curr3 = pickBelt[2];
	  Point pickHold;
	  System.out.println("Belt spot 1: " + pick1);
	  System.out.println("Belt spot 2: " + pick2);
	  System.out.println("Belt spot 3: " + pick3);
	  pickBelt[1] = curr1;
	  pickBelt[2] = curr2;
	  pickHold = curr3;
	  System.out.println("Getting packed: " + pickHold.getName());
	  System.out.println("Belt spot 1: " + pickBelt[0].getName());
	  System.out.println("Belt spot 2: " + pickBelt[1].getName());
	  System.out.println("Belt spot 3: " + pickBelt[2].getName());
	  
	  Point curr4 = pickBelt[3];
	  Point curr5 = pickBelt[4];
	  Point curr6 = pickBelt[5];
	  Point ready;
	  System.out.println("Belt spot 4: " + pick1);
	  System.out.println("Belt spot 5: " + pick2);
	  System.out.println("Belt spot 6: " + pick3);
	  pickBelt[1] = curr1;
	  pickBelt[2] = curr2;
	  ready = curr3;
	  System.out.println("Getting packed: " + pickHold.getName());
	  System.out.println("Belt spot 4: " + pickBelt[0].getName());
	  System.out.println("Belt spot 5: " + pickBelt[1].getName());
	  System.out.println("Belt spot 6: " + pickBelt[2].getName());
	  System.
	  
	  
	  
}
public void tick(int count){
	  
}
// private boolean isMovable();

// public static String getBeltItem(Point p){
//	   return p.getName();
// }
}

//public class Belt implements Tickable, Report{
//	protected static int speed;
//  protected static int capacity = 20;
//  static ArrayList<Integer> beltGrid = new ArrayList<Integer>(capacity);
//  protected static int orderNum ;
//  
//  
//  public Belt(){
//  	orderNum = (int)(Math.random() * 100.0);
//  	speed = 2;
//  	
//  }
//  
//  //comment
//  public int getSpeed(){
//  	return speed;
//  }
//  public void setSpeed(int newSpeed){
//  	speed = newSpeed;
//  }
//  public int getOrderNum(){
//  	return orderNum;
//   //	System.out.println("Order Number: " + orderNum);
//  }
//  public static void setOrderNum(int newOrder){
//  	orderNum = newOrder;
//  	
//  }
//  public static void moveRight(){
//  	beltGrid.add(0 , 0);
//  }
//  public static void addBin(int orderNum){
//  	beltGrid.add(0, orderNum);
//  }
//  public static boolean isPosEmpty(int index){
//  	if (beltGrid.get(index) == 0){
//  		System.out.println("Position " + index + " is empty");
//  		return true;
//  	} 
//  	else{
//  		System.out.println("Position " + index + " is filled");
//  		return false;
//  	}
//  	
//  }
//	
// @Override
//	public void tick(int tick) {
//		printEvent("...");
//		
//	}
//
//	@Override
//	public void printEvent(String event) {
//		System.out.println("Belt: " + event);	
//	}
//  
//  public static void main(String args[]){
//  	Bin myBin = new Bin();
//  	Belt myBelt = new Belt();
//  	addBin(52);
//  	moveRight();
//  	moveRight();
//  	addBin(122);
//  	moveRight();
//  	addBin(10);
//  	
//  	//setOrderNum(200);
//  	System.out.println("Order Number: " + orderNum);
//  	System.out.println("List of orders on Belt:    (0 means empty)" );
//  	for (int x=0; x< beltGrid.size(); x++){
//  		System.out.println("Pos. " + x + ": " + beltGrid.get(x));
//  	}
//  	isPosEmpty(1);   
//  	//System.out.print("Belt: " + beltGrid.get(0));
//  	
//  	
//  	
//  }
