package com.megaulorder.ayylmao.search.repository

import android.util.Log
import com.megaulorder.ayylmao.search.api.ApiCountry
import com.megaulorder.ayylmao.search.api.CountriesMethod
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class CountriesRepository(
    private val countriesMethod: CountriesMethod,
) {
    suspend fun getAll(): Flow<List<ApiCountry>> {
        return flow {
            val items = countriesMethod.getAll()
            emit(items)
            Log.d("ZHOPA", items.toString())
        }
    }
}