package app.example.com.myapplication.test.cucumber.steps;

/**
 * Created by gutaraposo on 27/09/16.
 */
import app.example.com.myapplication.test.ActivityFinisher;
import app.example.com.myapplication.test.cucumber.pages.MainPage;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;


public class MainSteps extends BaseSteps {

    @Given("^I've launched \"([^\"]*)\"$") public void I_ve_launched_(String activityClassName)
            throws Throwable {
        getPage(MainPage.class).clickFabButton();
    }
    @When("^I click (.*)") public void I_click_(String id) throws Throwable {

    }

    /**
     * All the clean up of application's data and state after each scenario must happen here
     */
    @After
    public void tearDown() throws Exception {
        ActivityFinisher.finishOpenActivities(); // Required for testing App with multiple activities
    }
}

