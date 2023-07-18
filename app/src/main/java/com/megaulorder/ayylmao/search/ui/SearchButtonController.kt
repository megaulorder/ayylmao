package com.megaulorder.ayylmao.search.ui

import com.megaulorder.ayylmao.search.repository.SearchCountryRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async

class SearchButtonController(
	widget: SearchButtonWidget,
	val repository: SearchCountryRepository,
	val coroutineScope: CoroutineScope,
) {

	val onClickListener: (() -> Unit)? = null

	init {
		widget.onClickListener = onClickListener

		coroutineScope.async {
			repository.search()
		}
	}
}