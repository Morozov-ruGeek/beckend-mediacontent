package ru.amorozov.mediacontent.models;

import lombok.NoArgsConstructor;
import ru.amorozov.domain.entities.BasicEntity;
import ru.amorozov.domain.entities.enums.Role;

import javax.persistence.*;

/**
 * @author Aleksey Morozov
 * @since 30.08.2022
 */
@Entity
@Table(name = "roles")
@NoArgsConstructor
public class UserRoleModel implements BasicEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
    private Role role;
}
