package dasturlash.uz.uzcard.entity;

import dasturlash.uz.uzcard.enums.TransferStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Table(name = "transfers")
@Data
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @Column(name = "from_card_id", nullable = false)
    private String fromCardId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "from_card_id", insertable = false, updatable = false)
    private Card fromCard;

    @Column(name = "to_card_id", nullable = false)
    private String toCardId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "to_card_id", insertable = false, updatable = false)
    private Card toCard;


    @Column(nullable = false)
    private Double totalAmount;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    private Double serviceAmount;

    @Column(nullable = false)
    private Double servicePercentage;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private TransferStatus status;
}
