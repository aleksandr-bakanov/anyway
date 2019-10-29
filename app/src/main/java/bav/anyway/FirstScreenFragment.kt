package bav.anyway

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import bav.anyway.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_first_screen.*
import javax.inject.Inject

class FirstScreenFragment
@Inject constructor(): BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first_screen, container, false)
    }
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        buttonGo.setOnClickListener{findNavController().navigate(R.id.action_firstScreenFragment_to_mapFragment)}
    }
}

