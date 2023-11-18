package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.model.dovecote.SectionType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SectionDto extends BaseDto {
    @NotNull(message = "Tempat perlindungan merpati dan komponennya harus mempunyai nama")
    @NotBlank(message = "Tempat perlindungan merpati dan komponennya harus mempunyai nama")
    @Pattern(regexp = "^[a-zA-Zа \\d-.]+$", message = "Hanya huruf, spasi, titik, dan tanda hubung yang diperbolehkan \"-\"")
    private String name;
    private UUID parentId;
    private String fullAddress;
    @NotNull
    @NotBlank
    private String sectionType;
    private Integer pigeonsNumber;
    private String rootName;
    private List<SectionDto> children = new ArrayList<>();
    private List<PigeonLabelDto> pigeons = new ArrayList<>();

    public SectionDto(UUID id, String name, UUID parentId) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
    }

    public SectionDto(UUID id, String name, UUID parentId, SectionType sectionType) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.sectionType = sectionType == null ? null : sectionType.name();
    }

    public SectionDto(UUID id, String name, String sectionType, Integer pigeonsNumber) {
        this.id = id;
        this.name = name;
        this.sectionType = sectionType;
        this.pigeonsNumber = pigeonsNumber;
    }

    public SectionDto(UUID id, String name, String sectionType, UUID parentId, Integer pigeonsNumber) {
        this.id = id;
        this.name = name;
        this.sectionType = sectionType;
        this.parentId = parentId;
        this.pigeonsNumber = pigeonsNumber;
    }

    public static SectionDto getInboxForPigeonsWithoutSection() {
        SectionDto inbox = new SectionDto();
        inbox.setName("Прочие голуби");
        inbox.setSectionType(SectionType.DOVECOTE.name());
        return inbox;
    }
}
