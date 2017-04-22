package com.demo3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by stevedavis on 22/04/2017. OK - Another change
 */
@RestController
@RequestMapping ("/api")
public class HelloWorldController {

    @RequestMapping (method = RequestMethod.GET, value = "/hello")
    public Greeting helloWorld ()
    {
        Greeting g = new Greeting();
        g.setGreeting("Hello greeting!");

        return g;
    }
}