package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.model.flight.FlightType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class FlightDto extends BaseDto{

    private LaunchPointDto launchPoint;
    @NotNull(message = "Keberangkatan harus memiliki titik peluncuran")
    private UUID launchPointId;
    private Integer numberParticipants;
    private Integer totalParticipants;
    private Integer myPassed;
    @NotNull(message = "Penerbangan tersebut harus memiliki informasi tentang tanggal dan waktu pelepasan merpati")
    private LocalDateTime departure;
    private Integer passingThreshold;
    @NotNull(message = "Keberangkatan tersebut harus tergolong salah satu tipe")
    private String flightType;
    private Boolean isSynced;

    public FlightDto(UUID id, UUID launchPointId, String locationName, Integer distance, Integer totalParticipants, LocalDateTime departure, Integer passingThreshold, FlightType flightType, Boolean isSynced) {
        this.id = id;
        this.launchPoint = new LaunchPointDto(launchPointId, locationName, distance);
        this.totalParticipants = totalParticipants;
        this.departure = departure;
        this.passingThreshold = passingThreshold;
        this.flightType = flightType.name();
        this.isSynced = isSynced;
    }
}
