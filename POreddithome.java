package alpha_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POreddithome {
public WebDriver driver;

@FindBy(xpath="//a[@class='_1HunhFR-0b-AYs0WG9mU_P _2v9O1a_TWErxU2ZPvQ5jwC _3Wg53T10KuuPmyWOMWsY2F _2nelDm85zKKmuD94NequP0']")
WebElement  login;

@FindBy(id="loginUsername" )
WebElement  username;
@FindBy(id= "loginPassword")
WebElement  pass;
@FindBy(xpath="//button[@class='AnimatedForm__submitButton']")
WebElement  submit;
			public POreddithome(WebDriver driver) {
				this.driver = driver;
				PageFactory.initElements(driver, this);
				}
			
			
			public void clickLOGIN() {
				login.click();
			}
			public void clickSubmitButt() {
				submit.click();
			}
}
