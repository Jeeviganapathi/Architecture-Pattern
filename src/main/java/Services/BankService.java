package Services;

import Models.Account;
import Repositories.BankRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class BankService {

    @Autowired
    BankRepo bankRepo;

    public void getNameFromAccountNumber(int accountNumber){
        Optional<Account> account = bankRepo.findById(accountNumber);
        account.ifPresent(value -> System.out.println(value.getName()));
    }
}
