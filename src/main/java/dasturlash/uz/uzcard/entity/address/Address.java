package dasturlash.uz.uzcard.entity.address;

import dasturlash.uz.uzcard.enums.Country;
import dasturlash.uz.uzcard.enums.Region;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Data
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private String id;

        @Column(nullable = false)
        private String street;

        @Column(nullable = false)
        private String district;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Region region;

        @Column(nullable = false)
        @Enumerated(EnumType.STRING)
        private Country country;

        @Column(nullable = false)
        private String postalCode;

        @Column(nullable = false)
        private Double latitude;
        @Column(nullable = false)
        private Double longitude;

        @Column(nullable = false)
        private Boolean isPrimary;

        @Column(nullable = false)
        private LocalDateTime createdAt;
        @Column
        private LocalDateTime updatedAt;

}
