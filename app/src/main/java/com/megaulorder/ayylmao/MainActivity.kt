package com.megaulorder.ayylmao

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.megaulorder.ayylmao.search.ui.list.CountriesListAdapter
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list: RecyclerView = findViewById(R.id.list)
        val adapter = CountriesListAdapter(emptyList())
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = adapter

        lifecycleScope.launch {
            try {
                App.instance.repo.getAll().collect {
                    Log.d("ZHOPA", it.toString())
                    adapter.setItems(it)
                }
            } catch (e: Exception) {
                Log.d("ZHOPA", e.toString())
                // Handle error
            }
        }
    }
}