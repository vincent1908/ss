package webTable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@SuppressWarnings("unused")
public class DynamicWebTableAhilReddy {

	public static void main(String[] args) {

//		WebDriver driver = new FirefoxDriver();
//
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//
//		WebElement table = driver.findElement(By.xpath(".//*[@id='main']/div[3]/div"));
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		for (int i = 1; i < rows.size(); i++) {
////			System.out.println(rows.get(i).getText());
//			List<WebElement> columns = rows.get(i).findElements(By.tagName("td"));
//			for (int j = 0; j < columns.size(); j++) {
//				System.out.println(columns.get(j).getText());
//			}
//		}
		
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
		
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
//		LocalDate localDate = LocalDate.now();
//		System.out.println(dtf.format(localDate));
	}
}
