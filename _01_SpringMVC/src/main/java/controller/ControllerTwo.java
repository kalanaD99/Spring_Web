package controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class ControllerTwo  {

    //Mapping Methods
    @GetMapping
    public String testTwo(){
        return "customer";
    }


}
