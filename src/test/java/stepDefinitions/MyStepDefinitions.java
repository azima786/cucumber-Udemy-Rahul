package stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.datatable.DataTable;

import java.util.List;

public class MyStepDefinitions {

    @Given("^user is on landing page$")
    public void user_is_on_landing_page() {
        System.out.println("On Landing page");
    }

    @When("^user login into application with \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_login_into_application_with_something_and_something(String username, String password) throws Throwable {
        System.out.println("logged in with username and password" + username + password);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() {
        System.out.println("home page populated");
    }

    @And("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are_false(String strArg1) throws Throwable {
        System.out.println("cards are displayed");
    }

    @When("^User sign up with following details$")
    public void user_sign_up_with_following_details(DataTable data) throws Throwable {
        List<List<String>> table = data.asLists();
        System.out.println(table.get(0).get(0));
        System.out.println(table.get(0).get(1));

        }

    }
