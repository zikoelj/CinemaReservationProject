package com.eljabiry.movieService.dto;

import lombok.*;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CityRequestDto {
    private int movieId;
    private List<String> cityNameList;
    private String token;

    public int getMovieId() {
        return movieId;
    }

    public List<String> getCityNameList() {
        return cityNameList;
    }

    public String getToken() {
        return token;
    }
}
