package com.library.step_definitions;

import com.library.pages.AddUserPage;
import com.library.pages.LoginPage;
import com.library.utilities.BrowserUtils;
import com.library.utilities.ConfigurationReader;
import com.library.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.Map;
import java.util.concurrent.TimeUnit;

public class AddUserStepDefinitions {

    LoginPage loginPage = new LoginPage();
    AddUserPage addUserPage = new AddUserPage();

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);


    }


    @Given("user logs in")
    public void user_logs_in() {

        loginPage.login();
    }

    @Given("user select Users module")
    public void user_select_users_module() {
        addUserPage.clickbtnUser();
        BrowserUtils.wait(3);
    }

    @Given("user select  Add User  button")
    public void user_select_add_user_button() {
        addUserPage.clickbtnAddUSer();
    }

    @When("user adds new user information")
    public void user_adds_new_user_information(Map<String, String> dataTable) {
        String fullName = dataTable.get("Full Name");
        String password = dataTable.get("Password");
        String email = dataTable.get("E-mail");

        System.out.println(fullName + password + email);
        addUserPage.enterFullName(fullName);
        addUserPage.enterPassword(password);
        addUserPage.enterEmail(email);


    }

    @When("user clicks on save changes button")
    public void user_clicks_on_save_changes_button() {
        addUserPage.clickSaveBtn();
    }


}
