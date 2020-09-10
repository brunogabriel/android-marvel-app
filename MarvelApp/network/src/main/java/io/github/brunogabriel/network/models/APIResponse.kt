package io.github.brunogabriel.network.models

data class APIResponse<T>(val code: Int,
                          val status: String,
                          val copyright: String,
                          val etag: String,
                          val data: APIDataResponse<T>
)