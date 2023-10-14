package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("two")
public class ControllerTwo {
    public ControllerTwo(){
        System.out.println("Controller Two");
    }
    @GetMapping
    public String testTwo(){
        return "Hello Spring";
    }
}
