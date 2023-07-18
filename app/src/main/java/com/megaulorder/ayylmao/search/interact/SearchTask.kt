package com.megaulorder.ayylmao.search.interact

import com.megaulorder.ayylmao.search.model.Country
import com.megaulorder.ayylmao.search.repository.SearchCountryRepository

class SearchTask(
	val repository: SearchCountryRepository,
) {

	suspend fun run(): Country {
		return repository.search()
	}
}