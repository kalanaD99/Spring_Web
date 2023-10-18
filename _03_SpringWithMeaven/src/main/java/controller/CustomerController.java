package controller;

import dto.CustomerDto;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public ArrayList<CustomerDto> getAllCustomer(){
        ArrayList<CustomerDto> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDto("C001","Kalana","Panadura",2500.00));
        arrayList.add(new CustomerDto("C002","Ashen","Panadura",5500.00));
        arrayList.add(new CustomerDto("C003","Banti","Colombo",7500.00));
        return arrayList;
    }

    @PostMapping
    public CustomerDto saveCustomer(CustomerDto dto){
        return dto;
    }

    @GetMapping("/{id}")
    public CustomerDto SearchCustomer(@PathVariable String id ){
        return new CustomerDto(id,"kalana","Panadura",2500.00);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDto updateCustomer(@RequestBody CustomerDto dto){
        System.out.println(dto.toString());
        return dto;
    }
}
