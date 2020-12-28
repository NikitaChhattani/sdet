package SeleniumActivities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity9_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://training-support.net/selenium/selects");
		
		WebElement multicheck=driver.findElement(By.xpath("//select[@id='multi-select']"));
		WebElement Selection=driver.findElement(By.xpath("//h3[@id='multi-value']"));
		Select s=new Select(multicheck);
		
		if(s.isMultiple()){
			s.selectByVisibleText("Javascript");
			System.out.println(Selection.getText());
			
			s.selectByValue("node");
			System.out.println(Selection.getText());
			
			for(int i=4;i<=6;i++){
				s.selectByIndex(i);
				System.out.println(Selection.getText());
			}
			
			s.deselectByValue("node");
			System.out.println(Selection.getText());
			
			s.deselectByIndex(7);
			System.out.println(Selection.getText());
			
			s.deselectByVisibleText("Javascript");
			System.out.println(Selection.getText());
			
			List<WebElement> AllOptions=s.getAllSelectedOptions();
			for(WebElement selected:AllOptions){
				System.out.println("Selected Options are :"+selected.getText());
			}
			
			s.deselectAll();
			System.out.println(Selection.getText());
			
			driver.close();
			
		}

	}

}
