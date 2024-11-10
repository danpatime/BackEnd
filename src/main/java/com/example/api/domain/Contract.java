package com.example.api.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "CONTRACT")
public class Contract extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="CONTRACT_ID")
    private Long contractId;

    @OneToOne(fetch = FetchType.LAZY)
    @PrimaryKeyJoinColumn(name = "CONTRACT_ID", referencedColumnName = "SUGGEST_ID")
    private OfferEmployment offerEmployment;

    @Column(name = "CONTRACT_START_TIME")
    private LocalDateTime contractStartTime;
    @Column(name = "CONTRACT_END_TIME")
    private LocalDateTime contractEndTime;
    @Column(name = "CONTRACT_HOURLY_PAY")
    private int contractHourlyPay;
    @Column(name = "CONTRACT_SUCCEDED", columnDefinition = "boolean DEFAULT false")
    private boolean contractSucceeded;


}

