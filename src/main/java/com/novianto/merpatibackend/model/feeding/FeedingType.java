package com.novianto.merpatibackend.model.feeding;

import com.novianto.merpatibackend.model.AbstractOwnedEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "feeding_type")
@Data
@EqualsAndHashCode(callSuper = true)
public class FeedingType extends AbstractOwnedEntity {

    private String name;
}
