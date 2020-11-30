package JavaActivity4;

public class Activity4dupl {

	 static void ascendingSort(int arr[]){
		
		int temp=0;
		System.out.println("Order of elements before sorting :");
		for(int k:arr){
			System.out.print(k+",");
		}
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=i+1; j<arr.length;j++){
				
				if(arr[i]>arr[j]){
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;	
				}
			}
		}
		System.out.println("\nOrder of elements after sorting :");
		for(int l:arr){
			System.out.print(l+",");
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] data={10,22,4,5,8,56,43,32,12,45};
		ascendingSort(data);
	}

}
