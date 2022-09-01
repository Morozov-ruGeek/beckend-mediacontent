package ru.amorozov.mediacontent.delivery.dto.authentication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class AuthRefreshTokenDto {

    private @Getter String refreshToken;
}
