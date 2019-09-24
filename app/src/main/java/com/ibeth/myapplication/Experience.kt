package com.ibeth.myapplication

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.widget.GridView

import java.util.Arrays

class Experience : AppCompatActivity() {
    private val companies = Arrays.asList("Maka Technologies", "Pro Agro")
    private val positions = Arrays.asList("Android Developer", "Project Leader/ Android Developer")
    private val descriptions = Arrays.asList("-Web oriented analysis and development\n-Android Mobile apps development\n-UX testing for Android apps",
            "-.NET and C# analysis and development\n-Android apps development\n-SOAP and REST webservices development")
    private val pictures = intArrayOf(1, 2, 3)
    private var gridJobs: GridView? = null
    private var adapterExperience: AdapterExperience? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_experience)
        gridJobs = findViewById(R.id.grid_knowledge)
        adapterExperience = AdapterExperience(this@Experience, companies, positions, descriptions, pictures)
        gridJobs!!.adapter = adapterExperience
    }
}
