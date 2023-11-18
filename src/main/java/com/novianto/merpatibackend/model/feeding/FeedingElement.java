package com.novianto.merpatibackend.model.feeding;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class FeedingElement extends AbstractOwnedEntity {

    @EqualsAndHashCode.Exclude
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "feeding_type_id")
    private FeedingType type;

    private String name;
}
