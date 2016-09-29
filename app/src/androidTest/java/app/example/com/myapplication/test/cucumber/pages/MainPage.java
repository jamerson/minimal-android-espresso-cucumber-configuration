package app.example.com.myapplication.test.cucumber.pages;

import app.example.com.myapplication.R;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import java.util.HashMap;
import app.example.com.myapplication.MainActivity;

/**
 * Created by jamerson on 9/29/16.
 */

public class MainPage extends BasePage {

    private final HashMap<String,Integer> mapping = new HashMap<>();

    @Rule
    public static ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(
            MainActivity.class, true, false);

    public MainPage() {
        super();

        mapping.put("fabButton",R.id.fab);

        mActivityRule.launchActivity(null);
    }

    public void clickFabButton() {
        clickButton(mapping.get("fabButton"));
    }


}
