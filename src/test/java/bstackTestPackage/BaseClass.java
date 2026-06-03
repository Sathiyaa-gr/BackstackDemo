package bstackTestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {
	public WebDriver driver;

    
    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://bstackdemo.com/");
    }
    /*@Parameters("browser")
    
    public void browserlaunch(@Optional("chrome") String browser)
    {
        System.out.println("Launching Browser : " + browser);

        if(browser.equalsIgnoreCase("Chrome"))
        {
            driver = new ChromeDriver();
            System.out.println("Chrome Driver Created");
        }
        else if(browser.equalsIgnoreCase("Edge"))
        {
            driver = new EdgeDriver();
            System.out.println("Edge Driver Created");
        }

        driver.get("https://bstackdemo.com/");
        System.out.println("Application Opened");
    }
*/
    
    @AfterMethod
    public void tearDown() {

       // driver.quit();
    }

}
