package io.cucumber.skeleton;

import io.cucumber.java.en.*;

public class StepDefinitions {
    @Given("I have {int} cukes in my belly")
    public void I_have_cukes_in_my_belly(int cukes) {
        Belly belly = new Belly();
        belly.eat(cukes);
    }

    @Given("The Sign up page is shown")
    public void the_sign_up_page_is_shown() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("User enter a valid first name {string}")
    public void user_enter_a_valid_first_name(String string) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("User fill textbox firstname: "+ string);
    }
    @When("User submit the form")
    public void user_submit_the_form() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("User see a massage {string}")
    public void user_see_a_massage(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }


}

