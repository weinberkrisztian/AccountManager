package weinber.bank.accountmanager.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import weinber.bank.accountmanager.dto.AccountDTO;
import weinber.bank.accountmanager.entity.Account;
import weinber.bank.accountmanager.service.AccountService;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(("/account"))
@RequiredArgsConstructor
public class AccountController {

    private final AccountService accountService;

    @GetMapping("/findByCustomerUuid")
    public ResponseEntity<List<Account>> accountsByCustomerUuid(@RequestParam("customer_uuid") UUID customerUuid) {
        List<Account> accountsByCustomerUuid = accountService.getAccountsByCustomerUuid(customerUuid);
        return ResponseEntity.status(HttpStatus.OK)
                .body(accountsByCustomerUuid);
    }

    @PostMapping("/create")
    public ResponseEntity<Account> createAccount(@RequestBody AccountDTO accountDTO) {
        Account savedAccount = accountService.saveAccountFromDTO(accountDTO);
        return ResponseEntity.status(HttpStatus.OK)
                .body(savedAccount);
    }
}
