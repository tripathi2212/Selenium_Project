package bank;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Validdata_Validation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdriver/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		String url="http://demo.guru99.com/v4/";
		driver.get(url);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*REST Button Check*/
		driver.findElement(By.name("uid")).sendKeys("mngr341941");
		Thread.sleep(2000);
		driver.findElement(By.name("btnReset")).click();
		Thread.sleep(3000);
		
		
		/*LOGIN Check*/
		WebElement usrname=driver.findElement(By.name("uid"));
		WebElement passwd=driver.findElement(By.name("password"));
		
		usrname.sendKeys("mngr341941");
		passwd.sendKeys("zupynem1@");
		Thread.sleep(3000);
		
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(3000);

		
		/*TC001- Validate New Customer*/
		WebElement d=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody"));		
		System.out.println(d.getText());
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.name("name")).sendKeys("Utkarsh");
		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.name("res")).click();
		
		driver.findElement(By.id("dob")).sendKeys("22-12-1996");
		driver.findElement(By.name("name")).sendKeys("UtkarshT");
		driver.findElement(By.name("rad1")).click();
		driver.findElement(By.name("addr")).sendKeys("Bhogabir");
		driver.findElement(By.name("city")).sendKeys("Varanasi");
		driver.findElement(By.name("state")).sendKeys("Uttar Pradesh");
		driver.findElement(By.name("pinno")).sendKeys("221005");
		driver.findElement(By.name("telephoneno")).sendKeys("9755676414");
		driver.findElement(By.name("emailid")).sendKeys("testutktrip@gmail.com");
		driver.findElement(By.name("password")).sendKeys("ablhcde@123");
		driver.findElement(By.name("sub")).click();
		Thread.sleep(3000);
		
		String cid=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText();
		
		/*TC002--if customer present Edit the email and submit*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys(cid);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("testingutktrip@gmail.com");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")).click();
		Thread.sleep(2000);
		
		/*TC003--Add new account to the customer*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys(cid);
		
		WebElement dd1=driver.findElement(By.name("selaccount"));
		Select dropdown=new Select(dd1);
		dropdown.selectByVisibleText("Current");
		Thread.sleep(2000);
		
		driver.findElement(By.name("inideposit")).sendKeys("51000");
		driver.findElement(By.name("button2")).click();
		Thread.sleep(3000);
		
		/*TC004--Edit account*/
		String acc=driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]")).getText();
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[6]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("AccSubmit")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		/*TC005--Deposit*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("ammount")).sendKeys("10000");
		driver.findElement(By.name("desc")).sendKeys("random");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		
		/*TC006--Withdrawal*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("ammount")).sendKeys("50000");
		driver.findElement(By.name("desc")).sendKeys("Personal");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		
		/*TC007--Fund Transfer*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payersaccount")).sendKeys(acc);
		driver.findElement(By.name("payeeaccount")).sendKeys("95081");
		driver.findElement(By.name("ammount")).sendKeys("2000");
		driver.findElement(By.name("desc")).sendKeys("Transfer");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		
		/*TC008--Balance Enquiry*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[12]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		
		/*TC009--Mini Statement*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[13]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		
		/*TC010--Customized Statement*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("fdate")).sendKeys("20-07-2021");
		driver.findElement(By.name("tdate")).sendKeys("31-07-2021");
		driver.findElement(By.name("amountlowerlimit")).sendKeys("1500");
		driver.findElement(By.name("numtransaction")).sendKeys("1");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		
		/*TC011--Delete account*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys(acc);
		driver.findElement(By.name("AccSubmit")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		/*TC012--Delete the customer account*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys(cid);
		driver.findElement(By.name("AccSubmit")).click();
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		/*TC013--logout*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		driver.quit();	
		
	}
}
