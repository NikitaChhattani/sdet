package JavaActivity2;

public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] num={10, 77, 10, 54, -11, 10};
		int sum=0;
		int Add=30;
		int Search=10;
		
		for (int i:num){
		
			if (i==Search){
				sum=sum+i;
			}
		}
			if(sum==Add){
				System.out.println("sum of all the 10's is 30");
				
				}
			else{
				System.out.println("sum of all the 10's is not equal to 30");
			}
		}
		
	

}
