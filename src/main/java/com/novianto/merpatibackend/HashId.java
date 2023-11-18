package com.novianto.merpatibackend;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.UUID;

public interface HashId {
    UUID getId();
    void setId(UUID id);

    @JsonIgnore
    default boolean isNew() {
        return getId() == null;
    }
}
