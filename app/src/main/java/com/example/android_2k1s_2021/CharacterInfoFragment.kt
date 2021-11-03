package com.example.android_2k1s_2021

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.android_2k1s_2021.databinding.FragmentCharacterInfoBinding

class CharacterInfoFragment : Fragment(R.layout.fragment_character_info) {

    private var binding: FragmentCharacterInfoBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentCharacterInfoBinding.bind(view)

        binding?.run {
            var character : Character? = null

            arguments?.getInt("characterId")?.let {
                characterId -> character = CharacterRepository.getCharacterById(characterId)
            }

            character?.let {
                tvCharacterName.text = "Name: ${it.name}"
                tvCharacterDesc.text = "Description: ${it.description}"
                tvCharacterQuote.text = "Quote: ${it.quote}"
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}