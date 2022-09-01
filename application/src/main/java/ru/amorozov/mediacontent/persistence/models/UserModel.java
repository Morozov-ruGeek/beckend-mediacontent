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
@Setter
public final class UserModel implements JpaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;

    @Column(name = "user_name", nullable = false)
    String name;

    @Column(name = "e-mail", nullable = false, unique = true)
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
        user.setName(entity.name());
        user.setEmail(entity.email());
        user.setPassword(entity.password());
        user.setAvatar(entity.avatar());
        user.setRole(UserRoleModel.create(entity.role()));
        return user;
    }
}
