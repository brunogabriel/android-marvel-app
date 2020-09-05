package io.github.brunogabriel.network.interceptors

import okhttp3.Interceptor
import okhttp3.Response
import java.math.BigInteger
import java.security.MessageDigest

class MarvelAuthInterceptor(
    private val messageDigest: MessageDigest,
    private val privateKey: String,
    private val publicKey: String
) : Interceptor {
    companion object {
        private const val HASH = "hash"
        private const val API_KEY = "apikey"
        private const val TS = "ts"
    }

    override fun intercept(chain: Interceptor.Chain): Response {
        val currentTimeInMs = currentTimeInMillis()
        val originalRequest = chain.request()
        val newBuilder = originalRequest.newBuilder()
        newBuilder.url(
            originalRequest.url().newBuilder()
                .addQueryParameter(TS, currentTimeInMs)
                .addQueryParameter(HASH, createHashMD5(currentTimeInMs))
                .addQueryParameter(API_KEY, publicKey)
                .build()
        )
        return chain.proceed(newBuilder.build())
    }

    private fun createHashMD5(currentTime: String): String {
        val hash = "$currentTime${privateKey}${publicKey}"
        return BigInteger(1, messageDigest.digest(hash.toByteArray())).toString(16)
            .padStart(32, '0')
    }

    private fun currentTimeInMillis() = System.currentTimeMillis().toString()
}