package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title= driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Anith");
		driver.findElement(By.id("lastNameField")).sendKeys("Anbu Vijayan");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Anith");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Anbu Vijayan");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Mechanical");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Production Engineer");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("anith1114@gmail.com");
		WebElement create = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select city = new Select (create);
		city.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.className("subMenuButton")).click();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Good Morning");
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		System.out.println(title);
	}
	
	}


