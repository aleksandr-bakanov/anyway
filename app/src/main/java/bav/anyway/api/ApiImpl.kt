package bav.anyway.api

import bav.anyway.model.Place

class ApiImpl (private val retrofitService: RetrofitService) : ApiContract.Api {

    override suspend fun getPlaces(): List<Place> {
        return retrofitService.getPlaces().let {
            if (it.isSuccessful)
                it.body()!!
            else
                emptyList()
        }
    }

}