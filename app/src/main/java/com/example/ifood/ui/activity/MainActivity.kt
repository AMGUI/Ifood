package com.example.ifood.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.ifood.R
import com.example.ifood.databinding.ActivityMainBinding
import com.example.ifood.ui.fragment.home.HomeFragment
import com.example.ifood.ui.fragment.ProfileFragment
import com.example.ifood.ui.fragment.SearchFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(HomeFragment())
        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.home -> replaceFragment(HomeFragment())
                R.id.search -> replaceFragment(SearchFragment())
                R.id.profile -> replaceFragment(ProfileFragment())



            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment ){
      //  val fragmentHome  = supportFragmentManager
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frameLayFragmet,fragment)
        fragmentTransaction.commit()
    }
}