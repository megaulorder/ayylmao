package com.megaulorder.ayylmao.search.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.megaulorder.ayylmao.search.api.ApiCountry
import com.megaulorder.ayylmao.search.repository.CountriesRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch

class CountriesViewModel(private val itemRepository: CountriesRepository) : ViewModel() {
    private val countriesMutableFlow = MutableStateFlow<List<ApiCountry>>(emptyList())
    val countriesStateFlow: StateFlow<List<ApiCountry>> get() = countriesMutableFlow

    fun fetchItems() {
        viewModelScope.launch {
            try {
                val result = itemRepository.getAll().first()
                countriesMutableFlow.value = result
            } catch (e: Exception) {
                // Handle error
            }
        }
    }
}