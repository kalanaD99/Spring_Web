package controller;

import dto.CustomerDto;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("form")
public class FormDataController {

    @PostMapping
    public String test1(@ModelAttribute CustomerDto dto){
        return " request received  "+dto.toString();
    }
}
