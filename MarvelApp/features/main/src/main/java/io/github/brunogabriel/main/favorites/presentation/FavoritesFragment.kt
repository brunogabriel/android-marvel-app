package io.github.brunogabriel.main.favorites.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.brunogabriel.commons.extensions.bind
import io.github.brunogabriel.commons.fragment.BaseFragment
import io.github.brunogabriel.main.R
import io.github.brunogabriel.main.databinding.FragmentFavoritesBinding
import io.github.brunogabriel.main.presentation.MainViewModel

@AndroidEntryPoint
class FavoritesFragment : BaseFragment() {

    companion object {
        fun newInstance() = FavoritesFragment()
    }

    private val mainViewModel: MainViewModel by activityViewModels()

    private lateinit var binding: FragmentFavoritesBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = inflater.bind(R.layout.fragment_favorites, container) {
            viewmodel = mainViewModel
        }
        return binding.root
    }
}