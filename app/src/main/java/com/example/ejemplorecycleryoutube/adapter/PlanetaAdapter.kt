package com.example.ejemplorecycleryoutube.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ejemplorecycleryoutube.R
import com.example.ejemplorecycleryoutube.datos.PlanetasProvider
import com.example.ejemplorecycleryoutube.model.Planeta

class PlanetaAdapter(private val listaPlanetas:List<Planeta>) :
    RecyclerView.Adapter<PlanetaViewHolder>(){

    private var onItemClickListener: ((Int) -> Unit)? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlanetaViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_adaptador, parent, false)
        return PlanetaViewHolder(view)
    }

    override fun getItemCount(): Int {
       return listaPlanetas.size
    }

    override fun onBindViewHolder(holder: PlanetaViewHolder, position: Int) {
       val item=listaPlanetas[position]
        holder.render(item)
       // holder.tvNombre.text = PlanetasProvider.listaPlanetas[position].nombre
        //holder.tvTipo.text = PlanetasProvider.listaPlanetas[position].tipo
    }

    fun setOnItemClickListener(listener: (Int) -> Unit) {
        onItemClickListener = listener
    }
}