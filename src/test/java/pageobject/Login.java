package pageobject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import utilty.Hook;

public class Login {

@FindBy(how = How.ID,using = "email")
private WebElement email;

@FindBy(how = How.NAME,using = "password")
private WebElement password;



public void enterEmail(){

    email.sendKeys("j.mingelangela@yahoo.com");
}

   public void enterPassword(){

    password.sendKeys("Kayodelem11");

   }


}
