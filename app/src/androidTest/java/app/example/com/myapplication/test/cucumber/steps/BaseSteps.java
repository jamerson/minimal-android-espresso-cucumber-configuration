package app.example.com.myapplication.test.cucumber.steps;

import java.util.HashMap;
import app.example.com.myapplication.test.cucumber.pages.BasePage;

/**
 * Created by jamerson on 9/29/16.
 */

public class BaseSteps {

    private HashMap<String, BasePage> mPages = new HashMap<>();
    private BasePage mCurrentPage = null;

    public <T extends BasePage> T getPage(Class<T> type) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        if(!mPages.containsKey(type.getSimpleName())) {
            Class clazz = Class.forName(type.getName());
            mPages.put(type.getSimpleName(), (BasePage)clazz.newInstance());
        }
        mCurrentPage = mPages.get(type.getSimpleName());
        return (T)mPages.get(type.getSimpleName());
    }

    public BasePage getCurrentPage() {
        return mCurrentPage;
    }

}
