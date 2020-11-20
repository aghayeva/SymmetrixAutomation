package io.symmetrix.step_definitions;

import io.cucumber.java.en.Given;
import io.symmetrix.pages.LoginPage;
import io.symmetrix.utilities.ConfigurationReader;
import io.symmetrix.utilities.Driver;

public class LoginStepDefinitions {

    LoginPage loginPage=new LoginPage();

    @Given("user is on the landing page")
    public void user_is_on_the_landing_page() {

        String URL= ConfigurationReader.getProperty("url");
        Driver.getDriver().get(URL);

    }


    // And user logs in as "hr"
    @Given("user logs in as {string}")
    public void user_logs_in_as(String role) {
       loginPage.login(role);


    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String module) {

        loginPage.navigateTo(module);
    }


}
