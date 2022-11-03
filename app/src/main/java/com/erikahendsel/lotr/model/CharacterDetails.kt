package com.erikahendsel.lotr.model

import com.squareup.moshi.Json

data class CharacterDetails(
    @Json(name = "_id") val id: String,
    val birth: String,
    val death: String,
    val gender: String,
    val hair: String,
    val height: String,
    val name: String,
    val race: String,
    val realm: String,
    val spouse: String,
    var wikiUrl: String = ""
)