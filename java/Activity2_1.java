package JavaActivity5;

abstract class Book {
	
	String Title;
	public void setTitle(String s) {
	}
	public void getTitle(){
		System.out.println("Title of the book :"+Title);
	}
}
	
	class MyBook extends Book{
		 public void setTitle(String s){
			 Title=s;
		 }
	}

public class Activity2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyBook newNovel=new MyBook();
		newNovel.setTitle("JavaBook");
		newNovel.getTitle();

	}


}