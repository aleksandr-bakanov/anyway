package bav.anyway.api

import bav.anyway.model.Place
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {
    @GET("/places")
    suspend fun getPlaces(): Response<List<Place>>
}