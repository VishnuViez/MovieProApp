package com.vishnu.movieproapp.service;

import com.vishnu.movieproapp.model.Result;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MovieDataService {

    //Base Url
    //https://api.themoviedb.org/3/
    //
    //End-Point Url
    //movie/550?api_key=bfa47a3a1dc145af544a549adfa4adeb
    @GET("movie/popular")
    Call<Result> getPopularMovies(@Query("api_key") String apiKey);
}
