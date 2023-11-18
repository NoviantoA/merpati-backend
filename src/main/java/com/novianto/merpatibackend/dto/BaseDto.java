package com.novianto.merpatibackend.dto;

import com.novianto.merpatibackend.HashId;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public abstract class BaseDto implements HashId {

    protected UUID id;
}
