package com.example.ifood.ui.fragment.home

import GifAdapter
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.example.ifood.R
import com.example.ifood.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {


private lateinit var binding: FragmentGalleryBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentGalleryBinding.inflate(layoutInflater)
        Glide.with(this)
            .asGif()
            .load(R.drawable.burger)
            .into(binding.imageViewGaleria)

        return binding.root

        }

    }


