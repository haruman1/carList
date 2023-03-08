package com.braderrr.carmobile.utama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.braderrr.carmobile.databinding.ActivitySplashBinding

class SplashActivity : AppCompatActivity() {

    private var _binding: ActivitySplashBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val waktuKeluar = 2000
        binding.icon.alpha = 0f
        binding.icondesc.alpha = 0f
        binding.icon.translationZ = 800f
        binding.icon.translationY = 30f
        binding.icondesc.translationZ = -800f
        binding.icondesc.translationY = -30f
        binding.icon.animate().alpha(1f).translationY(0f).setStartDelay(500).setDuration(500).start()
        binding.icondesc.animate().alpha(1f).translationY(0f).setStartDelay(500).setDuration(500).start()

        //next
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@SplashActivity, MainActivity::class.java))
            finish()
        }, waktuKeluar.toLong())

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }



}