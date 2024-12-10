package Week4.day1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHomeAssignment {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(30));

	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();

	driver.findElement(By.xpath("//a[@href='/crmsfa/control/contactsMain']")).click();
    driver.findElement(By.xpath("//a[@href='/crmsfa/control/mergeContactsForm']")).click();
    
    //clickon From widget
    driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
  
    Set<String> fromWindow = driver.getWindowHandles();
 
    System.out.println("All windows list:"+fromWindow);
    
    //Set to list conversion
    ArrayList<String> fromWindowList = new ArrayList<String>(fromWindow);
    
   //switching to child window
    driver.switchTo().window(fromWindowList.get(1));
    
    driver.findElement(By.xpath("//a[@class='linktext']")).click();
    //switch again to parent window
    driver.switchTo().window(fromWindowList.get(0));
    
  
    
  //clickon To widget
    driver.findElement(By.xpath("//table[@id='widget_ComboBox_partyIdTo']//following::a")).click();
    
    Set<String> toWindow = driver.getWindowHandles();
    
    System.out.println("All windows list:"+toWindow);
    
    //Set to list conversion
    ArrayList<String> toWindowList = new ArrayList<String>(toWindow);
    
   //switching to child window
    driver.switchTo().window(toWindowList.get(1));
    
    driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
    
    //switch again to parent window
    driver.switchTo().window(toWindowList.get(0));
    
    
    
    
    
    
    
    //Clicking on merge button
    driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
    
    Alert confirmalert = driver.switchTo().alert();   
    confirmalert.accept();
    
   
    
    String mergedPageTitle  = driver.getTitle();
    System.out.println("The title of the Merged page is:"+mergedPageTitle);
    
    driver.quit();
	
    
	}

}
