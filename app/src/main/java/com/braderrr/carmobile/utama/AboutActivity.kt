package com.braderrr.carmobile.utama

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.braderrr.carmobile.R
import com.braderrr.carmobile.databinding.ActivityAboutBinding
import com.bumptech.glide.Glide

class AboutActivity : AppCompatActivity() {
    private var _binding: ActivityAboutBinding? = null
    private val binding get() = _binding!!

    //perubahan ini indah sekali
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        _binding =ActivityAboutBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Glide.with(this).load(R.drawable.foto_haruman).circleCrop().into(binding.avatar)
        binding.backarrow.setOnClickListener { finish() }
    }
    companion object{
        const val data = "Ini data"
    }
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}