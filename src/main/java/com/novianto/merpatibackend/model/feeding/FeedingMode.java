package com.novianto.merpatibackend.model.feeding;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class FeedingMode extends AbstractOwnedEntity {

    private String name;

    @EqualsAndHashCode.Exclude
    @OneToMany
    @JoinColumn(name = "feeding_element_id")
    private Set<FeedingElement> elements;
}
