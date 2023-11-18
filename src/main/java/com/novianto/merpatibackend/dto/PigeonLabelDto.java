package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.model.pigeon.Sex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PigeonLabelDto extends BaseDto {

    private String name;
    private String ringNumber;
    private String sex;
    private UUID sectionId;

    public PigeonLabelDto(UUID id, String name, String ringNumber, Sex sex, UUID sectionId) {
        this.id = id;
        this.name = name;
        this.ringNumber = ringNumber;
        this.sex = sex.name();
        this.sectionId = sectionId;
    }
}
