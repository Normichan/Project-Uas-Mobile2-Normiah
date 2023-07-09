package com.example.project_uas_mobile2_normiah.services

import com.example.project_uas_mobile2_normiah.models.TVResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=281d3fe3f5911ed4f24e36ce986de054")
    fun getTVList(): Call<TVResponse>

}