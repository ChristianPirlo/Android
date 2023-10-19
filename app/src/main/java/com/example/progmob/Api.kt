package com.example.progmob

import retrofit2.Call
import retrofit2.http.GET

interface Api {
    @GET("get")
    fun getPosts(): Call<ArrayList<PostResponse>>
}