package com.novianto.merpatibackend.model;

import com.novianto.merpatibackend.model.flight.PreciseDistance;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Keeper extends AbstractOwnedEntity{

    private String name;

    @OneToMany(mappedBy = "keeper")
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Set<PreciseDistance> preciseDistances = new HashSet<>();

    public Keeper(UUID id) {
        this.setId(id);
    }
}
