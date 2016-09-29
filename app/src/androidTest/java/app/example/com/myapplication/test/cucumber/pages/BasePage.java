package app.example.com.myapplication.test.cucumber.pages;

import app.example.com.myapplication.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by jamerson on 9/29/16.
 */

public class BasePage {
    protected int setId(int id) {
        return id;
    }

    protected void clickButton(final int id) {
        onView(withId(id)).perform(click());
    }
}
