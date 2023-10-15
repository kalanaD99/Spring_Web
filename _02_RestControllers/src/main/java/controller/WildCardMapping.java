package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardMapping {


    //* ek tyna thenata onama ekk dmmama result ek enawa
    @GetMapping(path = "niki/*/hello")
    public String test1(){
        return "test1 Invoked";
    }
    @GetMapping
    public String test2(){
        return "test2 invoked";
    }
}
