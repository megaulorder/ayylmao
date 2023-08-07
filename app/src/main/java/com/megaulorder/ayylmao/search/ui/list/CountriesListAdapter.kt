package com.megaulorder.ayylmao.search.ui.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.megaulorder.ayylmao.R
import com.megaulorder.ayylmao.search.api.ApiCountry

class CountriesListAdapter(private var items: List<ApiCountry>) :
    RecyclerView.Adapter<CountriesListAdapter.ItemViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.country_item, parent, false)
        return ItemViewHolder(view)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setItems(newItems: List<ApiCountry>) {
        items = newItems
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val nameTextView: TextView = itemView.findViewById(R.id.title)

        fun bind(item: ApiCountry) {
            nameTextView.text = "${item.flag} ${item.name.common}"
        }
    }
}