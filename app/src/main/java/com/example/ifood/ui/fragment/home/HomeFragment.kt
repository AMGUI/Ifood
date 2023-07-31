package com.example.ifood.ui.fragment.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ifood.R
import com.example.ifood.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private lateinit var  binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
       binding = FragmentHomeBinding.inflate(layoutInflater)
        inflatLayouts(R.id.frameLayoutGallery,GalleryFragment())
        inflatLayouts(R.id.frameFooter, FooterFragment())
        return binding.root
    }


    private fun inflatLayouts(viewFrame: Int, fragment: Fragment){
        val trasitionFragment = childFragmentManager.beginTransaction()
        trasitionFragment.replace(viewFrame, fragment)
        trasitionFragment.commit()
    }

}