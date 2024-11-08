package com.example.api.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.FetchType.*;

@Entity
@Getter
@Setter
@Table(name = "EXTERANL_CARRER")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ExternalCareer extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "employee_id")
    @JsonIgnore
    private Employee employee;

    @EqualsAndHashCode.Include
    @Column(name = "BUSINESS_NAME")
    private String Name;
    @EqualsAndHashCode.Include
    @Column(name = "PART_TIME_PERIOD")
    private String period;

    public ExternalCareer(Employee employee, String name, String period) {
        this.employee = employee;
        Name = name;
        this.period = period;
    }

    public ExternalCareer() {

    }
}

