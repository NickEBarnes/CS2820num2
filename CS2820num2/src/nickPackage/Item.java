package nickPackage;
//package production_unitTesting;

//import src.Override;
//import src.String;

/**
* @author Wangyang Xu, Nicholas Barnes
* establish an item database, including the basic imformation about the item.
*/


public class Item {
	
	public final String name;
	public int weight;
	public int[] size;			// length, width, height
	public int quantity;
	public String shelfID;
	public int row;
	
	public Item(String name){
	    this.name = name;
	    this.quantity = 0;
	    this.shelfID = "Empty";
	}
	
	public Item(String name, int quantity, String shelfID) {
		this.name = name;
		//this.weight = weight;
		//this.size = size;
		this.quantity = quantity;
		this.shelfID = shelfID;
		//this.row = row;
	}
	
	@Override
	public String toString() {
		return this.name;
		
	}

}