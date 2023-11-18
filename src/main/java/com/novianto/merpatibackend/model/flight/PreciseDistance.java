package com.novianto.merpatibackend.model.flight;

import com.novianto.merpatibackend.model.Keeper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PreciseDistance {

    @EmbeddedId
    @EqualsAndHashCode.Include
    private PreciseDistanceId id = new PreciseDistanceId();

    @ManyToOne
    @MapsId("keeperId")
    private Keeper keeper;

    @ManyToOne
    @MapsId("launchPointId")
    private LaunchPoint launchPoint;

    private Double preciseDistance;

    public PreciseDistance(Keeper keeper, LaunchPoint launchPoint, Double preciseDistance) {
        this.keeper = keeper;
        this.launchPoint = launchPoint;
        this.preciseDistance = preciseDistance;

        this.id.setKeeperId(keeper.getId());
        this.id.setLaunchPointId(launchPoint.getId());

        keeper.getPreciseDistances().remove(this);
        keeper.getPreciseDistances().add(this);

        launchPoint.getPreciseDistances().remove(this);
        launchPoint.getPreciseDistances().add(this);
    }
}
