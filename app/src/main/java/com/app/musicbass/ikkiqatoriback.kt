package com.app.musicbass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ikkiqatoriback:RecyclerView.Adapter<ikkiqatoriback.ikkiqator>() {

    val name= arrayOf(
        "New York\nSalom",
        "Best of 2022",
        "Social Distancing",
        "Romance"
    )

    val image= arrayOf(
        R.drawable.timevarp,
        R.drawable.yerim,
        R.drawable.backintime,
        R.drawable.rasmuch
    )


    inner  class ikkiqator(itemView: View):RecyclerView.ViewHolder(itemView){

        val name:TextView
        val image:ImageView

        init {
            name=itemView.findViewById(R.id.qatorname)
            image=itemView.findViewById(R.id.qatorimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ikkiqator {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.list_ikkiqator,parent,false)
        return ikkiqator(view)
    }

    override fun onBindViewHolder(holder: ikkiqator, position: Int) {
        holder.name.text=name[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
       return name.size
    }
}