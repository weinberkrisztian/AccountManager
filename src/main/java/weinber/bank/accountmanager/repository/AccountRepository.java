package weinber.bank.accountmanager.repository;

import org.springframework.data.repository.CrudRepository;
import weinber.bank.accountmanager.entity.Account;

import java.util.UUID;

public interface AccountRepository extends CrudRepository<Account, Long> {

    Account findByCustomerUuid(UUID customerUuid);
}
