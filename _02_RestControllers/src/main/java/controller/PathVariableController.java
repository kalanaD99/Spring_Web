package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathVariableController {

    //if we use {I001}... this is not a path...path should be always as "I001"(segment).....
   /* @GetMapping(path = "{I001}")
    public String test(@PathVariable("I001") String itemCode){
        return itemCode;
    }

    @GetMapping(path = "{id}/{name}")
    public String tes2t(@PathVariable String id,@PathVariable String name){
        return id+" "+name;
    }*/


                // Alias
    //Parameter eke declare krana variable name ekai  path variable name ekai asamanai nm
    //path variable ekat kiynna ona
    @GetMapping(path = "{CustomerId}/{CustomerName}")
    public String test3(@PathVariable("CustomerId") String id,@PathVariable("CustomerName") String name){
        return id+" "+name;
    }

    // Validate path variable using Regular Expressions (Regex)

    @GetMapping(path = "{id:[I][0-9]{3}}")
    public String test4(@PathVariable String id){
        return id;
    }

    @GetMapping(path = "{CustomerId:[I][a-z]{4}}/{CustomerName:[a-z]{3}}")
    public String test5(@PathVariable("CustomerId") String id,@PathVariable("CustomerName") String name){
        return id+" "+name;
    }
}
