package weinber.bank.accountmanager.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.time.Instant;
import java.util.UUID;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AccountDTO {
    @JsonProperty("uuid")
    private UUID uuid;
    @JsonProperty("customer_uuid")
    private UUID customerUuid;
    @JsonProperty("account_type")
    private String accountType;
    @JsonProperty("branch_address")
    private String branchAddress;
    @JsonIgnore
    private Instant createDate;
}
