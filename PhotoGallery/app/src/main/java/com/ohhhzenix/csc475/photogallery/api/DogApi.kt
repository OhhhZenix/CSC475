package com.ohhhzenix.csc475.photogallery.api

import retrofit2.Response
import retrofit2.http.GET

interface DogApi {
    @GET("breeds/image/random/10")
    suspend fun getTenRandomDogImages(): Response<DogResponse>
}