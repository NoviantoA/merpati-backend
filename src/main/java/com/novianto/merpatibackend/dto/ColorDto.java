package com.novianto.merpatibackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@AllArgsConstructor
@Getter
public class ColorDto extends BaseDto{

    @NotNull(message = "Nama warna tidak boleh kosong")
    @NotBlank(message = "Nama warna tidak boleh kosong")
    @Pattern(regexp = "^[a-zA-Z\\d. -]+$", message = "Nama warna hanya boleh mengandung huruf, spasi, dan tanda hubung \"-\"", flags = Pattern.Flag.UNICODE_CASE)
    private String name;

    public ColorDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
