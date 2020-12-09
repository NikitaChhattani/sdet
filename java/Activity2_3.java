package JavaActivity7;

interface BicycleParts {
	public int gears=0;
	public int currentSpeed=0;
}

interface BicycleOperations{
	public void applyBrake(int decrement);
	public void speedUp(int increment);
}

 class Bicycle implements BicycleParts,BicycleOperations{
	   
	 public int gears;
	 public int currentSpeed;
	 
	public Bicycle(int gears, int currentSpeed){
		this.gears = gears;
        this.currentSpeed = currentSpeed;
		
	 }
	 
	 public void applyBrake(int decrement){
		 currentSpeed= currentSpeed-decrement;
		 System.out.println("Current Speed :"+currentSpeed);
		
	 }
	 
	 public void speedUp(int increment){
		 currentSpeed= currentSpeed+increment;
		 System.out.println("Current Speed :"+currentSpeed);
		 
}
	 public String bicycleDesc() {
		    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed);
		} 
 }
 
 class MountainBike extends Bicycle{
	 int seatHeight;
	 
	  public MountainBike(int gears,int currentSpeed){
	        super(gears, currentSpeed);
		}
	 
	 public void setHeight(int newValue) {
		    seatHeight = newValue;
		}
	 public String bicycleDesc() {
		    return("No of gears are "+ gears + "\nSpeed of bicycle is " + currentSpeed
		    		+"\nseatHeight of bicycle is " + seatHeight);
		} 
 }
public class Activity2_3 {

	public static void main(String args[]){
		MountainBike mb= new MountainBike(3,40);
		mb.applyBrake(20);
		mb.speedUp(5);
		mb.setHeight(2);
		System.out.println(mb.bicycleDesc());
		
	
		
	}
}

