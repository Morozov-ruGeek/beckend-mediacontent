package ru.amorozov.mediacontent.delivery.dto.user;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.Getter;
import ru.amorozov.domain.entities.User;
import ru.amorozov.mediacontent.delivery.dto.DataTransferObject;

/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class UserShortResponseDto implements DataTransferObject {
    private long id;
    private String name;

    public static UserShortResponseDto create(User user){
        var request = new UserShortResponseDto();
        request.id = user.id();
        request.name = user.name();
        return request;
    }
}
