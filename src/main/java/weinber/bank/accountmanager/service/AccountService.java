package weinber.bank.accountmanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import weinber.bank.accountmanager.dto.AccountDTO;
import weinber.bank.accountmanager.entity.Account;
import weinber.bank.accountmanager.repository.AccountRepository;
import weinber.bank.accountmanager.service.converter.AccountConverter;

@Service
@AllArgsConstructor
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountConverter accountConverter;


    public Account saveAccountFromDTO(AccountDTO accountDTO) {
        Account account = accountConverter.convertAccountDTO(accountDTO);
        return saveAccount(account);
    }

    private Account saveAccount(Account account) {
        return accountRepository.save(account);
    }
}
