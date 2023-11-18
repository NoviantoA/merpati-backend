package com.novianto.merpatibackend.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class KeeperDto extends BaseDto {

    @NotNull(message = "Pemiliknya harus punya nama")
    @NotBlank(message = "Nama pemilik tidak boleh kosong")
    @Pattern(regexp = "^[a-zA-Z\\d. -]+$", message = "Nama hanya boleh berisi huruf, angka, titik, dan tanda hubung")
    private String name;

    public KeeperDto(UUID id, String name) {
        this.id = id;
        this.name = name;
    }
}
