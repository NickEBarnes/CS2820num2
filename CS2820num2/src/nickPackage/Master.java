package nickPackage;

import java.util.*;

/**
 * 
 * @author Di Huang
 *
 */
public class Master implements Runnable {
	/**
	 * 1. Master starts and continues simulation process
	 * 2. Ticking Simulation: Master publishes ticks to other components
	 */
	private int limit = 1000000;				// default: limit = 100 ticks
	private int unitTime = 1000;				// default: 1 second per tick
	private boolean running = false;
	private int input;
	
	private Belt B;
	private Floor F;
	private ItemController I;
	private OrderControl O;
	private RobotScheduler R;
	private Visualizer V;
	
	
	/**
	 * add all components here for possible unit test
	 */
	public Master(Belt b, Floor f, ItemController i, OrderControl o, RobotScheduler r, Visualizer V) {
		B = b;
		F = f;
		I = i;
		O = o;
		R = r;
		//V = v;
	}

	@Override
	public void run() {
		//numOfTicks();
		int tick = 0;
		while (tick < limit) {
			System.out.println(tick + " tick(s)");
			tick(tick);
			System.out.println();
			
			unitTime();
			
			tick++;
		}

	}
	
	public void start() {
		running = true;
		new Thread(this).start();
	}
	
	public void stop(){
		running = false;
	}
	
	/* 
	 * numOfTicks method
	 * 
	 * author: Nicholas Barnes
	 * 
	 * */
	public int numOfTicks(){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter an integer: "); 

		
		while (!scan.hasNextInt()) 
		{        
		    scan.next(); 
		    System.out.print("Please enter an integer: ");
		}

		
		input = scan.nextInt(); // Get the integer
		//System.out.println("Input: " + input);
        return input;
		
	}
	
	public void setLimit(int count){
		limit = numOfTicks();
	}
	
	public void setUnitTime(int milliseconds){
		unitTime = 400;
	}
	
	private void unitTime(){
		try {
			Thread.sleep(unitTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * tick(tick) works as a central clock that publishes 
	 * each tick to other components
	 */
	private void tick(int tick){
		O.tick(tick);							// getting orders
		R.tick(tick);              // updating RobotScheduler to control robots
		B.tick(tick);                //tick through the belt
		//V.tick(tick);				// repainting everything
		
	}
	
}
