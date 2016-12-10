package nickPackage;

import java.util.*;

import java.util.List;





/**
 * @author Ted Herman, Nicholas Barnes
 * @author Di Huang
 */

public class MockBelt extends Belt{
	public static boolean stillMoving = false;
   //int mockTick = 0;
   //MockFloor F;
   //ArrayList<Point> beltarea = new ArrayList<Point>();
  // Point p = new Point(0,0, "mock");
  // Cell c2;
  // Bin b1;
   //ArrayList<Bin> binList = new ArrayList<Bin>();
   
   public MockBelt(){
      
   }

//public void buildBelt(){
//	  Point curr1 = pickBelt[0];
//	  Point curr2 = pickBelt[1];
//	  Point curr3 = pickBelt[2];
//	  Point pickHold;
//	  System.out.println("Belt spot 1: " + pick1);
//	  System.out.println("Belt spot 2: " + pick2);
//	  System.out.println("Belt spot 3: " + pick3);
//	  pickBelt[1] = curr1;
//	  pickBelt[2] = curr2;
//	  pickHold = curr3;
//	  System.out.println("Getting packed: " + pickHold);
//	  System.out.println("Belt spot 1: " + pickBelt[0]);
//	  System.out.println("Belt spot 2: " + pickBelt[1]);
//	  System.out.println("Belt spot 3: " + pickBelt[2]);
//	  
//	  Point curr4 = pickBelt[3];
//	  Point curr5 = pickBelt[4];
//	  Point curr6 = pickBelt[5];
//	  Point ready;
//	  System.out.println("Belt spot 4: " + pick1);
//	  System.out.println("Belt spot 5: " + pick2);
//	  System.out.println("Belt spot 6: " + pick3);
//	  pickBelt[1] = curr1;
//	  pickBelt[2] = curr2;
//	  ready = curr3;
//	  System.out.println("Getting packed: " + pickHold.getName());
//	  System.out.println("Belt spot 4: " + pickBelt[0].getName());
//	  System.out.println("Belt spot 5: " + pickBelt[1].getName());
//	  System.out.println("Belt spot 6: " + pickBelt[2].getName());
//}
   public MockBelt(MockFloor F) {
	//Point f1 = new Point(0,0,"pickStart");
	//Point f2 = new Point(0,19, "beltEnd");

	 
   
	//  beltarea.add(f1);
	//  beltarea.add(f2);
	//  beltContents(F.PACKERBELT[1]);
   }
 
  /**
   * the tick() method is where belt moving gets done;
   * it will have to move any Bin or Parcel within the Cell
   * of a Belt area to the next Cell, and this has to be done
   * on all Points of the belt area in parallel (not coded yet here)
   * 
   * after moving the belt, tick() should check to see whether
   * or not a Bin has arrived at the Packer - then doPacker() 
   * should be called, which removes the Bin, creates a Parcel 
   * and puts that Parcel on the belt (in more advanced versions,
   * one Bin might make more than one Parcel, if Items are too 
   * big to fit entirely into one Parcel). After the Parcel is
   * in a Cell at the Packer, the belt will be stopped until some
   * later tick when the Packer finishes the Parcel.
   * 
   * even fancier ideas are to give the Packer a queue of Bins
   * and remove each Bin that arrives, taking some non-trivial
   * number of ticks to make Parcels, returning them to the 
   * belt area when they are completed
   * 
   * and a really thorough Belt would simulate the shipping dock,
   * collecting a lot of parcels and grouping them into a truck
   *
   */

   int lasttick = -1;
   
//   public Order empty(){
//	   return 
//   }
  
	public boolean suspend(int suspticks, int currtick){
		if(currtick == lasttick + suspticks){
			lasttick = -1;
			return true;
		}else{
			return false;
		}
	}

//	
//         Bin.populateBins();
//         Parcel.populateParcel();
//	     if(count == 0) {
//        	 System.out.println("BEGIN");
//        	 zeroPrint();
//        	 //runBelt();
//         }else if(count == 1){
//        	 Bin.pickerAdd(order2);
//        	 Bin.populateBins();
//             Parcel.populateParcel();
//         }else if( (count % 3) == 0){
//        	 Bin.pickerAdd(order1);
//        	 //runBelt();
//        	 Bin.populateBins();
//             Parcel.populateParcel();
//         }else{
//        	 Bin.populateBins();
//             Parcel.populateParcel();
//         }
             
   
 public void zeroPrint(){
	  System.out.println("pick belt 1: ");  //pickBelt[0]);
	  System.out.println("pick belt 2: "); //pickBelt[1]);
	  System.out.println("pick belt 3: "); //pickBelt[2]);
	  System.out.println("Packer: "); //+ packinIt);
	  System.out.println("pack belt 1: "); // + packBelt[0]);
	  System.out.println("pack belt 2: "); //+ packBelt[1]);
	  System.out.println("pack belt 3: "); //+ packBelt[2]);
	  System.out.println("On dock: "); //+ packBelt[3]);
	  System.out.println(" ");
	  System.out.println(" ");
 }
//	  count = count + 1;
//	  Bin currentBin = getBin();
//		Point oP = new Point(0,0, "Bin");
//		  this.F = F;
//		  binList.add(getBin());
//		  binList.add(getBin());
//		  boolean binCheck;
//		  binCheck = c2.isBin(oP);
//		  if(oP.getName() == "Bin"){
			  //System.out.println("It is a bin");
	//		  Bin newBin = new Bin();
//			  binList.add(newBin);
//			  System.out.println("current bins: " + binList.toString());
//		  }
//		  else{
//			  System.out.println("Not WORKING");
//		  }
//	  
	  
	  
	  //bin or parcel needs to be moved here
	  //will be moved to the next cell
	  //for(int i = 0; i<pickerbeltsize; i++){
	  //      
	  //
	  //}
   // }
  
  /**
   * Local method to see whether belt can be moved
   */
  private boolean isMovable() {
	for (Point p: pickBelt) {
	  Cell c = new Cell(); // F.getLocation("mock");
	 // c.getContents();
	  Object o = c.getContents();
	  if (o == null) continue;  // skip empty cell
	  if ((o instanceof Bin) && !((Bin)o).isFinished()) return false;
	  if ((o instanceof Parcel) && !((Parcel)o).isFinished()) return false;
	  }
	return true;  // nothing stops belt from moving
    }
  
  /**
   * Local method doPacker() simulates a Bin arriving to the 
   * Packer via the belt moving. 
   */
  private void doPacker() {
////	Cell c = F.getCell(0 /*F.getPacker()*/);
//	Cell c = new Cell();
////	c.cellNum();
//	Object o = c.getContents();  // get what the Cell has in it
//	assert o instanceof Bin;     // it had better be a Bin
//	Bin b = (Bin)o;              // use the Bin to
//	Order v = b.getOrder();      // get the finished Order
//	Parcel n = new Parcel(v.getShippingAddress(),v.getItemBeingOrdered());
//	c.setContents(n);  // replace Bin with Parcel on the belt
    }
  
  /**
   * Called by Orders to check whether a new Bin can be safely started
   */
  public boolean binAvailable() {
	return false;
	//if (0,0) doesn't have a bin, return true
    }
 
//  public Bin getBin() {
//	return new Bin(); 
//    }
  
  public void beltContents(Point p){
     // String s1 = c2.getCell(p);
      String r = p.getName();
      System.out.println(" belt contents: " + r);
      //return r;
  }
}
