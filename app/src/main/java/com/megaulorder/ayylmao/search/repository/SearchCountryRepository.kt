package com.megaulorder.ayylmao.search.repository

import androidx.annotation.WorkerThread
import com.megaulorder.ayylmao.search.model.Country
import com.megaulorder.ayylmao.search.api.ApiCountry
import com.megaulorder.ayylmao.search.api.ApiCountryMapper
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SearchCountryRepository(
	val mapper: ApiCountryMapper,
) {

	@WorkerThread
	fun search(): Country {
		val apiCountry: ApiCountry = Retrofit.Builder()
			.baseUrl("https://restcountries.com/v3.1")
			.client(OkHttpClient())
			.addConverterFactory(GsonConverterFactory.create())
			.build()
			.create(ApiCountry::class.java)

		return mapper.toDomainModel(apiCountry)
	}
}