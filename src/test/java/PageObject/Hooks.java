package PageObject;

import demo.TestBase;
import org.testng.annotations.BeforeSuite;

public class Hooks extends TestBase {
    @BeforeSuite
    public static void initilize() throws Exception{
        //com.demo.DriverManager.configarationManager.conficfile();
        TestBase.initilize();
        driver.navigate().refresh();
    }

}

