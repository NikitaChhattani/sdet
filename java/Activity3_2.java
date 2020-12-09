package JavaActivity8;

import java.util.HashSet;

public class Activity3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> hs=new HashSet<String>();
		hs.add("One");
		hs.add("Two");
		hs.add("Three");
		hs.add("Four");
		hs.add("Five");
		hs.add("Six");
		
		System.out.println("Size of the HashSet:"+hs.size());
		System.out.println("Removing element :"+hs.remove("Two"));
		System.out.println("Removing another element :"+hs.remove("Data"));
		System.out.println("Checking six is present in array or not :"+hs.contains("Six"));
		System.out.println("Updated set of data :");
		for(String h:hs){
			System.out.println(h);
		
	}

	}}
