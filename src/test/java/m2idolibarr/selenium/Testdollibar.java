package m2idolibarr.selenium;


import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Testdollibar {
	ChromeDriver driver;
	@Before
	public void testconnexion() {
		// on instancie le driver
		
		driver=new ChromeDriver();
		driver.get("http://demo.testlogiciel.pro/dolibarr");
		driver.findElement(By.id("username")).sendKeys("jsmith");
		driver.findElement(By.id("password")).sendKeys("hp");
		driver.findElement(By.className("button")).click();
	}
		
	@After
	public void teadown() {
		driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
		driver.close();	
	}
		
		
		
		@Test
	public void testConnexion() {
		
		//driver=new ChromeDriver();
		//driver.get("http://demo.testlogiciel.pro/dolibarr");
		//driver.findElement(By.id("username")).sendKeys("jsmith");
		//driver.findElement(By.id("password")).sendKeys("hp");
		//driver.findElement(By.className("button")).click();
	Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
		//driver.findElement(By.cssSelector("img.login")).click();;
		//driver.findElement(By.xpath("//img[@alt='Déconnexion']")).click();
		//driver.close();
	}



@Test
public void tonton() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://demo.testlogiciel.pro/dolibarr");
	driver.findElement(By.id("username")).sendKeys("jsmith");
	driver.findElement(By.id("password")).sendKeys("hp");
	driver.findElement(By.className("button")).click();
	Assert.assertEquals("Espace accueil", driver.findElement(By.className("titre")).getText());
	driver.findElement(By.cssSelector("div.mainmenu.companies")).click();;
	//driver.findElement(By.cssSelector("a.vsmenu")).click();;
	driver.findElement(By.linkText("Nouveau tiers")).click();
	driver.findElement(By.name("nom")).sendKeys("quintin");
	driver.findElement(By.name("firstname")).sendKeys("gilles");
	new Select(driver.findElement(By.name("civilite_id"))).selectByVisibleText("Docteur");
	new Select(driver.findElement(By.name("client"))).selectByVisibleText("Client");
	driver.findElement(By.name("address")).sendKeys("70 Rue Charles Le Goffic");
	driver.findElement(By.name("zipcode")).sendKeys("29000");
	driver.findElement(By.name("town")).sendKeys("Quimper");
	new Select(driver.findElement(By.name("country_id"))).selectByVisibleText("Papouasie-Nouvelle-Guinée (PG)");

	driver.findElement(By.xpath("//input[@value='Créer tiers']")).click();
 


//driver.close();

}
}