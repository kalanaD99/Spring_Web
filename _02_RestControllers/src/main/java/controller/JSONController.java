package controller;

import dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping
    public String test1(@RequestBody  CustomerDto dto){
        return "Json invoked"+dto.toString();
    }
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public CustomerDto sendBackJson(){
        return new CustomerDto("C001","Kalana","panadura",25000);
    }

    @GetMapping(path = "array",produces = {MediaType.APPLICATION_JSON_VALUE})

    public ArrayList<CustomerDto> sendBackJsonArray(){
        ArrayList<CustomerDto> all =  new ArrayList<>();
        all.add( new CustomerDto("C001","Kalana","panadura",25000));
        all.add( new CustomerDto("C002","Pathum","panadura",25000));
        all.add( new CustomerDto("C003","Kusal","panadura",25000));
        all.add( new CustomerDto("C004","Ashen","panadura",25000));

        return all;
    }
}


