package com.app.musicbass

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
class list_adapterofqush9:RecyclerView.Adapter<list_adapterofqush9.browsemusic>(){

    val name= arrayOf(
        "Back in time",
        "On my Way  ",
        "MAx:DEc 23",
        "Time Varp"
    )
    val imege= arrayOf(
        R.drawable.backintime,
        R.drawable.rasmtwo,
        R.drawable.rasmuch,
        R.drawable.timevarp
    )

    inner class browsemusic(itemview:View):RecyclerView.ViewHolder(itemview){
        val name :TextView
        val image:ImageView

        init {
            name=itemview.findViewById(R.id.broswernametext)
            image=itemview.findViewById(R.id.browserimagepast)
        }
    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): browsemusic {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.list_browsermusic,parent,false)
        return browsemusic(view)
    }

    override fun onBindViewHolder(holder: browsemusic, position: Int) {
        holder.name.text=name[position]
        holder.image.setImageResource(imege[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

}


