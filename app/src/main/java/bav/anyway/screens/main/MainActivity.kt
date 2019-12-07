package bav.anyway.screens.main

import android.os.Bundle
import bav.anyway.R
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity
@Inject constructor() : DaggerAppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
