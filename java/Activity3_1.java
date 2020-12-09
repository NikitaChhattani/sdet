package JavaActivity8;

import java.util.ArrayList;

public class Activity3_1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> myList=new ArrayList<String>();
		myList.add("Nikita");
		myList.add("Chhattani");
		myList.add("Details");
		myList.add("Java");
		myList.add("SDET");
		
		System.out.println("Elements of array are:");
		for(String x:myList){
		
			System.out.println(x);
		}
		
		if(myList.contains("Nikita")){
			System.out.println("Element found");
		}
		else{
			System.out.println("Element not found");
		}
		System.out.println("Size of the ArrayList:"+myList.size());
	    System.out.println("Removing element:" +myList.remove(2));
	    System.out.println("New Size of the array :"+myList.size());
		
		
	}
	
	

}
