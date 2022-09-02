package ru.amorozov.mediacontent.persistence.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.amorozov.domain.entities.BasicEntity;
import ru.amorozov.domain.entities.UserRole;
import ru.amorozov.domain.entities.enums.Role;

import javax.persistence.*;

/**
 * @author Aleksey Morozov
 * @since 30.08.2022
 */
@Entity
@Table(name = "roles")
@NoArgsConstructor
@Getter
public final class UserRoleModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_name")
    private Role role;

    public static UserRoleModel create(UserRole role){
        var userRole = new UserRoleModel();
        userRole.role = role.role();
        return userRole;
    }
}
