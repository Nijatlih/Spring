package com.cydeo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Annotate the class with the @Controller stereotype annotation
@Controller
public class HomeController {

    //Use @RequestMapping annotation to associate the action with an HTTP request path
    @RequestMapping("/home")
    public String home(){
        //Return the HTML document name that contains the details we want the browser to display
        return "home.html";
    }

    @RequestMapping("/welcome")
    public String welcome(){

        return "welcome.html";
    }

    @RequestMapping
    public String home2(){
        return "welcome.html";
    }
}
