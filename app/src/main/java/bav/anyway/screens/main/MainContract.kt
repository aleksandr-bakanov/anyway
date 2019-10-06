package bav.anyway.screens.main

import androidx.lifecycle.LiveData
import bav.anyway.model.Place

interface MainContract {

    interface ViewModel {
        val places: LiveData<List<Place>>
    }
}