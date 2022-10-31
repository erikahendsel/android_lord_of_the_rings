package com.erikahendsel.lotr.model

data class Character(
    val docs: List<CharacterDetails>,
    val limit: Int,
    val offset: Int,
    val page: Int,
    val pages: Int,
    val total: Int
)