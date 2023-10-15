package controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("customer")
public class ControllerOne {

    @GetMapping
    public String getAllCustomer(){
        return "hello customers";
    }

    @GetMapping(path = "search")
    public String getCustomers(){
        return "get Customer";
    }
    @GetMapping(path = "name")
    public String getName(){
        return "Kalana";
    }

    @PostMapping
    public String saveCustomer(){
        return "Post Mapping using Spring";
    }
    @DeleteMapping
    public String deleteCustomer(){
        return "customer Deleted!";
    }
    @PutMapping
    public String updateCustomer(){
        return "Customer Updated!";
    }
}
