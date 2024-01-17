package com.pattern.ArchitecturePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class BankController {

    @Autowired
    BankService bankService;

    @RequestMapping(value="/getName", method = RequestMethod.GET)
    public String getNameOfAccountHolder(@RequestParam int number){
        return bankService.getNameFromAccountNumber(number);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addAccount(Account account){
        bankService.insertAccount(account);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    public void updateAccountBalance(int number, long balance){
        bankService.updateBalance(number, balance);
    }


}
