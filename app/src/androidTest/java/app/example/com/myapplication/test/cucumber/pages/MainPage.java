package app.example.com.myapplication.test.cucumber.pages;

import app.example.com.myapplication.R;
import android.support.test.rule.ActivityTestRule;
import app.example.com.myapplication.MainActivity;

/**
 * Created by jamerson on 9/29/16.
 */

public class MainPage extends BasePage {


    public void clickFabButton() {
        clickButton((int)mMapping.get("fabButton"));
    }

    @Override
    protected void setupElements() {
        mMapping.put("fabButton",R.id.fab);
    }

    @Override
    protected ActivityTestRule instantiateActivityTestRule() {
        return new ActivityTestRule<>(MainActivity.class, true, false);
    }
}
