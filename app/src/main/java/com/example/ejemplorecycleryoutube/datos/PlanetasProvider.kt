package com.example.ejemplorecycleryoutube.datos

import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.ejemplorecycleryoutube.R
import com.example.ejemplorecycleryoutube.model.Planeta


class PlanetasProvider(private val resources: Resources) {

        val  listaPlanetas= mutableListOf(
        Planeta("Mercurio", "Descubierto por el Inglés Thomas Harriot en 1631",0,0,"Rocoso", BitmapFactory.decodeResource(resources, R.drawable.mercurio)),
        Planeta("Venus", "Descubierto por Galilei en 1610",0,0,"Rocoso", BitmapFactory.decodeResource(resources, R.drawable.venus)),
        Planeta("Tierra", "Desde el IV antes de la era común se hace mención del planeta",1,0,"Rocoso", BitmapFactory.decodeResource(resources, R.drawable.tierra)),
        Planeta("Marte", "Descubierto por Galileo Galilei en 1610",2,0,"Rocoso", BitmapFactory.decodeResource(resources, R.drawable.marte)),
        Planeta("Júpiter", "Descubierto por Galilei en 1610",95,3,"Gaseoso", BitmapFactory.decodeResource(resources, R.drawable.jupiter)),
        Planeta("Saturno", "Descubierto por Galilei en 1610",146,7,"Gaseoso", BitmapFactory.decodeResource(resources, R.drawable.saturno)),
        Planeta("Urano", "Descubierto por William Herschel en 1781",27,13,"Masa Congelada",BitmapFactory.decodeResource(resources, R.drawable.urano)),
        Planeta("Neptuno", "Descubierto por Johann Galle en 1846",14,6,"Masa Congelada", BitmapFactory.decodeResource(resources, R.drawable.neptuno)))

}