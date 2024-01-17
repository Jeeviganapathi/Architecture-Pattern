package Repositories;

import Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;
public interface BankRepo extends JpaRepository<Account, Integer> {

}
