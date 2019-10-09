package bav.anyway.di

import bav.anyway.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ScreenBindingModule {
    @ContributesAndroidInjector
    abstract fun bindMainActivity(): MainActivity
}