package io.github.brunogabriel.main.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import io.github.brunogabriel.main.character.presentation.CharacterFragment
import io.github.brunogabriel.main.favorites.presentation.FavoritesFragment

@Module
@InstallIn(ActivityComponent::class)
object MainModule {
    @Provides
    fun providesCharacterFragment(): CharacterFragment = CharacterFragment.newInstance()

    @Provides
    fun providesFavoritesFragment(): FavoritesFragment = FavoritesFragment.newInstance()
}