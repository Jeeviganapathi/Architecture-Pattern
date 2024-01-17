package Controllers;

import Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

public class BankController {

    @Autowired
    BankService bankService;
    public void getNameOfAccountHolder(int accountNumber){
        bankService.getNameFromAccountNumber(accountNumber);
    }
}
