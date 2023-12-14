package com.example.myapplication

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.network.LeaderboardScore

@BindingAdapter("listData")
fun bindRecyclerView(
    recyclerView: RecyclerView,
    data: List<LeaderboardScore>?
)
{
    val adapter = recyclerView.adapter as LeaderboardAdapter
    adapter.submitList(data)
}