package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharactorMappingController {
    // character Mapping
    //===================

    //niki/I001
    //niki/IAbc
    //niki/IaBc
    @GetMapping(path = "niki/I???")
    public String test1(){
        return "test1 Invoked";
    }
    @GetMapping
    public String test2(){
        return "test2 invoked";
    }
}
