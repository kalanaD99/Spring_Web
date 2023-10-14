package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class ControllerOne {
    public ControllerOne(){
        System.out.println("Controller one initiated");
    }
    @GetMapping
    public void testMethod(){
        System.out.println("Request Receiving");
    }
}
