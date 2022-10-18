package com.app.musicbass

import android.media.Image
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class adaptermusicroyxat:RecyclerView.Adapter<adaptermusicroyxat.musiqalar>() {

        val image = arrayOf(
            R.drawable.rasmqushiq,
            R.drawable.rasmtwo,
            R.drawable.rasmuch,
            R.drawable.salom
        )
        val name = arrayOf(
            "Mix:Dec21,",
            "On My Way",
            "Mix:Dec20,",
            "Uzmir:SAlom"
        )


    inner class musiqalar(itemView: View):RecyclerView.ViewHolder(itemView){

        val  image:ImageView
        val name :TextView

        init {
            name=itemView.findViewById(R.id.textView5)
            image=itemView.findViewById(R.id.image)
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): musiqalar {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.list_music,parent,false)
        return musiqalar(view)
    }

    override fun onBindViewHolder(holder: musiqalar, position: Int) {
        holder.name.text=name[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }


}