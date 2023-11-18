package com.novianto.merpatibackend.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@NoArgsConstructor
@Getter
@Setter
public class LaunchPointDto extends BaseDto {

    @NotNull(message = "Titik keberangkatan harus ada nama dan jaraknya")
    @NotEmpty(message = "Titik keberangkatan harus ada nama dan jaraknya")
    private String name;

    @NotNull(message = "Masukkan jarak dalam km")
    @Range(min = 1, max = 2000, message = "Jaraknya harus berkisar antara 1 km hingga 2000 km")
    private Integer distance;

    private Double mainKeeperPreciseDistance;

    public LaunchPointDto(UUID id, String name, Integer distance) {
        this.id = id;
        this.name = name;
        this.distance = distance;
    }

    public LaunchPointDto(String name, Integer distance) {
        this.name = name;
        this.distance = distance;
    }
}
