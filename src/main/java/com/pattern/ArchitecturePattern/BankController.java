package com.pattern.ArchitecturePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {

    @Autowired
    BankService bankService;
    @GetMapping("/getName")
    public void getNameOfAccountHolder(){
        System.out.println("found controller");
        bankService.getNameFromAccountNumber(100);
    }
}
