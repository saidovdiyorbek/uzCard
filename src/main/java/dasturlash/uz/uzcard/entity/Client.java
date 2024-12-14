package dasturlash.uz.uzcard.entity;

import dasturlash.uz.uzcard.enums.ProfileStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "client",
uniqueConstraints = {
        @UniqueConstraint(columnNames = {"passport_serial", "passport_number"})
})
@Data
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String surname;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private ProfileStatus status;

    @Column(name = "passport_serial", nullable = false)
    private String passportSerial;

    @Column(name = "passport_number", nullable = false)
    private Integer passportNumber;

}
