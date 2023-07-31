package com.example.ifood.ui.activity

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.animation.Animation
import com.example.ifood.R
import com.example.ifood.databinding.ActivitySplashBinding
import android.view.animation.AnimationUtils
import android.view.animation.ScaleAnimation


class SplashActivity : AppCompatActivity() {
    private lateinit var  binding: ActivitySplashBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val slideAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        val textAnimation = AnimationUtils.loadAnimation(this, R.anim.slide)
        binding.imageViewCarinha.setImageResource(R.drawable.logo)
        binding.imageViewCarinha.startAnimation(slideAnimation)
        binding.textClone.setTextColor(Color.parseColor("#Ea1d2c"))
        Handler(Looper.getMainLooper()).postDelayed({
            binding.textClone.setTextColor(Color.WHITE)
            binding.textClone.startAnimation(textAnimation)
        },1510)

        Handler(Looper.getMainLooper()).postDelayed({
            growView()

        },6000)

        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        },6700)

    }

    fun growView(){
        var  screenWidth  = resources.displayMetrics.widthPixels
        var  screenHeight = resources.displayMetrics.heightPixels

        // Define the scale animation from the current size to full screen size
        val scaleAnimation = ScaleAnimation(
            1f, screenWidth.toFloat(), // binding.imageViewCarinha.width,
            1f, screenHeight.toFloat(),  // binding.imageViewCarinha.height,
            Animation.RELATIVE_TO_SELF, 0.6f,
            Animation.RELATIVE_TO_SELF, 0.5f
        )

        scaleAnimation.duration = 8000 // Set the duration of the animation (in milliseconds)

        // Set an animation listener to be notified when the animation ends
        scaleAnimation.setAnimationListener(object : Animation.AnimationListener {
            override fun onAnimationStart(animation: Animation?) {}

            override fun onAnimationEnd(animation: Animation?) {
                // Animation has ended, the imageView is now full screen
            }

            override fun onAnimationRepeat(animation: Animation?) {}
        })

        // Start the animation on the imageView
        binding.imageViewCarinha.startAnimation(scaleAnimation)

    }

}