package gitTutorial.com.gitTutorial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class testNGCode {
	
@Test
public void login() throws Exception{
	FirefoxDriver d=new FirefoxDriver();
	d.get("https://www.gmail.com/");
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	d.findElement(By.xpath(".//*[@id='Email']")).sendKeys("traveltracker1.isos@gmail.com");
	d.findElement(By.xpath(".//*[@id='next']")).click();
	d.findElement(By.xpath(".//*[@id='Passwd']")).sendKeys("gallop@222");
	d.findElement(By.xpath(".//*[@id='signIn']")).click();
	d.quit();
}

}