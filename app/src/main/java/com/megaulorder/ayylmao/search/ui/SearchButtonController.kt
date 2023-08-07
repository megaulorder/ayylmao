package com.megaulorder.ayylmao.search.ui

import com.megaulorder.ayylmao.search.repository.CountriesRepository
import kotlinx.coroutines.CoroutineScope

class SearchButtonController(
	widget: SearchButtonWidget,
	val repository: CountriesRepository,
	val coroutineScope: CoroutineScope,
) {
	init {
		widget.onClickListener = {  }


	}
}