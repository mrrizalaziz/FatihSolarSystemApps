package com.example.fatihrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.planet_layout.view.*

class PlanetAdapter : RecyclerView.Adapter<PlanetAdapter.ViewHolder>() {

    private val planetName = arrayOf("Mercury",
        "Venus", "Earth", "Mars",
        "Jupiter", "Saturn", "Uranus", "Neptune",
        "Pluto","Eris","Ceres","Haumea","Make Make")

    private val planetDetails = arrayOf("Mercury is the smallest planet in our solar system", "Venus is the hottest planet in our solar system",
        "Earth is the only planet with living", "Mars is a red planet",
        "Jupiter is the biggest planet in our solar system", "Saturn is a beautiful planet with rings",
        "Uranus is the coldest planet in our solar system", "Neptune is the blue planet",
        "Pluto now a dwarf planet", "Eris is a dwarf planet", "Ceres is a dwarf planet",
        "Haumea is a wierd planet shape like an oval", "MakeMake is also a dwrft")

    private val images = intArrayOf(R.drawable.mercury,
        R.drawable.venus, R.drawable.earth,
        R.drawable.mars, R.drawable.jupiter, R.drawable.saturn, R.drawable.uranus,
        R.drawable.neptune,
        R.drawable.pluto, R.drawable.eris, R.drawable.ceres, R.drawable.haumea, R.drawable.makemake)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent.context)
            .inflate(R.layout.planet_layout, parent, false)
        return ViewHolder(v)
    }

    override fun getItemCount(): Int {
        return planetName.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.planet_name.text = planetName[position]
        holder.itemView.planet_detail.text = planetDetails[position]
        holder.itemView.planet_image.setImageResource(images[position])
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        init {
            itemView.setOnClickListener {
                Toast.makeText(itemView.context, itemView.planet_name.text,  Toast.LENGTH_SHORT).show()
            }
        }
    }
}