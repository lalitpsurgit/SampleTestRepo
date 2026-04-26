package TestPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RunTestCls {

	public static void main(String[] args) throws InterruptedException {
		
//		System.out.println("Test Rin from GIT");
//		System.out.println("Test Rin from GIT added newly");
//		System.out.println("Test Rin from GIT added newly newly");
//		System.out.println("Test Rin from GIT added newly newly newly");
		
//		ChromeDriver dr = new ChromeDriver();
//		dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
//		Thread.sleep(10000);
//		System.out.println("Browser opened: "+dr.getWindowHandle());
//		dr.close();
		
		//==================================================
		
		ChromeDriver wd = new ChromeDriver();
		//EdgeDriver wd = new EdgeDriver();
		
		//FirefoxDriver wd = new FirefoxDriver();
		
		//WebDriver wd = new FirefoxDriver();
		wd.get("https://orangehrm.com/");		
		
		//scroll doen the page
//		JavascriptExecutor js = (JavascriptExecutor) wd;
//		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		System.out.println("test");
		
		String gett = wd.findElement(By.xpath("//button[@class='CybotCookiebotDialogBodyButton']")).getText();
		System.out.println("text on the button : "+gett);
		wd.findElement(By.xpath("//button[@class='CybotCookiebotDialogBodyButton']")).click();
		
		//Actions ac = new Actions(wd);
		//ac.click(wd.findElement(By.xpath("//button[@class='CybotCookiebotDialogBodyButton']"))).build().perform();
		
		System.out.println("test passed");
		
		wd.close();
		
	}

}
