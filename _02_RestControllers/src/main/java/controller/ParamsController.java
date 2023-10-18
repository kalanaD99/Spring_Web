package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"param1","param2"})
    public String test1(String param1,String param2){
        return "hello1......"+param1+" - "+param2;
    }
    @GetMapping
    public String test2(){
        return "hello2";
    }

    //change he parameter values using alias
    @GetMapping(params = {"name","salary"})
    public String test3(String name ,@RequestParam("salary") double mySalary){
        return "test3  "+name+" "+mySalary;
    }
}

