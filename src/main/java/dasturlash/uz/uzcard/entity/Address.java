package dasturlash.uz.uzcard.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "address")
@Data
public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String street;
        private String city;
        private String state;
        private String country;
        private String postalCode;

        private Double latitude;
        private Double longitude;

        private String apartmentNumber;
        private String district;
        private String landmark;

        private Boolean isPrimary;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        // Getters and Setters
        // Constructors


}
