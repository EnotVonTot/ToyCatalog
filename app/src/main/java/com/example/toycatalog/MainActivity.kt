package com.example.toycatalog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val itemslist:RecyclerView=findViewById((R.id.rec1))
        itemslist.adapter = ItemAdapter(this, ItemsList().list)
    }
}