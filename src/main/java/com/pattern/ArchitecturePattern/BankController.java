package com.pattern.ArchitecturePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @Autowired
    BankService bankService;
    @RequestMapping(value="/getName", method = RequestMethod.GET)
    public void getNameOfAccountHolder(@RequestParam int number){
        System.out.println("found controller ------------------------------------------------");
        bankService.getNameFromAccountNumber(number);
    }


}
