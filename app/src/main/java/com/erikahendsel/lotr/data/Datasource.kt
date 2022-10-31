package com.erikahendsel.lotr.data

import com.erikahendsel.lotr.model.CharacterDetails

class Datasource {

    fun loadCharacters(): List<CharacterDetails> {
        return listOf(
            CharacterDetails(
                _id = "5cd99d4bde30eff6ebccfbbe",
                height = "",
                race = "Human",
                gender = "Female",
                birth = "",
                spouse = "Belemir",
                death = "",
                realm = "",
                hair = "",
                name = "Adanel",
                wikiUrl = "http://lotr.wikia.com//wiki/Adanel"
            ),
            CharacterDetails(
                _id = "5cd99d4bde30eff6ebccfbbf",
                height = "",
                race = "Human",
                gender = "Male",
                birth = "Before ,TA 1944",
                spouse = "",
                death = "Late ,Third Ag",
                realm = "",
                hair = "",
                name = "Adrahil I",
                wikiUrl = "http://lotr.wikia.com//wiki/Adrahil_I"
            )
        )
    }
}