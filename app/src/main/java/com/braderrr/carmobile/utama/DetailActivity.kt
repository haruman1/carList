package com.braderrr.carmobile.utama

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import com.braderrr.carmobile.databinding.ActivityDetailBinding
import com.braderrr.carmobile.models.CarModels

class DetailActivity : AppCompatActivity() {

    private var _binding: ActivityDetailBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    companion object{
        const val data = "Data"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}