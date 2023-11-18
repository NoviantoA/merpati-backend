package com.novianto.merpatibackend.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.novianto.merpatibackend.model.pigeon.Condition;
import com.novianto.merpatibackend.model.pigeon.Sex;
import com.novianto.merpatibackend.util.NullStringDeserializer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
public class FilterParams {

    @JsonDeserialize(using = NullStringDeserializer.class)
    private String ringNumber;
    private Condition condition;
    private Long dovecote;
    @JsonDeserialize(using = NullStringDeserializer.class)
    private String name;
    private String dateFilterType;
    private LocalDate birthdateFrom;
    private LocalDate birthdateTo;
    private Integer ageYearFrom;
    private Integer ageMonthFrom;
    private Integer ageYearTo;
    private Integer ageMonthTo;
    private LocalDate yearFrom;
    private LocalDate yearTo;
    private Long keeper;
    private Sex sex;
    private Boolean hashMate;
}
