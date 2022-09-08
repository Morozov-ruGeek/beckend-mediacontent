package ru.amorozov.mediacontent.delivery.dto.authentication;

import lombok.*;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public final class AuthLoginResponseDto {

    private String accessToken;
    private String refreshToken;

    public static AuthLoginResponseDto create(String accessToken,
                                              String refreshToken){
        var authResponse = new AuthLoginResponseDto();
        authResponse.accessToken = accessToken;
        authResponse.refreshToken = refreshToken;
        return authResponse;
    }
}
