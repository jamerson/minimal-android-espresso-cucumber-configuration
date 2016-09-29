package app.example.com.myapplication.test.cucumber.steps;

/**
 * Created by gutaraposo on 27/09/16.
 */
import app.example.com.myapplication.R;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import android.util.Log;

import app.example.com.myapplication.MainActivity;
import app.example.com.myapplication.test.ActivityFinisher;

import org.junit.Rule;

import app.example.com.myapplication.test.cucumber.pages.BasePage;
import app.example.com.myapplication.test.cucumber.pages.MainPage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;


public class Steps {

    BasePage mPage = null;


    @Before
    public void setUp() throws Exception {
        mPage = new MainPage();
        Log.v("PASSEIPORAQUI","AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
    }
    @Given("^I've launched \"([^\"]*)\"$") public void I_ve_launched_(String activityClassName)
            throws Throwable {
        ((MainPage)mPage).clickFabButton();
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

