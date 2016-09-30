package app.example.com.myapplication.test.cucumber.pages;

import android.app.Activity;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import java.util.HashMap;
import app.example.com.myapplication.MainActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

/**
 * Created by jamerson on 9/29/16.
 */

public abstract class BasePage<T extends Activity> {
    protected final HashMap<String,Integer> mMapping = new HashMap<String,Integer>();

    @Rule
    private ActivityTestRule<T> mActivityRule = null;

    protected void clickButton(final Integer id) {
        onView(withId(id)).perform(click());
    }

    public BasePage() {
        mActivityRule = instantiateActivityTestRule();
        setupElements();
        Class<T> activityClass = null;
        mActivityRule.launchActivity(null);
    }

    protected abstract void setupElements();
    protected abstract ActivityTestRule<T> instantiateActivityTestRule();
}
