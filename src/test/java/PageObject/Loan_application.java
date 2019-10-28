package PageObject;

import demo.TestBase;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Loan_application extends TestBase {

    @Test
    public void FullName() throws Exception {
        TestBase.byXpath("FullName_Xpath").sendKeys(TestData.getProperty("TestComments"));
        Thread.sleep(3000);
    }

    @Test
    public void Gender() throws Exception {
        TestBase.byXpath("Male_Xpath").click();
        Thread.sleep(3000);
    }

    @Test
    public void Age() throws Exception {
        TestBase.byXpath("Age_Xpath").sendKeys(TestData.getProperty("Age_Comments"));
        Thread.sleep(3000);
    }

    @Test
    public void pan() throws Exception {
        TestBase.byXpath("Pan_card_Xpath").sendKeys(TestData.getProperty("Pan_card_no"));
        Thread.sleep(3000);
    }

    @Test
    public void Marriage() throws Exception {
        TestBase.byXpath("Married_Xpath").click();
        Thread.sleep(3000);
    }

    @Test
    public void Email() throws Exception {
        TestBase.byXpath("Email_Xpath").sendKeys(TestData.getProperty("Email_address"));
        Thread.sleep(3000);
    }

    @Test
    public void phone() throws Exception {
        TestBase.byXpath("Phnoe_Xpath").sendKeys(TestData.getProperty("Phone_number"));
        Thread.sleep(3000);
    }

    @Test
    public void Dependent() throws Exception {
        TestBase.byXpath("Dependent_Xpath").sendKeys(TestData.getProperty("Dependent"));
        Thread.sleep(3000);
    }

    @Test
    public void Address() throws Exception {
        TestBase.byXpath("Current_Address_Xpath").sendKeys(TestData.getProperty("Current_Address"));
        Thread.sleep(3000);
    }

    @Test
    public void Permanent_Address() throws Exception {
        TestBase.byXpath("Permanent_Address_xpath").sendKeys(TestData.getProperty("Permanent_Address"));
        Thread.sleep(3000);
    }

    @Test
    public void Employee_Status() throws Exception {
        Select Employee_Status = new Select(TestBase.byXpath("Employee_Status_Xpath"));
        Employee_Status.selectByVisibleText(TestData.getProperty("Employee_Status"));
        Employee_Status.selectByIndex(1);
        Thread.sleep(3000);
        ((JavascriptExecutor) TestBase.driver).executeScript("scroll(0,600)");
    }

    @Test
    public void Company_Type() throws Exception {
        Select Company_Type = new Select(TestBase.byXpath("Company_Type_Xpath"));
        Company_Type.selectByVisibleText(TestData.getProperty("Company_Type_Value"));
    }

    @Test
    public void Date_of_Birth() throws Exception {
        // Date Value
        Select Date = new Select(TestBase.byXpath("Date_Xpath"));
        Date.selectByVisibleText(TestData.getProperty("Date_value"));
        Thread.sleep(2000);

        Select Month = new Select(TestBase.byXpath("Month_Xpath"));
        Month.selectByVisibleText(TestData.getProperty("Month_Value"));
        Thread.sleep(2000);

        Select Year = new Select(TestBase.byXpath("Year_Xpath"));
        Year.selectByVisibleText(TestData.getProperty("Year_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Zip_Code() throws Exception {
        TestBase.byXpath("Zip_Code_Xpath").sendKeys(TestData.getProperty("Zip_Code_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Work_Experience() throws Exception {
        TestBase.byXpath("Work_Experience_Xpath").sendKeys(TestData.getProperty("Work_Experience_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Annual_Income() throws Exception {
        TestBase.byXpath("Annual_Income_Xpath").sendKeys(TestData.getProperty("Annual_Income_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Cibil_Score() throws Exception {
        TestBase.byXpath("Cibil_Score_Xpath").sendKeys(TestData.getProperty("Cibil_Score_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Loan_Amount() throws Exception {
        TestBase.byXpath("Loan_Amount_Xpath").sendKeys(TestData.getProperty("Loan_Amount_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Loan_Tenure() throws Exception {
        TestBase.byXpath("Loan_Tenure_Xpath").sendKeys(TestData.getProperty("Loan_Tenure_Value"));
        Thread.sleep(2000);
    }

    @Test
    public void Submit() throws Exception {

        TestBase.byXpath("Submit_Xpath").click();
        Thread.sleep(5000);
        if (!TestBase.byXpath("PDF_download").isSelected()) {
            TestBase.byXpath("PDF_download").click();
            Thread.sleep(3000);
        } else if (TestBase.byXpath("Back_arrow_xpath").isSelected()) {
            TestBase.byXpath("Back_arrow_xpath").click();
            Thread.sleep(3000);
        }
    }

}