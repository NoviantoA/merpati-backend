package com.novianto.merpatibackend.model.pigeon;

import lombok.*;
import org.hibernate.annotations.Parent;

import javax.persistence.Embeddable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Image {

    @Parent
    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    private Pigeon pigeon;

    private String fileName;

    private Boolean isMainImage;
}
