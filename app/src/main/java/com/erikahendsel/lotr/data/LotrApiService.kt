package com.erikahendsel.lotr.data

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

private const val BASE_URL = "https://the-one-api.dev/v2/"

private val retorfit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface LotrApiService {

    @GET("character")
    fun getCharacters()
}