package io.github.brunogabriel.main.character.data.service

import io.github.brunogabriel.main.character.data.service.models.CharacterResponse
import io.github.brunogabriel.network.models.APIResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CharacterService {
    @GET("/v1/public/characters")
    suspend fun getCharacters(@Query("offset") offset: Int? = 1): APIResponse<CharacterResponse>
}