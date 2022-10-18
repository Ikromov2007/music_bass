package com.app.musicbass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListAdapter
import com.app.musicbass.databinding.FragmentHomemusicBinding


class HomemusicFragment : Fragment() {
    lateinit var binding: FragmentHomemusicBinding
    lateinit var userArrayList: ArrayList<list_modelofqush>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomemusicBinding.inflate(layoutInflater)

        return binding.root}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.listview.adapter=adaptermusicroyxat()
        binding.musiqaqisqar.adapter=Musiqaqisqartir()


//        userArrayList = ArrayList()
//
//        for (i in name.indices) {
//            val user = list_modelofqush(image[i], name[i])
//            userArrayList.add(user)
//        }



    }





}