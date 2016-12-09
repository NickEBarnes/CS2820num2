package nickPackage;
//package production_unitTesting;
//import warehouse_system.Report;
//import warehouse_system.Tickable;
//import warehouse_system.belt.Bin;

import java.util.*;





//timing moving the bins has not been implemented yet, still waiting for 
//integration code. 

//integration with items in the orders still needed, will be involved 
//later

//import java.util.*;
//Ted Herman, Nicholas Barnes
//Hello 2

public class Belt {
public static MockFloor f = new MockFloor();
//boolean binAvailable();  // true if Picker can get a new Bin
//Bin getBin();  // called by Orders when Picker wants a new Bin 
public static MockBelt mb = new MockBelt(f);
//public static MockFloor mf;
public static Point[] packBelt = { new Point(0,7),new Point(0,6),new Point(0,5),new Point(0,4) };
public static Point packinIt = new Point(0,3);
public static Point[] pickBelt = {packinIt, new Point(0,2),new Point(0,1),new Point(0,0) };
public static Parcel mock = new Parcel();
public static Point startPick = pickBelt[0];
public static Point startPack = packBelt[0];
public static Point endPick = pickBelt[2];
public static Point endPack = packBelt[2];
public static LinkedList<Bin> pickBins = new LinkedList<Bin>();
public static LinkedList<Parcel> packParcels = new LinkedList<Parcel>();
public static LinkedList<Parcel> dockParcels = new LinkedList<Parcel>();

//packParcels.add(mock);

public static void runBelt(){
	  Point curr1 = pickBelt[0];
	  Point curr2 = pickBelt[1];
	  Point curr3 = pickBelt[2];
	  Point pickHold = pickBelt[3];
//	  System.out.println("Belt spot 1: " + startPick);
//	  System.out.println("Belt spot 2: " + pickBelt[1]);
//	  System.out.println("Belt spot 3: " + pickBelt[2]);
	  pickBelt[0].move(pickBelt[1]);
	  pickBelt[1].move(pickBelt[2]);
	  pickBelt[2].move(pickBelt[3]);
//	  System.out.println("Getting packed: " + pickBelt[3]);

	 
	  Point curr4 = packBelt[0];
	  Point curr5 = packBelt[1];
	  Point curr6 = packBelt[2];
	  Point dock = packBelt[3];
//	  System.out.println("Belt spot 4: " + packBelt[0]);
//	  System.out.println("Belt spot 5: " + packBelt[1]);
//	  System.out.println("Belt spot 6: " + packBelt[2]);
	  pickBelt[3].move(packinIt); //move to packer point
	  packBelt[0].move(curr5);
	  packBelt[1].move(curr6);
	  packBelt[2].move(dock);
	  //packBelt[3]
//	  pickBins.set(1, new Bin());
//	  pickBins.set(2, new Bin());
//	  pickBins.set(3, new Bin());
//	  System.out.println("Getting packed: " + pickHold);
//	  System.out.println("Belt spot 4: " + packBelt[0]);
//	  System.out.println("Belt spot 5: " + packBelt[1]);
//	  System.out.println("Belt spot 6: " + packBelt[2]);
//	  Bin alBin1 = pickBins.get(0);
//	  Bin alBin2 = pickBins.get(1);
//	  Bin alBin3 = pickBins.get(2);
//	  Bin packBin = pickBins.get(3);
//	  String pi1s;
//	  String pi2s;
//	  String pi3s; 
//	  String packS;
	  
	  
//	  for(int i = 0; i < pickBins.size(); i++){
//		   pi1s = alBin1.binOrder.getItemBeingOrdered().name;
//		   pi2s = alBin2.binOrder.getItemBeingOrdered().name;
//		   pi3s = alBin3.binOrder.getItemBeingOrdered().name;
//		   packS = packBin.binOrder.getItemBeingOrdered().name;
//		 // String pa1s = alPar1.binOrder.getItemBeingOrdered().name;
//		 // String pa2s = alPar2.binOrder.getItemBeingOrdered().name;
//		 // String pa3s = alPar2.binOrder.getItemBeingOrdered().name;
//		 // String pa4s = alPar2.binOrder.getItemBeingOrdered().name;
//	  }
	  
	  
//	  System.out.println("pick belt 1: ");  //pickBelt[0]);
//	  System.out.println("pick belt 2: "); //pickBelt[1]);
//	  System.out.println("pick belt 3: "); //pickBelt[2]);
//	  System.out.println("Packer: " ); //+ packinIt);
//	  System.out.println("pack belt 1: "); // + packBelt[0]);
//	  System.out.println("pack belt 2: "); //+ packBelt[1]);
//	  System.out.println("pack belt 3: "); //+ packBelt[2]);
//	  System.out.println("On dock: "); //+ packBelt[3]);
//	  System.out.println(" ");
//	  System.out.println(" ");
}
	  
	  
	  
 //not used, MockBelt overrides
  public void tick(int count){
      //runBelt();
      //3System.out.println("hello");
 }
  public static void doPicker(Order order){
		pickBins.add(new Bin(order, startPick));
		System.out.println("Started order " + order.getItemBeingOrderedName());
	} 
	private static void doPacker(Bin bin) {
		packParcels.add( new Parcel( startPack, bin.binOrder));
		//return new Parcel( startPack, bin.binOrder);
	}
   public LinkedList<Bin> getPickerItems(){
	   return pickBins;
   }
   public LinkedList<Parcel> getPackerItems(){
	   return packParcels;
   }
//   
//   public void check(int i){
//	   if(pickBins.
//   }
  
  
  
  
}
// private boolean isMovable();

// public static String getBeltItem(Point p){
//	   return p.getName();
// }
//}

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
