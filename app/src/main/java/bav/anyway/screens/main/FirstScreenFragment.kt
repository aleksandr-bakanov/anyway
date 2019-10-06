package bav.anyway.screens.main

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import bav.anyway.R
import bav.anyway.screens.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_first_screen.*
import javax.inject.Inject

class FirstScreenFragment
@Inject constructor(): BaseFragment() {

    companion object {
        private const val TAG = "FirstScreen"
    }

    lateinit var viewModel: MainContract.ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_screen, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProvider(this, viewModelFactory)
            .get(MainViewModel::class.java)

        buttonGo.setOnClickListener {
            findNavController().navigate(R.id.action_firstScreenFragment_to_mapFragment)
        }

        viewModel.places.observe(this, Observer { places ->
            Log.d(TAG, "places = $places")
        })
    }
}

