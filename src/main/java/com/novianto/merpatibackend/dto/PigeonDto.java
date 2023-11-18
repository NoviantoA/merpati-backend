package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.model.pigeon.Condition;
import com.novianto.merpatibackend.model.pigeon.Sex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PigeonDto extends BaseDto{

    private String name;
    private String ringNumber;
    private LocalDate birthdate;
    private UUID colorId;
    private String color;
    private String condition;
    private String sex;
    private Integer year;
    private Boolean isOwn;
    private UUID mateId;
    private PigeonDto mate;
    private UUID fatherId;
    private PigeonDto father;
    private UUID motherId;
    private PigeonDto mother;
    private UUID keeperId;
    private String keeperName;
    private UUID sectionId;
    private SectionDto section;
    private List<FlightResultDto> flights = new ArrayList<>();
    private List<FlightResultDto> topFlights = new ArrayList<>();
    private Integer imageNumber;

    public PigeonDto(UUID id, String name, String ringNumber, LocalDate birthdate, String condition, String sex, Boolean isOwn, UUID mateId, UUID fatherId, UUID motherId, UUID keeperId, String keeperName, UUID sectionId) {
        this.id = id;
        this.name = name;
        this.ringNumber = ringNumber;
        this.birthdate = birthdate;
        this.condition = condition;
        this.sex = sex;
        this.year = birthdate == null ? null : birthdate.getYear();
        this.isOwn = isOwn;
        this.mateId = mateId;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.keeperId = keeperId;
        this.keeperName = keeperName;
        this.sectionId = sectionId;
    }

    public PigeonDto(UUID id, String name, String ringNumber, LocalDate birthdate, UUID colorId, Condition condition, Sex sex, Boolean isOwn, UUID mateId, UUID fatherId, UUID motherId, UUID keeperId, String keeperName, UUID sectionId) {
        this.id = id;
        this.name = name;
        this.ringNumber = ringNumber;
        this.birthdate = birthdate;
        this.colorId = colorId;
        this.condition = condition == null ? null : condition.name();
        this.sex = sex == null ? null : sex.name();
        this.year = birthdate == null ? null : birthdate.getYear();
        this.isOwn = isOwn;
        this.mateId = mateId;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.keeperId = keeperId;
        this.keeperName = keeperName;
        this.sectionId = sectionId;
    }
}
