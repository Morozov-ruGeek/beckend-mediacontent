package ru.amorozov.mediacontent.persistence.models;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import ru.amorozov.domain.entities.User;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Aleksey Morozov
 * @since 27.08.2022
 */
@Entity
@Table(name = "users")
@NoArgsConstructor
@Getter
public final class UserModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "user_name", nullable = false)
    String name;

    @Column(name = "email", nullable = false, unique = true)
    String email;

    @Column(name = "password", nullable = false)
    String password;

    @Column(name = "avatar")
    String avatar;

    @ManyToOne
    @JoinColumn(name = "role_id")
    UserRoleModel role;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    public static UserModel create(User entity){
        var user = new UserModel();
        user.name = entity.name();
        user.email = entity.email();
        user.password = entity.password();
        user.avatar = entity.avatar();
        user.role = UserRoleModel.create(entity.role());
        return user;
    }

    public static UserModel createWithId(User entity){
        var user = new UserModel();
        user.id = entity.id();
        user.name = entity.name();
        user.email = entity.email();
        user.password = entity.password();
        user.avatar = entity.avatar();
        user.role = UserRoleModel.create(entity.role());
        return user;
    }
}
