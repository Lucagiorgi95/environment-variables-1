package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;



public class MainController {
    @Value("${myCustomProps.authCode}")
    String authCode ;

    @Value("${myCustomProps.devName}")
    String devName;

    @GetMapping
    public String getProperty(){
        return  authCode  + devName;
    }
}