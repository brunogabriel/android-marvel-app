package io.github.brunogabriel.network.models

data class APIDataResponse<T>(val offset: Int,
                              val limit: Int,
                              val total: Int,
                              val results: List<T>)