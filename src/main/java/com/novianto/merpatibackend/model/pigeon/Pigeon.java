package com.novianto.merpatibackend.model.pigeon;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import com.novianto.merpatibackend.model.Keeper;
import com.novianto.merpatibackend.model.dovecote.Section;
import com.novianto.merpatibackend.model.flight.FlightResult;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Table(uniqueConstraints = {
        @UniqueConstraint(name = "UniqueNameWithinUser", columnNames = {"name", "user_id"}),
        @UniqueConstraint(name = "UniqueRingNumberWithinUser", columnNames = {"ringNumber", "user_id"})
})
@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Pigeon extends AbstractOwnedEntity {

    @NotNull
    @EqualsAndHashCode.Include
    private String ringNumber;

    @EqualsAndHashCode.Include
    private String name;

    @Enumerated(EnumType.STRING)
    private Sex sex;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mother_id")
    @ToString.Exclude
    private Pigeon mother;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "father_id")
    @ToString.Exclude
    private Pigeon father;

    private Boolean isOwn;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color_id")
    private Color color;

    @OneToMany(mappedBy = "flight", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private Set<FlightResult> flights;

    private LocalDate birthDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "section_id")
    private Section section;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mate_id")
    @ToString.Exclude
    private Pigeon mate;

    @OneToMany(mappedBy = "mother")
    @ToString.Exclude
    private Set<Pigeon> mothersChildren;

    @OneToMany(mappedBy = "father")
    @ToString.Exclude
    private Set<Pigeon> fathersChildren;

    @NotNull
    @Enumerated(EnumType.STRING)
    private Condition conditionStatus;

    @ToString.Exclude
    @ElementCollection
    @CollectionTable(name = "image")
    private Set<Image> images = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "keeper_id")
    private Keeper keeper;

    public Pigeon(UUID id) {
        this.setId(id);
    }
}
