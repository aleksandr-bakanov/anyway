package bav.anyway.di

import bav.anyway.FirstScreenFragment
import bav.anyway.MainActivity
import bav.anyway.MapFragment
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