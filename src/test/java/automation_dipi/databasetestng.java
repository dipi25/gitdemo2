package automation_dipi;

 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
 

 

 

public class databasetestng {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		String host="localhost";
		String port="3306";
		// TODO Auto-generated method stub
	Connection	 conn=DriverManager.getConnection("jdbc:mysql://"+ host +":" +port + "/sys","root" ,"root");
Statement s=	conn.createStatement();
ResultSet rs=s.executeQuery("select * from emp where name='RAM'" );

 //while(rs.next())
 
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 
 driver.findElement(By.xpath(" //input [@id='username']")) .sendKeys (rs .getString("username"));
//input[@id='password']
 
 driver.findElement(By.xpath(" //input [@id='password']")) .sendKeys (rs .getString("username"));
System.out.println(rs .getString("id"));
System.out.println(rs .getString("location"));
	 

}
}