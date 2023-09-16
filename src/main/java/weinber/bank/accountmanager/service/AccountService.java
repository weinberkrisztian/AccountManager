package weinber.bank.accountmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weinber.bank.accountmanager.dto.AccountDTO;
import weinber.bank.accountmanager.entity.Account;
import weinber.bank.accountmanager.repository.AccountRepository;
import weinber.bank.accountmanager.service.converter.AccountConverter;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountConverter accountConverter;


    public Account saveAccountFromDTO(AccountDTO accountDTO) {
        Account account = accountConverter.convertAccountDTO(accountDTO);
        return saveAccount(account);
    }

    public List<Account> getAccountsByCustomerUuid(UUID customerUuid) {
        return accountRepository.findAllByCustomerUuid(customerUuid);
    }

    private Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
