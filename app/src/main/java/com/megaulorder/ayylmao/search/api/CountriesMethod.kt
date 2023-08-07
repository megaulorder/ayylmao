package com.megaulorder.ayylmao.search.api

import retrofit2.http.GET


interface CountriesMethod {

	@GET("all")
	suspend fun getAll(): List<ApiCountry>
}