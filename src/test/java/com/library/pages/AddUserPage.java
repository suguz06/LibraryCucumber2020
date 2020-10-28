package com.library.pages;

import com.library.utilities.BrowserUtils;
import com.library.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddUserPage extends BasePage {

    @FindBy(xpath = "//span[.='Users']")
    private WebElement userBtn;

    @FindBy(xpath = "//*[@id=\"users\"]/div[1]/div[1]/span/a")
    private WebElement addUserBtn;

    @FindBy(name = "full_name")
    private WebElement fullNameInput;

    @FindBy(name = "password")
    private WebElement passwordInput;

    @FindBy(name = "email")
    private WebElement emailInput;

    @FindBy (xpath = "//button[.='Save changes']")
    private WebElement saveBtn;

    public void clickSaveBtn(){
        saveBtn.click();
    }

    public void clickbtnAddUSer() {
        addUserBtn.click();
    }

    public void clickbtnUser() {
        userBtn.click();
    }

    public void enterFullName (String fullName) {
        BrowserUtils.enterText(fullNameInput, fullName);
    }
    public void enterPassword (String password) {
        BrowserUtils.enterText(passwordInput, password);
    }
    public void enterEmail (String email) {
        BrowserUtils.enterText(emailInput, email);
    }


}
