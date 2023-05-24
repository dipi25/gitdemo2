package automation_dipi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ENDTOEND {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/client");
driver.findElement(By.id("userEmail")) .sendKeys("dipica3.neog@gmail.com");
driver.findElement(By.id("userPassword")).sendKeys("Chenikuthi@333");
driver.findElement(By.id("login")).click();

List<WebElement> products=driver.findElements(By.cssSelector(".card-img-top"));

WebElement prod = products.stream().filter(product->
product.findElement(By.cssSelector("b")).getText().equals("ZARA COAT 3")).findFirst().orElse(null);	
		
 
	}
 
}
