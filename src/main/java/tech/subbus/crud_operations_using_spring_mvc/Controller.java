package tech.subbus.crud_operations_using_spring_mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller 
{
    @GetMapping("/")
    public String sayWelcome()
    {
        return "Welcome to crud operations using spring mvc......";
    }
}
