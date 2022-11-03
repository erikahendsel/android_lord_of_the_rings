package com.erikahendsel.lotr.data

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import com.erikahendsel.lotr.model.Character
import retrofit2.http.Headers

private const val BASE_URL = "https://the-one-api.dev/v2/"

private val client = OkHttpClient.Builder().apply {
    addInterceptor(LotrInterceptor())
}.build()

private val moshi = Moshi.Builder()
    .add(KotlinJsonAdapterFactory())
    .build()

private val retrofit = Retrofit.Builder()
    .client(client)
    .addConverterFactory(MoshiConverterFactory.create(moshi))
    .baseUrl(BASE_URL)
    .build()

interface LotrApiService {
    @GET("character?limit=3")
    suspend fun getCharacters(): Character
}

object LotrApi {
    val retrofitService: LotrApiService by lazy {
        retrofit.create(LotrApiService::class.java)
    }
}