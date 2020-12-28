package SeleniumActivities;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity8_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.get("https://training-support.net/selenium/tables");
		
		List<WebElement> ColumnList=new ArrayList<WebElement>();
		ColumnList= driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[1]/td"));
		
		int columnCount=ColumnList.size();
		System.out.println("No of columns in the Table are :"+columnCount);
		
		
		//Data of third row of the table
		List<WebElement> ThirdRow=new ArrayList<WebElement>();
		ThirdRow=driver.findElements(By.xpath("//table[@class='ui celled striped table']/tbody/tr[3]/td"));
		
		for(WebElement data:ThirdRow){
			System.out.println(data.getText());
		}
		
		WebElement SecondRow=driver.findElement(By.xpath("//table[@class='ui celled striped table']/tbody/tr[2]/td[2]"));
		System.out.println("Second Row Second Element :"+SecondRow.getText());
		
		driver.close();
	}

}
