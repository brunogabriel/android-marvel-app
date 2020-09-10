package io.github.brunogabriel.main.character.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.brunogabriel.commons.extensions.bind
import io.github.brunogabriel.commons.fragment.BaseFragment
import io.github.brunogabriel.main.R
import io.github.brunogabriel.main.databinding.FragmentCharacteresBinding
import io.github.brunogabriel.main.favorites.presentation.FavoritesFragment
import io.github.brunogabriel.main.presentation.MainViewModel

@AndroidEntryPoint
class CharacterFragment : BaseFragment() {

    companion object {
        fun newInstance() = CharacterFragment()
    }

    private val mainViewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentCharacteresBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflater.bind(R.layout.fragment_characteres, container) {
            viewmodel = mainViewModel
        }
        return binding.root
    }
}