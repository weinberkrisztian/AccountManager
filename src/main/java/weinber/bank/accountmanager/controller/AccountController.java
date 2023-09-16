package weinber.bank.accountmanager.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @PostMapping("/account")
    public String accountByCustomerId(@RequestBody String body) {
        return "Successful invocation with body: " + body;
    }
}
