package uk.co.library.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
      /*Locators - jobTitle, location, distanceDropDown, moreSearchOptionsLink, salaryMin,
salaryMax, salaryTypeDropDown, jobTypeDropDown, findJobsBtn*/

      /*Methods - enterJobTitle(String jobTitle), enterLocation(String location),
selectDistance(String distance), clickOnMoreSearchOptionLink(),
enterMinSalary(String minSalary), enterMaxSalary(String maxSalary), selectSalaryType(String
sType), selectJobType(String jobType),
clickOnFindJobsButton().*/

      public HomePage() {
          PageFactory.initElements(driver,this);
      }
      @FindBy(xpath = "//input[@id='keywords']")
      WebElement jobTitleField;
      @FindBy(xpath = "//input[@id='location']")
      WebElement enterLocation;
      @FindBy(xpath = "//select[@id='distance']")
      WebElement selectdistanceDropDown;
      @FindBy(xpath = "//button[@id='toggle-hp-search']")
      WebElement moreSearchOptionsLink;
      @FindBy(xpath ="//input[@id='salarymin']")
      WebElement entersalaryMin;
      @FindBy(xpath = "//input[@id='salarymax']")
      WebElement entersalaryMax;
      @FindBy(xpath = "//select[@id='salarytype']")
      WebElement selectSalaryTypefromdropdown;
      @FindBy(xpath="//select[@id='tempperm']")
      WebElement jobTypeDropDownField;
     // @FindBy(xpath = "//input[@id='hp-search-btn']")
      @FindBy(xpath = "//input[@id='hp-search-btn']")
      WebElement findJobsBtn;


      public void enterJobTitle(String jobTitle) {
          Reporter.log("enter job title "+ jobTitleField.toString());
        sendTextToElement(jobTitleField,jobTitle);
      }
      public void enterLocation(String location){
          Reporter.log("enter the locatoin "+enterLocation.toString());
          sendTextToElement(enterLocation,location);
      }
      public void selectDistance(String distance){
          Reporter.log("Select the distance"+ selectdistanceDropDown.toString());
          selectByVisibleTextFromDropDown(selectdistanceDropDown,distance );
      }
      public void clickOnMoreSearchOptionLink(){
          clickOnElement(moreSearchOptionsLink);
      }
      public void enterMinSalary(String minSalary){
          Reporter.log("enter mimimum salary "+ entersalaryMin.toString());
          sendTextToElement(entersalaryMin,minSalary);
      }
      public void enterMaxSalary(String maxSalary){
          Reporter.log("enter maximum salary"+entersalaryMax.toString());
          sendTextToElement(entersalaryMax,maxSalary);
      }
      public void selectSalaryType(String sType){
          Reporter.log("Select salalry typr from drop down"+ selectSalaryTypefromdropdown.toString());
          selectByVisibleTextFromDropDown(selectSalaryTypefromdropdown,sType);
    }
      public void selectJobType(String jobType){
          Reporter.log("job type dropdown field"+jobTypeDropDownField.toString());
          selectByVisibleTextFromDropDown(jobTypeDropDownField,jobType);
      }
      public void clickOnFindJobsButton(){
          clickOnElement(findJobsBtn);
      }
//    public void setAcceptCookies(){
//        switchToAlert(iframe);
//        pmClickOnElement(acceptCookies);
//        driver.switchTo().defaultContent();
//    }




}
