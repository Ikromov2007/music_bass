package com.app.musicbass

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class Browsermusic:RecyclerView.Adapter<Browsermusic.browsermusic>() {

    val image = arrayOf(
        R.drawable.nimafriends,
        R.drawable.ofisuzb,
        R.drawable.timevarp,
        R.drawable.yerim
    )
    val name = arrayOf(
        "Nima   \nFriends",
        "Ofis   \nMy job ",
        "Vaqt\nMoshinam",
        "Tugadi \nUje"
    )

    inner class browsermusic(itemView: View):RecyclerView.ViewHolder(itemView){
        val name:TextView
        val image:ImageView

        init {
            name=itemView.findViewById(R.id.browsename)
            image=itemView.findViewById(R.id.browseimage)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): browsermusic {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_browsemusic,parent,false)
        return browsermusic(view)
    }

    override fun onBindViewHolder(holder: browsermusic, position: Int) {
        holder.name.text=name[position]
        holder.image.setImageResource(image[position])
    }

    override fun getItemCount(): Int {
        return name.size
    }

}