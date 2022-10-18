package com.app.musicbass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class MyAdapterikki:RecyclerView.Adapter<MyAdapterikki.ViewHolder>() {

    inner class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var name:TextView
     var image:ImageView

     init {
         name=itemView.findViewById(R.id.textView5)
         image=itemView.findViewById(R.id.image)
     }

    }

    val image = arrayOf(
        R.drawable.rasmqushiq,
        R.drawable.rasmtwo,
        R.drawable.rasmuch
    )
    val name = arrayOf(
        "Mix:Dec21,",
        "On My Way",
        "Mix:Dec20,",
    )
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.list_music,parent,false)

        return  ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.name.text=name[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
     return  name.size
    }
}