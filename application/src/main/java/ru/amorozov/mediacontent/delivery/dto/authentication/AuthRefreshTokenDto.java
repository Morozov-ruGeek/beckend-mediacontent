package ru.amorozov.mediacontent.delivery.dto.authentication;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class AuthRefreshTokenDto {
    private String refreshToken;
}
