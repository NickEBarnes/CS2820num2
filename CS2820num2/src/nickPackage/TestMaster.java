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
//import src.Test;
//import src.Visualizer;

/**
 * 
 * @author josephtLeiferman
 */
public class TestMaster {
	
	//@Test
	public void test000() {	
		// Doing unit test
		MockFloor F = new MockFloor();
		
		MockBelt B = new MockBelt(F);
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
		
		OrderControl O = new OrderControl(I, R, B);
		Item testItem1 = new Item("apple", 1, "1");
		Item testItem2 = new Item("banana", 1, "2");
		
		//O.addOrder(new Order(testItem1, 1, "Clinton St"));
		//O.addOrder(new Order(testItem2, 1, "Johnson St"));
		
		Visualizer V = new Visualizer(F);
		
		Master M = new Master(B, F, I, O, R, V);
		M.setLimit(100);
		M.setUnitTime(200);
		M.start();
	}
	
}