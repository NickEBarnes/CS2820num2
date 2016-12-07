package nickPackage;

import java.util.*;

//import src.HashMap;
//import src.Item;
//import src.Point;
//import src.String;
//import src.wareHouseLocation;
/**
 * 
 * @author josephtleiferman
 *
 */
public class Shelve extends wareHouseLocation {
	
	private HashMap<String,Item> itemsOnShelves = new HashMap<>();
	private Point location; 
	public Shelve(Point p) {
		super(p);
		
	}

	public Point getLocation() {
		return location;
	}
	public void setLocatoin(int x, int y) {
		location.setPoint(x,y);
	}
	public void put(String n, Item i) {
		itemsOnShelves.put(n, i);
	}
	public void remove(String n) {
		itemsOnShelves.remove(n);
	}
}
