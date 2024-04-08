import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Hotel {
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement id = driver.findElement(By.id("username"));
		id.sendKeys("dmdirfan");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("DMDIRFAN");
		
		WebElement login = driver.findElement(By.id("login"));
		login.click();
		
		WebElement location = driver.findElement(By.id("location"));
		Select select = new Select(location);
		select.selectByValue("Sydney");
		
		WebElement hotels = driver.findElement(By.id("hotels"));
		Select select2 = new Select(hotels);
		select2.selectByValue("Hotel Sunshine");
		
		WebElement roomtype = driver.findElement(By.id("room_type"));
		Select select3 = new Select(roomtype);
		select3.selectByValue("Deluxe");
		
		WebElement noofroom = driver.findElement(By.id("room_nos"));
		Select select4 = new Select(noofroom);
		select4.selectByValue("2");
		
		driver.findElement(By.id("datepick_in")).sendKeys(Keys.CONTROL+"a");
		
		WebElement indate = driver.findElement(By.id("datepick_in"));
		indate.sendKeys("20/03/2024");
		
		driver.findElement(By.id("datepick_out")).sendKeys(Keys.CONTROL+"a");
		
		WebElement outdate = driver.findElement(By.id("datepick_out"));
		outdate.sendKeys("24/03/2024");
		
		WebElement adult = driver.findElement(By.id("adult_room"));
		Select select5 = new Select(adult);
		select5.selectByValue("2");
		
		WebElement child = driver.findElement(By.id("child_room"));
		Select select6 = new Select(child);
		select6.selectByValue("2");
		
		WebElement submit = driver.findElement(By.id("Submit"));
		submit.click();
		
		WebElement radio = driver.findElement(By.id("radiobutton_0"));
		radio.click();
		
		WebElement submit2 = driver.findElement(By.id("continue"));
		submit2.click();
		
		WebElement firstname = driver.findElement(By.id("first_name"));
		firstname.sendKeys("Mohamed");
		
		WebElement lastname = driver.findElement(By.id("last_name"));
		lastname.sendKeys("Irfan");
		
		WebElement address = driver.findElement(By.id("address"));
		address.sendKeys("A6, 6th Hasssan Street, Baithulmaal Nagar, Parakkai Road, Kottar, Nagercoil");
		
		WebElement cardno = driver.findElement(By.id("cc_num"));
		cardno.sendKeys("1458222247583325");
		
		WebElement cctype = driver.findElement(By.id("cc_type"));
		Select select7 = new Select(cctype);
		select7.selectByValue("VISA");
		
		WebElement ccmonth = driver.findElement(By.id("cc_exp_month"));
		Select select8 = new Select(ccmonth);
		select8.selectByValue("12");
		
		WebElement ccyear = driver.findElement(By.id("cc_exp_year"));
		Select select9 = new Select(ccyear);
		select9.selectByValue("2027");
		
		WebElement ccvnumber = driver.findElement(By.id("cc_cvv"));
		ccvnumber.sendKeys("158");
		
		WebElement book = driver.findElement(By.id("book_now"));
		book.click();
		
		Thread.sleep(9000);
		
		WebElement f = driver.findElement(By.xpath("//input[@name='order_no']"));
		String string = f.getAttribute("value");
		System.out.println(string);
	}
}
