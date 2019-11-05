package bav.anyway.di

import android.app.Application
import bav.anyway.AnywayApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    ViewModelModule::class,
    ScreenBindingModule::class
])
interface AppComponent: AndroidInjector<DaggerApplication> {
    fun inject(app: AnywayApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: Application): Builder
        fun build(): AppComponent
    }
}