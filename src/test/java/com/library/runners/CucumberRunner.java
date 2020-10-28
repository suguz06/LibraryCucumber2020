package com.library.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src\\test\\resources\\features", //copy rootpath
        glue = "com\\library\\step_definitions", //copy sourcepath
        dryRun = false, //by default false=> if choose true=> you can also create step_definitions methods
         tags ="@add",
        publish = true



)

public class CucumberRunner {
}
