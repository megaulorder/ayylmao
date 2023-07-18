package com.megaulorder.ayylmao.search.api

import retrofit2.http.GET


interface SearchMethod {

	@GET("/name/deutschland")
	suspend fun getCountry(): ApiCountry
}