package com.thedancercodes.retrofiti.api;

import com.thedancercodes.retrofiti.model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by TheDancerCodes on 14/02/2018.
 */

public interface Service {

    //TODO 4b: Define API Service

    @GET("movie/popular/")
    Call<MoviesResponse> getPopularMovies(@Query("api_key") String apiKey);

    @GET("movie/top_rated/")
    Call<MoviesResponse> getTopRatedMovies(@Query("api_key") String apiKey);
}
