package nickPackage;


import java.util.*;



/*
 * 
 * Author: Ted Herman, Nicholas Barnes
 * 
 */


public class Belt implements Tickable {
	
	
	public static Point[] packBelt = { new Point(0,4),new Point(0,5),new Point(0,6),new Point(0,7) };
    //public static Point packinIt = new Point(0,3);
    public static Point[] pickBelt = {new Point(0,0), new Point(0,1),new Point(0,2),new Point(0,3) };
    // public static Parcel mock;
	public static Point startPick = pickBelt[0];
	public static Point startPack = packBelt[0];
	public static Point endPick = pickBelt[3];
	public static Point endPack = packBelt[3];
	public static LinkedList<Bin> pickBins = new LinkedList<Bin>();
	public static LinkedList<Parcel> packParcels = new LinkedList<Parcel>();
	public static LinkedList<Parcel> dockParcels = new LinkedList<Parcel>();
    public static int dockAmount = 0;
    
	public static Item RED_SHIRT = new Item("RED_SHIRT", 200, "1");
	public static Item BLUE_SHIRT = new Item("BLUE_SHIRT", 300, "1");
	public static Item BICYCLE = new Item("BICYCLE", 2, "2");
	public static Item BASKETBALL = new Item("BASKETBALL", 50, "2");
	public static Item SHAVING_CREAM= new Item("SHAVING_CREAM", 10, "3");
	public static Item DUCT_TAPE = new Item("DUCT_TAPE", 1, "3");
	public static Item BOOK = new Item("BOOK", 20, "4");
	public static Item EGG_PLANT = new Item("EGG_PLANT", 2000, "5");
	public static Item FLUTE = new Item("FLUTE", 5, "6");
	public static Item Empty = new Item("Open");
	
	public static Order emptyOrd = new Order(Empty);
    public static Order[] orderArr = {
    		new Order(RED_SHIRT, 2, "501 South Dodge Street"),
    		new Order(BLUE_SHIRT, 5, "313 South Gilbert Street"),
    		new Order(BICYCLE, 1, "613 East Court Street"),
    		new Order(BASKETBALL, 2, "512 North Dodge Street"),
    		new Order(SHAVING_CREAM, 4, "902 Davenport Street"),
    		new Order(DUCT_TAPE, 1, "451 East Market Street"),
    		new Order(BOOK, 1, "222 Governor Street"),
    		new Order(EGG_PLANT, 1, "378 Lucas Street"),
    		new Order(FLUTE, 1, "987 Clinton Ave")
    };
	public static Random rn = new Random();
	
	
	//packParcels.add(mock);
	
	
	//not used but included since in interface
	public boolean suspend(int suspticks, int currtick){
		return true;
	}

public Belt(){
		Point curr1 = pickBelt[0];
		Point curr2 = pickBelt[1];
		Point curr3 = pickBelt[2];
		//Point curr4 = pickBelt[3];
		Point pickHold = pickBelt[3];
		Point curr4 = packBelt[0];
		Point curr5 = packBelt[1];
		Point curr6 = packBelt[2];
		Point dock = packBelt[3];
		  
		//  System.out.println("Belt spot 1: " + startPick);
		//  System.out.println("Belt spot 2: " + pickBelt[1]);
		//  System.out.println("Belt spot 3: " + pickBelt[2]);
		  pickBelt[0].setNext(curr2);
		  pickBelt[1].setNext(curr3);
		  //pickBelt[2].move(curr4);
		  pickBelt[2].setNext(pickHold);
		  //System.out.println("Getting packed: " + pickBelt[3]);


		 //System.out.println("Belt spot 4: " + packBelt[0]);
	     //System.out.println("Belt spot 5: " + packBelt[1]);
	     //System.out.println("Belt spot 6: " + packBelt[2]);
		 // pickBelt[3].move(); //move to packer point
 	      pickBelt[3].setNext(null);
		  packBelt[0].setNext(curr5);
		  packBelt[1].setNext(curr6);
		  packBelt[2].setNext(dock);
		  //packBelt[3]
		 // pickBins.set(1, new Bin());
		 // pickBins.set(2, new Bin());
		 // pickBins.set(3, new Bin());
	     //System.out.println("Getting packed: " + pickHold);
	     //System.out.println("Belt spot 4: " + packBelt[0]);
         //System.out.println("Belt spot 5: " + packBelt[1]);
         //System.out.println("Belt spot 6: " + packBelt[2]);

//   System.out.println("Random number: " + randNum);
//   String randOrder = "order" + randNum;
//   System.out.println(randOrder);

 }


