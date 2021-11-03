package com.example.android_2k1s_2021

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Priority
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.android_2k1s_2021.databinding.ItemCharacterBinding

class CharacterHolder (
    private val binding: ItemCharacterBinding,
    private val glide: RequestManager,
    private val action: (Int) -> Unit
) : RecyclerView.ViewHolder(binding.root) {

    private var character: Character? = null

    init {
        itemView.setOnClickListener {
            character?.run {
                action(this.id)
            }
        }
    }

    private val options = RequestOptions()
        .priority(Priority.HIGH)
        .diskCacheStrategy(DiskCacheStrategy.ALL)

    fun bind(item: Character) {
        this.character = item
        with(binding) {
            tvItemCharacterName.text = item.name
            tvItemCharacterDesc.text = item.description

            glide.load(item.url)
                .apply(options)
                .into(ivItemCharacter)
        }
    }

    companion object {
        fun create (
            parent: ViewGroup,
            glide: RequestManager,
            action: (Int) -> Unit
        ) = CharacterHolder(
            ItemCharacterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ), glide, action
        )
    }
}