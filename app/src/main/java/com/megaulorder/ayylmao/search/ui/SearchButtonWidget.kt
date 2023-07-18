package com.megaulorder.ayylmao.search.ui

import android.widget.Button

class SearchButtonWidget(
	view: Button,
) {

	var onClickListener: (() -> Unit)? = null

	init {
		view.setOnClickListener { onClickListener?.invoke() }
	}
}