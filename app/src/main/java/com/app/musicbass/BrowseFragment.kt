package com.app.musicbass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.musicbass.databinding.FragmentBarBinding
import com.app.musicbass.databinding.FragmentBrowseBinding
import com.app.musicbass.databinding.FragmentHomeBinding

class BrowseFragment : Fragment() {
    lateinit var binding:FragmentBrowseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentBrowseBinding.inflate(layoutInflater)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.browsemusic.adapter=Browsermusic()
        binding.browselist.adapter=list_adapterofqush9()
        binding.ikkiqator.adapter=ikkiqatoriback()

        super.onViewCreated(view, savedInstanceState)
    }









}