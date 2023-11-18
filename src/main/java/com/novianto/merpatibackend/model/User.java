package com.novianto.merpatibackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "users")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractBaseEntity{

    @Column(unique = true)
    private String email;
    private String password;

    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @ElementCollection(fetch = FetchType.EAGER)
    @Enumerated(EnumType.STRING)
    private Set<Role> roles;

    @EqualsAndHashCode.Exclude
    @ToString.Exclude
    @OneToOne
    private Keeper keeper;
}
