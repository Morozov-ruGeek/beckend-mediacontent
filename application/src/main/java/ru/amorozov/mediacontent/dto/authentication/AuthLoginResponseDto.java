package ru.amorozov.mediacontent.dto.authentication;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * @author Aleksey Morozov
 * @since 26.08.2022
 */
@NoArgsConstructor
@AllArgsConstructor
public class AuthLoginResponseDto {

    private @Setter String accessToken;

    private @Setter String refreshToken;
}
