package io.github.brunogabriel.main.presentation

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import dagger.hilt.android.AndroidEntryPoint
import io.github.brunogabriel.commons.activity.BaseActivity
import io.github.brunogabriel.commons.adapters.ViewPagerFragmentAdapter
import io.github.brunogabriel.commons.extensions.bind
import io.github.brunogabriel.main.R
import io.github.brunogabriel.main.character.presentation.CharacterFragment
import io.github.brunogabriel.main.favorites.presentation.FavoritesFragment
import io.github.brunogabriel.main.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : BaseActivity() {

    private val mainViewModel: MainViewModel by viewModels()

    @Inject
    lateinit var characterFragment: CharacterFragment

    @Inject
    lateinit var favoritesFragment: FavoritesFragment

    private lateinit var binding: ActivityMainBinding

    private lateinit var viewPagerFragmentAdapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = bind(R.layout.activity_main) {
            viewmodel = mainViewModel
        }
        setUpView()
    }

    private fun setUpView() {
        setToolbar(toolbar)
        viewPagerFragmentAdapter = ViewPagerFragmentAdapter(listOf(
                characterFragment, favoritesFragment
        ), supportFragmentManager)

        viewPagerContainer.adapter = viewPagerFragmentAdapter

        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.characteres -> {
                    viewPagerContainer.currentItem = 0
                    true
                }
                R.id.favorites -> {
                    viewPagerContainer.currentItem = 1
                    true
                }
                // TODO: about
                else -> false
            }
        }
    }

    companion object {
        fun start(context: Context) {
            context.startActivity(Intent(context, MainActivity::class.java))
        }
    }
}