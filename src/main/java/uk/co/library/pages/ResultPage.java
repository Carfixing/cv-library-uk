package uk.co.library.pages;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

/**
 * Created by Jay Vaghani
 */
public class ResultPage extends Utility {

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

     @FindBy(xpath = "//h1[normalize-space()='Permanent Tester jobs in Harrow on the Hill']")
    WebElement resultText;

    public String verifyTheResults(){
        return getTextFromElement(resultText);

    }

}
