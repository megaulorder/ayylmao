package com.megaulorder.ayylmao

import android.app.Application
import com.megaulorder.ayylmao.search.api.CountriesMethod
import com.megaulorder.ayylmao.search.repository.CountriesRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App: Application() {

    lateinit var repo: CountriesRepository

    val apiService = Retrofit.Builder()
        .baseUrl("https://restcountries.com/v3.1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(CountriesMethod::class.java)

    override fun onCreate() {
        super.onCreate()
        instance = this

        repo = CountriesRepository(apiService)
    }

    companion object {
        lateinit var instance: App
    }
}