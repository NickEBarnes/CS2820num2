package nickPackage;

//import src.Item;
//import src.ItemController;
//import src.Master;
//import src.MockBelt;
//import src.MockFloor;
//import src.MockRobot;
//import src.OrderControl;
//import src.Point;
//import src.RobotScheduler;
//import src.String;
//import src.Visualizer;

/**
 * will run the entire simulation
 * 
 * @author josephtleiferman
 *
 *
 */
public class Production {

	public static void main(String[] args) {
		// Doing unit test
		MockFloor F = new MockFloor();
		Belt B = new Belt();
		RobotScheduler R = new RobotScheduler(2);
		Point robotP = new Point(0,3);
		MockRobot r001= new MockRobot("001", robotP, R );
		R.addRobot(r001); 
		robotP.setPoint(3, 0);
		MockRobot r002= new MockRobot("002", robotP, R );
		R.addRobot(r002);
		
		ItemController I = new ItemController();
		I.addItem(new Item("apple", 5, "777"));
		I.addItem(new Item("banana", 5, "778"));
		
		/**
		 * adds 9 items to inventory
		 * 
		 */
		
		I.addItem(new Item("RED_SHIRT", 200, "1"));
		I.addItem(new Item("BLUE_SHIRT", 300, "1"));
		I.addItem(new Item("BICYCLE", 2, "2"));
		I.addItem(new Item("BASKETBALL", 50, "2"));
		I.addItem(new Item("SHAVING_CREAM", 10, "3"));
		I.addItem(new Item("DUCT_TAPE", 1, "3"));
		I.addItem(new Item("BOOK", 20, "4"));
		I.addItem(new Item("EGG_PLANT", 2000, "5"));
		I.addItem(new Item("FLUTE", 5, "6"));
		
		
		OrderControl O = new OrderControl(I, R, B);
		
		Visualizer V = new Visualizer(F);
		
		Master M = new Master(B, F, I, O, R, V);
		M.setLimit(100);
		M.setUnitTime(1000);
		M.start();

	}

}
