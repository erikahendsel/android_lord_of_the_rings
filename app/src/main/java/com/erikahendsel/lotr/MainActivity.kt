package com.erikahendsel.lotr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.erikahendsel.lotr.adapter.LotrListAdapter
import com.erikahendsel.lotr.data.Datasource
import com.erikahendsel.lotr.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //All the MainActivity class needs to do is inflate the layout so that the fragment is displayed in the view
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}