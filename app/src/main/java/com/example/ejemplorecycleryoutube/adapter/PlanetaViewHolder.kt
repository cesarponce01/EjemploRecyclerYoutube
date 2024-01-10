package com.example.ejemplorecycleryoutube.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecycleryoutube.R
import com.example.ejemplorecycleryoutube.model.Planeta

class PlanetaViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    val tvNombre: TextView = itemView.findViewById(R.id.adapterNombre)
    val ivImagen: ImageView = itemView.findViewById(R.id.adapterImagen)
    val tvTipo: TextView = itemView.findViewById(R.id.adapterTipo)

    fun render(planetaModelo: Planeta){
        tvNombre.text=planetaModelo.nombre
        ivImagen.setImageBitmap(planetaModelo.imagen)
        tvTipo.text=planetaModelo.tipo
    }
}