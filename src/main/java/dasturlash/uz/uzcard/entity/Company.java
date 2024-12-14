package dasturlash.uz.uzcard.entity;

import dasturlash.uz.uzcard.entity.address.Address;
import dasturlash.uz.uzcard.enums.CompanyRole;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "company")
@Data
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(unique = true, nullable = false)
    private String name;

    @Column(name = "address_id", unique = true, nullable = false)
    private String addressId;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id", insertable = false, updatable = false)
    private Address address;

    @Column(nullable = false)
    private String contact;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private Boolean visible;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private CompanyRole role;

    @Column(nullable = false)
    private String code;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String password;
}
