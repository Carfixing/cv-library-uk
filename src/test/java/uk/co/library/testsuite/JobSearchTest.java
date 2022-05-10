package uk.co.library.testsuite;



import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import resources.testdata.TestData;
import uk.co.library.pages.HomePage;
import uk.co.library.pages.ResultPage;
import uk.co.library.testbase.TestBase;

/**
 * Created by Jay Vaghani
 */

public class JobSearchTest extends TestBase {
    HomePage homePage;
    ResultPage resultPage;

//    @BeforeMethod(groups = {"regression"})
    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage = new HomePage();
        resultPage = new ResultPage();
    }

//    @Test(dataProvider = "jobcriteria",dataProviderClass = TestData.class,groups = {"sanity"})
    @Test(dataProvider = "jobcriteria",dataProviderClass = TestData.class)
    public void verifyJobSearchResultUsingDifferentDataSet(String jobTitle, String location, String
            distance, String salaryMin, String salaryMax, String salaryType, String jobType,
                                                            String result) throws InterruptedException {
        SoftAssert softAssert = new SoftAssert();
        homePage.enterJobTitle(jobTitle);
        homePage.enterLocation(location);
        homePage.selectDistance(distance);
        homePage.clickOnMoreSearchOptionLink();
        homePage.enterMinSalary(salaryMin);
        homePage.enterMaxSalary(salaryMax);
        homePage.selectSalaryType(salaryType);
        homePage.selectJobType(jobType);
        homePage.clickOnFindJobsButton();
//        String expectedMessage = result;
//        String actualMessage = resultPage.verifyTheResults();
//        Assert.assertEquals(actualMessage, expectedMessage, "Results not display");

//        String actualMessage = resultPage.verifyTheResults();
//        Assert.assertEquals(actualMessage,result,"Not Match");
//        softAssert.assertAll();
       acceptAlert();
    }
    @AfterMethod
    public void teardown()
    {
        closeBrowser();
    }
}
