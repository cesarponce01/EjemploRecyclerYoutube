package com.example.ejemplorecycleryoutube

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecycleryoutube.adapter.PlanetaAdapter
import com.example.ejemplorecycleryoutube.datos.PlanetasProvider

class MainActivity : AppCompatActivity() {

    private lateinit var listViewItems: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerplanetas)
        recyclerView.layoutManager = LinearLayoutManager(this)

        val planetasProvider = PlanetasProvider(resources)
        val planetaAdapter = PlanetaAdapter(planetasProvider.listaPlanetas)
        recyclerView.adapter = planetaAdapter


        planetaAdapter.setOnItemClickListener { position ->
            val perfilPlaneta = planetasProvider.listaPlanetas[position]
            val miIntent = Intent(this, segundaActividad::class.java)
            miIntent.putExtra("clasePlaneta", perfilPlaneta.getBundle())
            startActivity(miIntent)
        }
    }

}