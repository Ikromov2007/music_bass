package com.app.musicbass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class Musiqaqisqartir: RecyclerView.Adapter<Musiqaqisqartir.salomlar>() {

val image= arrayOf(
    R.drawable.ozodbek,
    R.drawable.sherali,
    R.drawable.shoxruh,
)
    val name = arrayOf(
        "Ozodbek \nNazarbekov",
        "Sherali \nJo'rayev",
        "Shoxruxxon \nAytilgan toy"
    )


    inner class salomlar(itemView: View):RecyclerView.ViewHolder(itemView){

        val name:TextView
        val image:ImageView

        init {
            name =itemView.findViewById(R.id.ozodbekism)
            image=itemView.findViewById(R.id.ozod)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): salomlar {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.list_ozod,parent,false)
        return salomlar(view)
    }

    override fun onBindViewHolder(holder:salomlar, position: Int) {
        holder.name.text=name[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }
}