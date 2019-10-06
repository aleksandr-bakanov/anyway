package bav.anyway.di

import bav.anyway.screens.main.FirstScreenFragment
import bav.anyway.screens.main.MainActivity
import bav.anyway.screens.map.MapFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ScreenBindingModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun bindFirstScreenFragment(): FirstScreenFragment

    @ContributesAndroidInjector
    abstract fun bindMapFragment(): MapFragment
}