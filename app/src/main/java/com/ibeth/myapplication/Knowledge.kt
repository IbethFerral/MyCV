package com.ibeth.myapplication

import androidx.appcompat.app.AppCompatActivity

import android.graphics.Picture
import android.media.Image
import android.os.Bundle
import android.widget.GridView
import android.widget.ListAdapter

import java.util.ArrayList
import java.util.Arrays

class Knowledge : AppCompatActivity() {
    private val topics = Arrays.asList("Android Studio", "Java", "Web Service REST/SOAP", "Firebase")
    private val pictures = intArrayOf(1, 2, 3)
    private var gridTopics: GridView? = null
    private var adapterTopics: AdapterKnowledge? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_knowledge)
        gridTopics = findViewById(R.id.grid_knowledge)
        adapterTopics = AdapterKnowledge(this@Knowledge, topics, pictures)
        gridTopics!!.adapter = adapterTopics
    }
}
