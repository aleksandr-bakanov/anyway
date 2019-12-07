package bav.anyway.screens.main

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.liveData
import bav.anyway.api.ApiContract
import bav.anyway.model.Place
import kotlinx.coroutines.Dispatchers
import javax.inject.Inject

class MainViewModel
@Inject constructor(
    private val api: ApiContract.Api,
    app: Application
) : AndroidViewModel(app), MainContract.ViewModel {

    override val places: LiveData<List<Place>>
        get() = liveData(Dispatchers.IO) {
            val places = api.getPlaces()
            emit(places)
        }
}