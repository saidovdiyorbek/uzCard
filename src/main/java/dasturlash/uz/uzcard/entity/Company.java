package dasturlash.uz.uzcard.entity;

import dasturlash.uz.uzcard.enums.CompanyRole;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "company")
@Data
public class Company {
    private String id;
    private String name;
    private Address address;
    private String contact;
    private LocalDateTime createdAt;
    private Boolean visible;
    private CompanyRole role;
    private String code;
    private String username;
    private String password;
}
