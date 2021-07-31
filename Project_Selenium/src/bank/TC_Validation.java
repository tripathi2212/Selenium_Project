package bank;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Validation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:/chromewebdriver/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		String url="http://demo.guru99.com/v4/";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement usrname=driver.findElement(By.name("uid"));
		WebElement passwd=driver.findElement(By.name("password"));
		usrname.sendKeys("mngr341941");
		passwd.sendKeys("zupynem1@");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		
		/*TC001*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("");
		driver.findElement(By.name("inideposit")).click();
		String msg32=driver.findElement(By.id("message14")).getText();
		System.out.println(msg32);
		Thread.sleep(2000);
		
		/*TC002*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("!@#$%");
		String msg33=driver.findElement(By.id("message14")).getText();
		System.out.println(msg33);
		Thread.sleep(2000);
		
		/*TC003*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("hello");
		String msg34=driver.findElement(By.id("message14")).getText();
		System.out.println(msg34);
		Thread.sleep(2000);
		
		/*TC004*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[5]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys(" 79797");
		String msg35=driver.findElement(By.id("message14")).getText();
		System.out.println(msg35);
		Thread.sleep(2000);
		
		/*TC005*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys("12345");
		String msg=driver.findElement(By.id("message")).getText();
		System.out.println(msg);
		Thread.sleep(2000);
		
		/*TC006*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys("@#$%");
		String msg1=driver.findElement(By.id("message")).getText();
		System.out.println(msg1);
		Thread.sleep(2000);
		
		/*TC007*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys("");
		driver.findElement(By.name("rad1")).click();
		String msg2=driver.findElement(By.id("message")).getText();
		System.out.println(msg2);
		Thread.sleep(2000);
		
		/*TC008*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("name")).sendKeys(" hello");
		String msg3=driver.findElement(By.id("message")).getText();
		System.out.println(msg3);
		Thread.sleep(2000);
		
		/*TC009*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("addr")).sendKeys("");
		driver.findElement(By.name("city")).click();
		String msg4=driver.findElement(By.id("message3")).getText();
		System.out.println(msg4);
		Thread.sleep(2000);
		
		/*TC010*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("addr")).sendKeys(" india");
		String msg5=driver.findElement(By.id("message3")).getText();
		System.out.println(msg5);
		Thread.sleep(2000);
		
		/*TC011*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("addr")).sendKeys("!@#$");
		String msg6=driver.findElement(By.id("message3")).getText();
		System.out.println(msg6);
		Thread.sleep(2000);
		
		/*TC012*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("city")).sendKeys("!@#$%");
		String msg8=driver.findElement(By.id("message4")).getText();
		System.out.println(msg8);
		Thread.sleep(2000);
		
		/*TC013*/		
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("city")).sendKeys("");
		driver.findElement(By.name("state")).click();
		String msg9=driver.findElement(By.id("message4")).getText();
		System.out.println(msg9);
		Thread.sleep(2000);
		
		/*TC014*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("city")).sendKeys("12345");
		String msg10=driver.findElement(By.id("message4")).getText();
		System.out.println(msg10);
		Thread.sleep(2000);
		
		/*TC015*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("city")).sendKeys(" hello");
		String msg11=driver.findElement(By.id("message4")).getText();
		System.out.println(msg11);
		Thread.sleep(2000);
		
		/*TC016*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("state")).sendKeys("123456");
		String msg12=driver.findElement(By.id("message5")).getText();
		System.out.println(msg12);
		Thread.sleep(2000);
		
		/*TC017*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("state")).sendKeys("");
		driver.findElement(By.name("city")).click();
		String msg13=driver.findElement(By.id("message5")).getText();
		System.out.println(msg13);
		Thread.sleep(2000);
		
		/*TC018*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("state")).sendKeys("!@#$");
		String msg14=driver.findElement(By.id("message5")).getText();
		System.out.println(msg14);
		Thread.sleep(2000);
		
		/*TC019*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("state")).sendKeys(" hello");
		String msg15=driver.findElement(By.id("message5")).getText();
		System.out.println(msg15);
		Thread.sleep(2000);
		
		/*TC020*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("pinno")).sendKeys("hello");
		String msg16=driver.findElement(By.id("message6")).getText();
		System.out.println(msg16);
		Thread.sleep(2000);
		
		/*TC021*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("pinno")).sendKeys("");
		driver.findElement(By.name("city")).click();
		String msg17=driver.findElement(By.id("message6")).getText();
		System.out.println(msg17);
		Thread.sleep(2000);
		
		/*TC022*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("pinno")).sendKeys("!@#$%");
		String msg19=driver.findElement(By.id("message6")).getText();
		System.out.println(msg19);
		Thread.sleep(2000);
		
		/*TC023*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("pinno")).sendKeys("12345");
		String msg20=driver.findElement(By.id("message6")).getText();
		System.out.println(msg20);
		Thread.sleep(2000);
		
		/*TC024*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("pinno")).sendKeys(" 12345");
		String msg21=driver.findElement(By.id("message6")).getText();
		System.out.println(msg21);
		Thread.sleep(2000);
		
		/*TC025*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("telephoneno")).sendKeys("");
		driver.findElement(By.name("city")).click();
		String msg22=driver.findElement(By.id("message7")).getText();
		System.out.println(msg22);
		Thread.sleep(2000);
		
		/*TC026*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("telephoneno")).sendKeys("!@#$%");
		String msg23=driver.findElement(By.id("message7")).getText();
		System.out.println(msg23);
		Thread.sleep(2000);
		
		/*TC027*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("telephoneno")).sendKeys("hello");
		String msg24=driver.findElement(By.id("message7")).getText();
		System.out.println(msg24);
		Thread.sleep(2000);
		
		/*TC028*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("telephoneno")).sendKeys(" 987654321");
		String msg25=driver.findElement(By.id("message7")).getText();
		System.out.println(msg25);
		Thread.sleep(2000);
		
		/*TC029*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("emailid")).sendKeys("");
		driver.findElement(By.name("city")).click();
		String msg26=driver.findElement(By.id("message9")).getText();
		System.out.println(msg26);
		Thread.sleep(2000);
		
		/*TC030*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("emailid")).sendKeys("abcd.com");
		String msg27=driver.findElement(By.id("message9")).getText();
		System.out.println(msg27);
		Thread.sleep(2000);
		
		/*TC031*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[2]/a")).click();
		driver.findElement(By.name("emailid")).sendKeys(" abc@gmail.com");
		String msg28=driver.findElement(By.id("message9")).getText();
		System.out.println(msg28);
		Thread.sleep(2000);

		/*TC032*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg29=driver.findElement(By.id("message2")).getText();
		System.out.println(msg29);
		Thread.sleep(2000);
		
		/*TC033*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg30=driver.findElement(By.id("message2")).getText();
		System.out.println(msg30);
		Thread.sleep(2000);
		
		/*TC034*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("helloacc");
		String msg31=driver.findElement(By.id("message2")).getText();
		System.out.println(msg31);
		Thread.sleep(2000);
		
		/*TC035*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("");
		driver.findElement(By.name("amountlowerlimit")).click();
		String msg36=driver.findElement(By.id("message2")).getText();
		System.out.println(msg36);
		Thread.sleep(2000);
		
		/*TC036*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg37=driver.findElement(By.id("message2")).getText();
		System.out.println(msg37);
		Thread.sleep(2000);
		
		/*TC037*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg38=driver.findElement(By.id("message2")).getText();
		System.out.println(msg38);
		Thread.sleep(2000);
		
		/*TC038*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("amountlowerlimit")).sendKeys("!@#$%");
		String msg39=driver.findElement(By.id("message12")).getText();
		System.out.println(msg39);
		Thread.sleep(2000);
		
		/*TC039*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("95081");
		driver.findElement(By.name("fdate")).sendKeys("21-06-2021");
		driver.findElement(By.name("tdate")).sendKeys("21-07-2021");
		driver.findElement(By.name("numtransaction")).sendKeys("2");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		String crr=driver.getCurrentUrl();
		String stmntpg="http://demo.guru99.com/V2/webpages/CustomisedStatementInput.php";
		if (crr!=stmntpg) {
			System.out.println("TC039-Failed");
		}
		driver.navigate().back();
		/*TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile=new File("C:\\Users\\Lenovo\\Desktop\\Automation Project\\Screenshot");
		FileHandler.copy(SrcFile, DestFile);
		Thread.sleep(2000);*/
		
		/*TC040*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("amountlowerlimit")).sendKeys("hello");
		String msg40=driver.findElement(By.id("message12")).getText();
		System.out.println(msg40);
		Thread.sleep(2000);
		
		/*TC041*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("numtransaction")).sendKeys("!@#$%");
		String msg41=driver.findElement(By.id("message13")).getText();
		System.out.println(msg41);
		Thread.sleep(2000);
		
		/*TC042*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("95081");
		driver.findElement(By.name("fdate")).sendKeys("21-06-2021");
		driver.findElement(By.name("tdate")).sendKeys("21-07-2021");
		driver.findElement(By.name("amountlowerlimit")).sendKeys("5000");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(3000);
		String crr1=driver.getCurrentUrl();
		String stmntpg1="http://demo.guru99.com/V2/webpages/CustomisedStatementInput.php";
		if (crr1!=stmntpg1) {
			System.out.println("TC042-Failed");
		}
		driver.navigate().back();
		
		/*TC043*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[14]/a")).click();
		driver.findElement(By.name("numtransaction")).sendKeys("hello");
		String msg42=driver.findElement(By.id("message13")).getText();
		System.out.println(msg42);
		Thread.sleep(2000);
		
		/*TC044*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[1]/td/p")).click();
		String msg43=driver.findElement(By.id("message2")).getText();
		System.out.println(msg43);
		Thread.sleep(2000);
		
		/*TC0045*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$");
		String msg44=driver.findElement(By.id("message2")).getText();
		System.out.println(msg44);
		Thread.sleep(2000);
		
		/*TC046*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[7]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg45=driver.findElement(By.id("message2")).getText();
		System.out.println(msg45);
		Thread.sleep(2000);
		
		/*TC047*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[1]")).click();
		String msg46=driver.findElement(By.id("message14")).getText();
		System.out.println(msg46);
		Thread.sleep(2000);
		
		/*TC048*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("!@#$%");
		String msg47=driver.findElement(By.id("message14")).getText();
		System.out.println(msg47);
		Thread.sleep(2000);
		
		/*TC049*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("hello");
		String msg48=driver.findElement(By.id("message14")).getText();
		System.out.println(msg48);
		Thread.sleep(2000);
		
		/*TC050*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[4]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys(" 10619");
		String msg49=driver.findElement(By.id("message14")).getText();
		System.out.println(msg49);
		Thread.sleep(2000);
		
		/*TC051*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg50=driver.findElement(By.id("message2")).getText();
		System.out.println(msg50);
		Thread.sleep(2000);
		
		/*TC052*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg51=driver.findElement(By.id("message2")).getText();
		System.out.println(msg51);
		Thread.sleep(2000);
		
		/*TC053*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg52=driver.findElement(By.id("message2")).getText();
		System.out.println(msg52);
		Thread.sleep(2000);
		
		/*TC054*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("ammount")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg53=driver.findElement(By.id("message17")).getText();
		System.out.println(msg53);
		Thread.sleep(2000);
		
		/*TC055*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("!@#$%");
		String msg54=driver.findElement(By.id("message17")).getText();
		System.out.println(msg54);
		Thread.sleep(2000);
		
		/*TC056*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("hello");
		String msg55=driver.findElement(By.id("message17")).getText();
		System.out.println(msg55);
		Thread.sleep(2000);
		
		/*TC057*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[8]/a")).click();
		driver.findElement(By.name("desc")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg56=driver.findElement(By.id("message17")).getText();
		System.out.println(msg56);
		Thread.sleep(2000);
		
		/*TC058*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[6]/a")).click();
		driver.findElement(By.name("accountno")).click();
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg57=driver.findElement(By.id("message2")).getText();
		System.out.println(msg57);
		Thread.sleep(2000);
		
		/*TC059*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[6]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg58=driver.findElement(By.id("message2")).getText();
		System.out.println(msg58);
		Thread.sleep(2000);
		
		/*TC060*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[6]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg59=driver.findElement(By.id("message2")).getText();
		System.out.println(msg59);
		Thread.sleep(2000);
		
		/*TC061*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[3]/a")).click();
		driver.findElement(By.name("cusid")).sendKeys("10619");
		driver.findElement(By.name("AccSubmit")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("addr")).clear();
		driver.findElement(By.name("addr")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg60=driver.findElement(By.id("message3")).getText();
		System.out.println(msg60);
		Thread.sleep(2000);
		
		/*TC062*/
		driver.findElement(By.name("addr")).clear();
		driver.findElement(By.name("addr")).sendKeys(" varanasi");
		String msg61=driver.findElement(By.id("message3")).getText();
		System.out.println(msg61);
		Thread.sleep(2000);
		
		/*TC063*/
		driver.findElement(By.name("addr")).clear();
		driver.findElement(By.name("addr")).sendKeys("!@#$%");
		String msg62=driver.findElement(By.id("message3")).getText();
		System.out.println(msg62);
		Thread.sleep(2000);
		
		/*TC064*/
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("!@#$%");
		String msg63=driver.findElement(By.id("message4")).getText();
		System.out.println(msg63);
		Thread.sleep(2000);
		
		/*TC065*/
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg64=driver.findElement(By.id("message4")).getText();
		System.out.println(msg64);
		Thread.sleep(2000);
		
		/*TC066*/
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys("78945");
		String msg65=driver.findElement(By.id("message4")).getText();
		System.out.println(msg65);
		Thread.sleep(2000);
		
		/*TC067*/
		driver.findElement(By.name("city")).clear();
		driver.findElement(By.name("city")).sendKeys(" varanasi");
		String msg66=driver.findElement(By.id("message4")).getText();
		System.out.println(msg66);
		Thread.sleep(2000);
		
		/*TC068*/
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("78797");
		String msg67=driver.findElement(By.id("message5")).getText();
		System.out.println(msg67);
		Thread.sleep(2000);
		
		/*TC069*/
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg68=driver.findElement(By.id("message5")).getText();
		System.out.println(msg68);
		Thread.sleep(2000);
		
		/*TC070*/
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys("!@#$");
		String msg69=driver.findElement(By.id("message5")).getText();
		System.out.println(msg69);
		Thread.sleep(2000);
		
		/*TC071*/
		driver.findElement(By.name("state")).clear();
		driver.findElement(By.name("state")).sendKeys(" Delhi");
		String msg70=driver.findElement(By.id("message5")).getText();
		System.out.println(msg70);
		Thread.sleep(2000);
		
		/*TC072*/
		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys("hello");
		String msg71=driver.findElement(By.id("message6")).getText();
		System.out.println(msg71);
		Thread.sleep(2000);
		
		/*TC073*/
		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg72=driver.findElement(By.id("message6")).getText();
		System.out.println(msg72);
		Thread.sleep(2000);
		
		/*TC074*/
		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys("!@#$%");
		String msg73=driver.findElement(By.id("message6")).getText();
		System.out.println(msg73);
		Thread.sleep(2000);
		
		/*TC075*/
		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys("12345");
		String msg74=driver.findElement(By.id("message6")).getText();
		System.out.println(msg74);
		Thread.sleep(2000);
		
		/*TC076*/
		driver.findElement(By.name("pinno")).clear();
		driver.findElement(By.name("pinno")).sendKeys(" 1234567");
		String msg75=driver.findElement(By.id("message6")).getText();
		System.out.println(msg75);
		Thread.sleep(2000);
		
		/*TC077*/
		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg76=driver.findElement(By.id("message7")).getText();
		System.out.println(msg76);
		Thread.sleep(2000);
		
		/*TC078*/
		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys("!@#$%");
		String msg77=driver.findElement(By.id("message7")).getText();
		System.out.println(msg77);
		Thread.sleep(2000);
		
		/*TC079*/
		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys("hello");
		String msg78=driver.findElement(By.id("message7")).getText();
		System.out.println(msg78);
		Thread.sleep(2000);
		
		/*TC080*/
		driver.findElement(By.name("telephoneno")).clear();
		driver.findElement(By.name("telephoneno")).sendKeys(" 9755676414");
		String msg79=driver.findElement(By.id("message7")).getText();
		System.out.println(msg79);
		Thread.sleep(2000);
		
		/*TC081*/
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[1]")).click();
		String msg80=driver.findElement(By.id("message9")).getText();
		System.out.println(msg80);
		Thread.sleep(2000);
		
		/*TC082*/
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("abc.com");
		String msg81=driver.findElement(By.id("message9")).getText();
		System.out.println(msg81);
		Thread.sleep(2000);
		
		/*TC083*/
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys(" abc@gmail.com");
		String msg82=driver.findElement(By.id("message9")).getText();
		System.out.println(msg82);
		Thread.sleep(2000);
		
		/*TC084*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payersaccount")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg83=driver.findElement(By.id("message10")).getText();
		System.out.println(msg83);
		Thread.sleep(2000);
		
		/*TC085*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payersaccount")).sendKeys("!@#$%");
		String msg84=driver.findElement(By.id("message10")).getText();
		System.out.println(msg84);
		Thread.sleep(2000);
		
		/*TC086*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payersaccount")).sendKeys("hello");
		String msg85=driver.findElement(By.id("message10")).getText();
		System.out.println(msg85);
		Thread.sleep(2000);
		
		/*TC087*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payeeaccount")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg86=driver.findElement(By.id("message11")).getText();
		System.out.println(msg86);
		Thread.sleep(2000);
		
		/*TC088*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payeeaccount")).sendKeys("!@#$%");
		String msg87=driver.findElement(By.id("message11")).getText();
		System.out.println(msg87);
		Thread.sleep(2000);
		
		/*TC089*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("payeeaccount")).sendKeys("hello");
		String msg88=driver.findElement(By.id("message11")).getText();
		System.out.println(msg88);
		Thread.sleep(2000);
		
		/*TC090*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg89=driver.findElement(By.id("message1")).getText();
		System.out.println(msg89);
		Thread.sleep(2000);
		
		/*TC091*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("hello");
		String msg90=driver.findElement(By.id("message1")).getText();
		System.out.println(msg90);
		Thread.sleep(2000);
		
		/*TC092*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("!@#$");
		String msg91=driver.findElement(By.id("message1")).getText();
		System.out.println(msg91);
		Thread.sleep(2000);
		
		/*TC093*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[10]/a")).click();
		driver.findElement(By.name("desc")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg92=driver.findElement(By.id("message17")).getText();
		System.out.println(msg92);
		Thread.sleep(2000);
		
		/*TC094*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[13]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg93=driver.findElement(By.id("message2")).getText();
		System.out.println(msg93);
		Thread.sleep(2000);
		
		/*TC095*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[13]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg94=driver.findElement(By.id("message2")).getText();
		System.out.println(msg94);
		Thread.sleep(2000);
		
		/*TC096*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[13]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg95=driver.findElement(By.id("message2")).getText();
		System.out.println(msg95);
		Thread.sleep(2000);
		
		/*TC097*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg96=driver.findElement(By.id("message20")).getText();
		System.out.println(msg96);
		Thread.sleep(2000);
		
		/*TC098*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("newpassword")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg97=driver.findElement(By.id("message21")).getText();
		System.out.println(msg97);
		Thread.sleep(2000);
		
		/*TC099*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("zupynem1@");
		driver.findElement(By.name("newpassword")).sendKeys("helloutk");
		String msg98=driver.findElement(By.id("message21")).getText();
		System.out.println(msg98);
		Thread.sleep(2000);
		
		/*TC100*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("zupynem1@");
		driver.findElement(By.name("newpassword")).sendKeys("helloutk1");
		String msg99=driver.findElement(By.id("message21")).getText();
		System.out.println(msg99);
		Thread.sleep(2000);
		
		/*TC101*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("oldpassword")).sendKeys("zupynem1@");
		driver.findElement(By.name("newpassword")).sendKeys("1@");
		driver.findElement(By.name("confirmpassword")).sendKeys("1@");
		System.out.println("TC101-Failed");
		Thread.sleep(2000);
		
		/*TC102*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("confirmpassword")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[1]")).click();
		String msg100=driver.findElement(By.id("message22")).getText();
		System.out.println(msg100);
		Thread.sleep(2000);
		
		/*TC103*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[11]/a")).click();
		driver.findElement(By.name("newpassword")).sendKeys("hello@123");
		driver.findElement(By.name("confirmpassword")).sendKeys("hello@12");
		String msg101=driver.findElement(By.id("message22")).getText();
		System.out.println(msg101);
		Thread.sleep(2000);
		
		/*TC104*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg102=driver.findElement(By.id("message2")).getText();
		System.out.println(msg102);
		Thread.sleep(2000);
		
		/*TC105*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("!@#$%");
		String msg103=driver.findElement(By.id("message2")).getText();
		System.out.println(msg103);
		Thread.sleep(2000);
		
		/*TC106*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("accountno")).sendKeys("hello");
		String msg104=driver.findElement(By.id("message2")).getText();
		System.out.println(msg104);
		Thread.sleep(2000);
		
		/*TC107*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg105=driver.findElement(By.id("message1")).getText();
		System.out.println(msg105);
		Thread.sleep(2000);
		
		/*TC108*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("!@#$%");
		String msg106=driver.findElement(By.id("message1")).getText();
		System.out.println(msg106);
		Thread.sleep(2000);
		
		/*TC109*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("ammount")).sendKeys("hello");
		String msg107=driver.findElement(By.id("message1")).getText();
		System.out.println(msg107);
		Thread.sleep(2000);
		
		/*TC110*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[9]/a")).click();
		driver.findElement(By.name("desc")).sendKeys("");
		driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[1]")).click();
		String msg108=driver.findElement(By.id("message17")).getText();
		System.out.println(msg108);
		Thread.sleep(2000);
		
		/*TC111*/
		driver.findElement(By.xpath("/html/body/div[3]/div/ul/li[15]/a")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		WebElement uid=driver.findElement(By.name("uid"));
		uid.sendKeys("");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]")).click();
		String msg109=driver.findElement(By.id("message23")).getText();
		System.out.println(msg109);
		Thread.sleep(2000);
		
		/*TC112*/
		WebElement pd=driver.findElement(By.name("password"));
		pd.sendKeys("");
		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[1]/td[1]")).click();
		String msg110=driver.findElement(By.id("message18")).getText();
		System.out.println(msg110);
		Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
		
	}
}
