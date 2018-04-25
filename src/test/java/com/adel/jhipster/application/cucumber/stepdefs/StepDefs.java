package com.adel.jhipster.application.cucumber.stepdefs;

import com.adel.jhipster.application.MyFirstJHipsterApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MyFirstJHipsterApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
