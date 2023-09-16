package weinber.bank.accountmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import weinber.bank.accountmanager.dto.AccountDTO;
import weinber.bank.accountmanager.entity.Account;
import weinber.bank.accountmanager.service.AccountService;

@RestController
@RequestMapping(("/account"))
@RequiredArgsConstructor
public class AccountController {

    @Autowired
    private final AccountService accountService;

    @PostMapping("/account")
    public String accountByCustomerId(@RequestBody String body) {
        return "Successful invocation with body: " + body;
    }

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO accountDTO) {
            Account savedAccount = accountService.saveAccountFromDTO(accountDTO);
            return ResponseEntity.status(HttpStatus.OK)
                    .body(savedAccount);
    }
}
