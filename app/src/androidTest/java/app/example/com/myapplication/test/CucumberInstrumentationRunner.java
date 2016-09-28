package app.example.com.myapplication.test;

import android.os.Bundle;
import android.support.test.runner.AndroidJUnitRunner;
import android.support.test.espresso.Espresso;


import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

import cucumber.api.android.CucumberInstrumentationCore;

@CucumberOptions(features = "features")
public class CucumberInstrumentationRunner extends AndroidJUnitRunner {

    private final CucumberInstrumentationCore instrumentationCore = new CucumberInstrumentationCore(this);

    @Override
    public void onCreate(final Bundle bundle) {
        instrumentationCore.create(bundle);
        super.onCreate(bundle);
    }


    @Override
    public void onStart() {
        waitForIdleSync();
        instrumentationCore.start();
    }
}
