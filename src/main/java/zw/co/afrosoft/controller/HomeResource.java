package zw.co.afrosoft.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import zw.co.afrosoft.model.Customer;

import javax.validation.Valid;

@RestController
public class HomeResource {
    @PostMapping("/test")
    public String test(@Valid @RequestBody Customer customer){
        return "success";
    }
}
