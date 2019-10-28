package TestCase;

import PageObject.Hooks;
import PageObject.Loan_application;
import PageObject.Quite_driver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verifi_From {
    Hooks hooks = new Hooks();
    Loan_application loan_application =new Loan_application();
    Quite_driver quite_driver = new Quite_driver();

    @BeforeTest
    public void url() throws Exception {
        hooks.initilize();
    }
    @Test(priority = 4)
    public void Blank_FullName() throws Exception {

        loan_application.Gender();
        loan_application.Age();
        loan_application.Email();
        loan_application.Marriage();
        loan_application.pan();
        loan_application.Marriage();
        loan_application.phone();
        loan_application.Dependent();
        loan_application.Address();
        loan_application.Permanent_Address();
        loan_application.Employee_Status();
        loan_application.Company_Type();
        loan_application.Date_of_Birth();
        loan_application.Zip_Code();
        loan_application.Work_Experience();
        loan_application.Annual_Income();
        loan_application.Cibil_Score();
        loan_application.Loan_Amount();
        loan_application.Loan_Tenure();
        loan_application.Submit();

    }
    @Test(priority = 3)
    public void Age() throws Exception {

        loan_application.FullName();
        loan_application.Gender();
        loan_application.Email();
        loan_application.Marriage();
        loan_application.pan();
        loan_application.Marriage();
        loan_application.phone();
        loan_application.Dependent();
        loan_application.Address();
        loan_application.Permanent_Address();
        loan_application.Employee_Status();
        loan_application.Company_Type();
        loan_application.Date_of_Birth();
        loan_application.Zip_Code();
        loan_application.Work_Experience();
        loan_application.Annual_Income();
        loan_application.Cibil_Score();
        loan_application.Loan_Amount();
        loan_application.Loan_Tenure();
        loan_application.Submit();

    }
    @Test(priority = 2)
    public void Address() throws Exception {
        loan_application.FullName();
        loan_application.Gender();
        loan_application.Age();
        loan_application.Email();
        loan_application.Marriage();
        loan_application.pan();
        loan_application.Marriage();
        loan_application.phone();
        loan_application.Dependent();
        loan_application.Permanent_Address();
        loan_application.Employee_Status();
        loan_application.Company_Type();
        loan_application.Date_of_Birth();
        loan_application.Zip_Code();
        loan_application.Work_Experience();
        loan_application.Annual_Income();
        loan_application.Cibil_Score();
        loan_application.Loan_Amount();
        loan_application.Loan_Tenure();
        loan_application.Submit();

    }
    @Test(priority = 1)
    public void Loan_application() throws Exception {
    loan_application.FullName();
    loan_application.Gender();
    loan_application.Age();
    loan_application.Email();
    loan_application.Marriage();
    loan_application.pan();
    loan_application.Marriage();
    loan_application.phone();
    loan_application.Dependent();
    loan_application.Address();
    loan_application.Permanent_Address();
    loan_application.Employee_Status();
    loan_application.Company_Type();
    loan_application.Date_of_Birth();
    loan_application.Zip_Code();
    loan_application.Work_Experience();
    loan_application.Annual_Income();
    loan_application.Cibil_Score();
    loan_application.Loan_Amount();
    loan_application.Loan_Tenure();
    loan_application.Submit();

    }
    @AfterTest
    public void Quite_Test(){
        quite_driver.Quite();
    }
}
