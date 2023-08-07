package com.megaulorder.ayylmao.search.api

import androidx.annotation.Keep

data class ApiCountry(
	val flag: String,
	val name: Name,
)
data class Name(
	val common: String,
)