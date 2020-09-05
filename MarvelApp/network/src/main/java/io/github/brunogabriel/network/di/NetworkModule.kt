package io.github.brunogabriel.network.di

import android.content.Context
import com.chuckerteam.chucker.api.ChuckerInterceptor
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import io.github.brunogabriel.network.BuildConfig
import javax.inject.Singleton
import io.github.brunogabriel.network.interceptors.MarvelAuthInterceptor
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.MessageDigest
import java.util.concurrent.TimeUnit

@Module
@InstallIn(ApplicationComponent::class)
object NetworkModule {
    private const val CONNECTION_TIMEOUT = 60L
    private const val READ_TIMEOUT = 60L

    @Provides
    @Singleton
    @BaseURL
    fun provideBaseUrl(): String = BuildConfig.API_URL

    @Provides
    @Singleton
    @MarvelPublicKey
    fun providePublicKey(): String = BuildConfig.API_URL

    @Provides
    @Singleton
    @MarvelPrivateKey
    fun providePrivateKey(): String = BuildConfig.API_URL

    @Provides
    @Singleton
    @AuthInterceptor
    fun provideMarvelAuthInterceptor(
        messageDigest: MessageDigest,
        @MarvelPrivateKey privateKey: String,
        @MarvelPublicKey publicKey: String
    ): Interceptor = MarvelAuthInterceptor(
        messageDigest,
        privateKey,
        publicKey
    )

    @Provides
    @Singleton
    @ChuckerLogInterceptor
    fun provideChuckerInterceptor(
        @ApplicationContext context: Context
    ): Interceptor = ChuckerInterceptor(context)

    @Provides
    @Singleton
    fun provideOkHttpClient(
        @AuthInterceptor authInterceptor: Interceptor,
        @ChuckerLogInterceptor chuckerInterceptor: Interceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(authInterceptor)
            .addInterceptor(chuckerInterceptor)
            .connectTimeout(CONNECTION_TIMEOUT, TimeUnit.SECONDS)
            .readTimeout(READ_TIMEOUT, TimeUnit.SECONDS)
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(
        client: OkHttpClient,
        @BaseURL baseUrl: String
    ): Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(client)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
}