package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager extends ConfigarationManager {

    //public static ConfigarationManager configarationManager = new ConfigarationManager();
    public static WebDriver driver;


    public static void browser() throws Exception {

        ConfigarationManager.conficfile();
        String Url = ConfigarationManager.config.getProperty("URL");
        String browsername = ConfigarationManager.config.getProperty("browser1");
        if (browsername.equalsIgnoreCase("Chrome")) {

//            WebElement frm = driver.findElement(By.xpath("//iframe[@tabindex='0']"));
//    driver.switchTo().frame(frm); using Frame
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\com_loan_appication_form_demo\\Driver\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            WebDriverWait wait=new WebDriverWait(driver, 30);
            // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("URL")));
        }
        driver.get(Url);


    }
}


