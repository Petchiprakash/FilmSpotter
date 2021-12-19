package com.example.onlineticket

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MoviesApi {
    @GET
    suspend fun getMovies(@Query("i" )i:String,
    @Query("apiKey")apiKey: String = "f3fc2839"): Response<List<Movies>>

}