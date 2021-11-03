package com.example.android_2k1s_2021

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.android_2k1s_2021.databinding.FragmentChooseCharacterBinding

class ChooseCharacterFragment : Fragment(R.layout.fragment_choose_character) {

    private var binding: FragmentChooseCharacterBinding? = null
    private var characterAdapter: CharacterAdapter? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentChooseCharacterBinding.bind(view)

        characterAdapter = CharacterAdapter(CharacterRepository.characters, Glide.with(this)) {
            showChooseCharacterFragment(it)
        }

       with(view) {
           findViewById<RecyclerView>(R.id.rv_character).run {
               adapter = characterAdapter
           }
       }
    }

    private fun showChooseCharacterFragment(characterId: Int) {
        val bundle = Bundle().apply {
            putInt("characterId", characterId)
        }
        val options = NavOptions.Builder()
            .setLaunchSingleTop(false)
            .build()
        findNavController().navigate(
            R.id.action_chooseCharacterFragment_to_characterInfoFragment,
            bundle,
            options
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}