package com.eljabiry.movieService.dto;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
public class DirectorRequestDto {
    private String directorName;
    private String token;
}
