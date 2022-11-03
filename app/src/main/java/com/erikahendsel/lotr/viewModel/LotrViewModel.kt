package com.erikahendsel.lotr.viewModel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.erikahendsel.lotr.data.LotrApi
import com.erikahendsel.lotr.model.CharacterDetails
import kotlinx.coroutines.launch

class LotrViewModel : ViewModel(){

    private val _characters = MutableLiveData<List<CharacterDetails>>()
    val characters: LiveData<List<CharacterDetails>> = _characters

    fun getLotrCharacters() {
        viewModelScope.launch {
            try {
                val listResult = LotrApi.retrofitService.getCharacters()
                _characters.value = listResult.docs
                Log.d("listResult", "List: ${characters.value}")
            } catch (e: java.lang.Exception) {
                _characters.value = listOf()
            }

        }
    }
}