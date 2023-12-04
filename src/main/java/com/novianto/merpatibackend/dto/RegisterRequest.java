package com.novianto.merpatibackend.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {

    @Email
    @NotNull(message = "Anda harus memasukkan alamat email")
    @NotBlank(message = "Alamat email tidak boleh kosong")
    private String email;

    @NotNull(message = "Diperlukan password")
    @NotBlank(message = "Password tidak boleh kosong")
    @Size(min = 6, max = 30, message = "Dari 6 hingga 30 karakter")
    private String password;

    @NotNull(message = "Pemiliknya harus punya nama")
    @NotBlank(message = "Nama pemilik tidak boleh kosong")
    @Pattern(regexp = "^[a-zA-Zа -]+$", message = "Nama hanya boleh berisi huruf, angka, titik, dan tanda hubung")
    private String keeperName;
}
