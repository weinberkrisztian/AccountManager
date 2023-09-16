package weinber.bank.accountmanager.repository;

import org.springframework.data.repository.CrudRepository;
import weinber.bank.accountmanager.entity.Account;

import java.util.List;
import java.util.UUID;

public interface AccountRepository extends CrudRepository<Account, Long> {

    List<Account> findAllByCustomerUuid(UUID customerUuid);
}
