package com.library.pages;

import com.library.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id="inputEmail")
    private WebElement email;

    @FindBy(id="inputPassword")
    private WebElement password;


    public void login(){

        String emailValue= ConfigurationReader.getProperty("email");
        String passwordValue=ConfigurationReader.getProperty("password");

        email.sendKeys(emailValue);
        password.sendKeys(passwordValue, Keys.ENTER);
    }
}
