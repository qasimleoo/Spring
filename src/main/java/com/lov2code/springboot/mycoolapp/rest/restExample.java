package com.lov2code.springboot.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class restExample {
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }

    // Expose a new endpoint for "workout"
    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";
    }

    @GetMapping("factorial")
    public String getFactorial(){
        return "Factorial of 5 is 120";
    }

    @GetMapping("fibonocci")
    public String getFibnocci(){
        return "Fibnocci of 5 is 3";
    }

}
