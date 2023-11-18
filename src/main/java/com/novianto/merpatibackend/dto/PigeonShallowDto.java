package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.model.pigeon.Condition;
import com.novianto.merpatibackend.model.pigeon.Sex;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Pattern;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PigeonShallowDto extends BaseDto {

    private static final String SEP = ";";
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy");

    @Pattern(regexp = "^[a-zA-Zа \\d-]+$", message = "Karakter tidak valid - hanya huruf, angka, spasi, tanda hubung")
    private String name;
    @Pattern(regexp = "^[a-zA-Zа \\d-]+$", message = "Karakter tidak valid - hanya huruf, angka, spasi, tanda hubung")
    private String ringNumber;
    @PastOrPresent(message = "Tanggal lahir hanya boleh berupa tanggal yang lalu atau tanggal hari ini")
    private LocalDate birthdate;
    @Pattern(regexp = "^[a-zA-Zа -]+$", message = "Karakter tidak valid - hanya huruf, spasi, tanda hubung")
    private String color;
    @NotNull(message = "Kondisi merpati harus ditunjukkan")
    @NotBlank(message = "Kondisi merpati harus ditunjukkan")
    private String condition;
    private String sex;
    private Integer year;
    private Boolean isOwn;
    private UUID mateId;
    private String mateRingNumber;
    private UUID fatherId;
    private UUID motherId;
    private UUID keeperId;
    private UUID sectionId;
    private SectionDto section;
    private MultipartFile[] images;
    private String mainImageFileName;

    public PigeonShallowDto(UUID id, String name, String ringNumber, LocalDate birthdate, String color, Condition condition, Sex sex, Boolean isOwn, UUID mateId, String mateRingNumber, UUID fatherId, UUID motherId, UUID keeperId, UUID sectionId) {
        this.id = id;
        this.name = name;
        this.ringNumber = ringNumber;
        this.birthdate = birthdate;
        this.color = color;
        this.condition = condition == null ? null : condition.name();
        this.sex = sex == null ? null : sex.name();
        this.year = birthdate == null ? null : birthdate.getYear();
        this.isOwn = isOwn;
        this.mateId = mateId;
        this.mateRingNumber = mateRingNumber;
        this.fatherId = fatherId;
        this.motherId = motherId;
        this.keeperId = keeperId;
        this.sectionId = sectionId;
    }
}
