package weinber.bank.accountmanager.service.converter;

import org.springframework.stereotype.Service;
import weinber.bank.accountmanager.dto.AccountDTO;
import weinber.bank.accountmanager.entity.Account;

import java.time.Instant;
import java.util.Optional;
import java.util.UUID;

@Service
public class AccountConverter {

    public Account convertAccountDTO(AccountDTO accountDTO) {
        return Account.builder()
                .customerUuid(accountDTO.getCustomerUuid())
                .uuid(Optional.ofNullable(accountDTO.getUuid()).orElse(UUID.randomUUID()))
                .accountType(accountDTO.getAccountType())
                .branchAddress(accountDTO.getBranchAddress())
                .createDate(Instant.now())
                .build();
    }
}
