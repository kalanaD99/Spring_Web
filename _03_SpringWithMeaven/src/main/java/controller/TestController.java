package controller;

import dto.CustomerDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("customer")
public class CustomerController {

    //
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto getAllCustomer(){
      return new CustomerDto("C001","Kalana","Panadura",25000);
    }

    //consume krnna balaporoththu wena data type ek
    // json response only
    @GetMapping(consumes = "application/json")
    public CustomerDto searchCustomer(){
        return new CustomerDto("C002","salman","colombo",25000);
    }
}
