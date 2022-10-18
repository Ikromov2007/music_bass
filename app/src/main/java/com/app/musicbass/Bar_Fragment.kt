package com.app.musicbass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.app.musicbass.databinding.FragmentBarBinding
import com.app.musicbass.databinding.FragmentHomemusicBinding

class Bar_Fragment : Fragment() {
    lateinit var binding : FragmentBarBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding =  FragmentBarBinding.inflate(layoutInflater)
    return  binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {


        binding.musicroyhat.setOnClickListener {
            findNavController().navigate(R.id.action_bar_Fragment_to_fadedFragment)
        }



        replaseFragment(HomemusicFragment())

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home->replaseFragment(HomemusicFragment())
                R.id.search->replaseFragment(SearchFragment())
                R.id.browse->replaseFragment(BrowseFragment())
                R.id.profile->replaseFragment(ProfileFragment())
            }
            true
        }


        super.onViewCreated(view, savedInstanceState)
    }

    private fun replaseFragment(homemusicFragment: Fragment) {

        val fragmentmanager= childFragmentManager

        val fragenttrasaction= fragmentManager?.beginTransaction()

        fragenttrasaction?.replace(R.id.fragmentbar,homemusicFragment)
        fragenttrasaction?.commit()
    }


}