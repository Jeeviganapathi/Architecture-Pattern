package com.pattern.ArchitecturePattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class BankService {

    @Autowired
    BankRepo bankRepo;

    public void getNameFromAccountNumber(int accountNumber){
        Optional<Account> account = bankRepo.findById(accountNumber);
        account.ifPresent(value -> System.out.println(value.getName() + "------------------------------------------------"));
    }
}
