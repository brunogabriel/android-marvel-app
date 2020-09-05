package io.github.brunogabriel.network.di

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class BaseURL

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MarvelPrivateKey

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class MarvelPublicKey

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class AuthInterceptor

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class ChuckerLogInterceptor