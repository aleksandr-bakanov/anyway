package bav.anyway.api

import bav.anyway.model.Place

interface ApiContract {

    interface Api {
        suspend fun getPlaces(): List<Place>
    }
}
