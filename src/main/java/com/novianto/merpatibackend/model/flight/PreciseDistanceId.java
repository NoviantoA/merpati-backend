package com.novianto.merpatibackend.model.flight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.UUID;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PreciseDistanceId implements Serializable {

    private UUID keeperId;
    private UUID launchPointId;
}
