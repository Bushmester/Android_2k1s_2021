package com.example.android_2k1s_2021

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.RequestManager

class CharacterAdapter (
    private val list: ArrayList<Character>,
    private val glide: RequestManager,
    private val action: (Int) -> Unit
) : RecyclerView.Adapter<CharacterHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CharacterHolder = CharacterHolder.create(parent, glide, action)

    override fun onBindViewHolder(
        holder: CharacterHolder,
        position: Int
    ) = holder.bind(list[position])

    override fun getItemCount(): Int = list.size
}