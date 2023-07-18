package com.megaulorder.ayylmao.search.api

import com.megaulorder.ayylmao.search.model.Country

class ApiCountryMapper {

	fun toDomainModel(model: ApiCountry): Country {
		return Country(
			capital = model.capital,
			region = model.region,
		)
	}
}