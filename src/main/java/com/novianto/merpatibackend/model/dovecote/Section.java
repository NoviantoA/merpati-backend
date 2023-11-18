package com.novianto.merpatibackend.model.dovecote;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import com.novianto.merpatibackend.model.feeding.FeedingMode;
import com.novianto.merpatibackend.model.pigeon.Pigeon;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "section", uniqueConstraints = {
        @UniqueConstraint(name = "UniqueNameWithinParent", columnNames = {"name", "parent_id"})
})
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class Section extends AbstractOwnedEntity {

    @NotNull
    @EqualsAndHashCode.Include
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "parent_id")
    private Section parent;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.REMOVE)
    @ToString.Exclude
    private List<Section> children;

    @NotNull
    @EqualsAndHashCode.Include
    @Enumerated(EnumType.STRING)
    private SectionType type;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feeding_mode_id")
    private FeedingMode feedingMode;

    @OneToMany(mappedBy = "section")
    @ToString.Exclude
    private Set<Pigeon> pigeons;

    public Section(UUID id) {
        this.setId(id);
    }
}
