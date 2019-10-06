package bav.anyway.api

import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
class ApiModule {
    companion object {
        const val BASE_URL = "http://178.252.75.252:12345/"
    }

    @Provides
    @Singleton
    fun provideRetrofitService(): RetrofitService {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build().create(RetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun provideApi(service: RetrofitService): ApiContract.Api {
        return ApiImpl(service)
    }
}
