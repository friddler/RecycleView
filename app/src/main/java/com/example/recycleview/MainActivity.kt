package com.example.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    var persons = mutableListOf<Person>(

        Person("Frida", 25, R.drawable.cat),
        Person("Rune", 5, R.drawable.rune_6),
        Person("Jacob", 23, R.drawable.dog),
        Person("Doggo", 2, R.drawable.dog2)
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val adapter = PersonRecycleAdapter(this,persons)

        recyclerView.adapter = adapter



    }
}