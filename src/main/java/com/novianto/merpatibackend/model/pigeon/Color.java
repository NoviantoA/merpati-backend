package com.novianto.merpatibackend.model.pigeon;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "color", uniqueConstraints = {
        @UniqueConstraint(name = "UniqueColorNameWithinUser", columnNames = {"name", "user_id"})
})
@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class Color extends AbstractOwnedEntity {

    @NotNull
    @NotBlank
    private String name;
}
