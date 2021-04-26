package com.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = {"src/test/resources"},
            glue = {"com.test.stepDefs"},
            tags = {"@Smoke_Test"}
    )
    public class TestRunner {



    }


