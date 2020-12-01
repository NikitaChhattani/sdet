package JavaActivity6;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

class Plane{
	
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	java.util.Date date=new java.util.Date(); 
    
	
	public Plane(int maxPassengers){
		this.maxPassengers=maxPassengers;
		this.passengers=new ArrayList<>();
		
	}
	
	public void onboard(String s){
		
		passengers.add(s);
	}
	
	public void takeOff(){
		 
		System.out.println("Time of TakeOff: "+date); 
	   }
	
	public void land(){
		lastTimeLanded=date;
		
		this.passengers.clear();
		}
	
	
	public void getLastTimeLanded(){
		System.out.println("Flight Landed at time:" +lastTimeLanded);
	}
	
	public void getPassesngers(){
		System.out.println(" List of passengers landing "+passengers);
	}
}

public class Activity2_2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Plane plane=new Plane(10);
		plane.onboard("p1");
		plane.onboard("p2");
		plane.onboard("p2");
		plane.onboard("p4");
        plane.takeOff();
        plane.getPassesngers();
        Thread.sleep(5000);
        plane.land();
        plane.getLastTimeLanded();
        
        
        
    }
	}


