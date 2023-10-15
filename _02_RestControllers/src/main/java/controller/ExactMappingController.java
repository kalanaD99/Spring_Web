package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("item")
public class ItemController {

            //Exact Mapping....
    //===================
    // (item/it/test1)
    @GetMapping("it/test1")
    public String test1(){
        return "test 1 Invoked";
    }

    //(item/category/test2)
    @GetMapping("it/category")
    public String test2(){
        return "test2 Invoked";
    }
}