   //@Override
   public void tick(int count){
	  int randomIndex = rn.nextInt(9);
 	  count = count + 1;
 	     
 	  if(count % 8 == 1 ){
 		   addBin(orderArr[randomIndex]);
		   
 	  }
  	for(Parcel parcy : packParcels){
		Point p = parcy.getParcelLocation();
		if(p == startPack){
			System.out.println("Parcel Added");
			System.out.println("Parcel @ ("+ p.getX() + " , " + p.getY() + ") " );
			parcy.setParcelLocation(p.getNext());	  			
		}
		if(p.getY() > 4 &&  p.getY() < 8){
			System.out.println("Parcel @ ("+ p.getX() + " , " + p.getY() + ") ");
			parcy.setParcelLocation(p.getNext());
		}
	
		  if(p == packBelt[3]){
			  Parcel doneParc = packParcels.removeLast();
			  dockAmount++;
			  System.out.println("Parcel put in truck");
			  System.out.println("Parcels in truck = " + dockAmount);
			  dockParcels.addLast(doneParc);
			  if(dockAmount > 3){
				  //dockParcels.clear();
				  System.out.println("Truck full, left dock");
			      //dockParcels.add(doneParc);
			  }
			  continue;
		}
		  parcy.setParcelLocation(p.getNext());
		
	}
      for(Bin b: pickBins){
    	  
    	  Point p = b.getBinLocation();
    	  if(p.getY() < 3){
    		  System.out.println("Bin @ ("+ p.getX() + " , " + p.getY() + ") "
    				  			+ b.order.getItemBeingOrderedName());
    	  }
    	  
    	  if(p.getY() == 3){
    		  System.out.println("Bin @ Packer ("+ p.getX() + " , " + p.getY() + ") " 
    				  			+ b.order.getItemBeingOrderedName());
    	  }
    	  if(p == endPick){
    		  Bin newAdd = pickBins.remove();
    		  packParcels.add(getParcel(newAdd));
    		  System.out.println("Bin being packed"); 
    		  //pickBins.remove();
    		 
    		  //continue;
    		  
    	  }
    		  
    	  b.setBinLocation(p.getNext());

      }
 		  
 	  
      
  }
   //picker method
   public static void addBin(Order order){
 	    Bin b = new Bin(order, startPick);
 		pickBins.add(b);
 		System.out.println("New Bin: " + order.getItemBeingOrderedName());
 	} 
   
    //packer method
 	private static Parcel getParcel(Bin bin) {
 		//System.out.println("Loaded Parcel: x " + startPack.getName() );
 		//packParcels.add( new Parcel(bin.order, startPack));
 		return new Parcel( bin.order, startPack);
 	}
    public LinkedList<Bin> getPickList(){
 	   return pickBins;
    }
    public LinkedList<Parcel> getPackList(){
 	   return packParcels;
   }
    public static void printAllParcels(){
    	System.out.println("\nItems delivered today: ");
    	int ordNum = 1;
    	for(Parcel p : dockParcels){
    		
    		System.out.println("\nOrder Num: " + ordNum + " Contents: " + p.order.getItemBeingOrderedName());
    		ordNum++;
    	}
    }
    
//   public void check(int i){
// 	   
//   }
   
 
   
   
}

