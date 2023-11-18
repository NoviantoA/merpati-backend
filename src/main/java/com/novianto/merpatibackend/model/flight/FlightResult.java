package com.novianto.merpatibackend.model.flight;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import com.novianto.merpatibackend.model.pigeon.Pigeon;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class FlightResult extends AbstractOwnedEntity {

    @NotNull
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "pigeon_id")
    private Pigeon pigeon;

    @NotNull
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "flight_id")
    private Flight flight;

    private LocalDateTime arrivalTime;

    private Double preciseDistance;

    private Boolean isPass;

    private Integer position = 0;

    private Double winPoints;

    private Double averageSpeed;

    @Enumerated(EnumType.STRING)
    private AfterFlightCondition condition = AfterFlightCondition.NORMAL;
}
