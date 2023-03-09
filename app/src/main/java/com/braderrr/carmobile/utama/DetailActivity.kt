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
        val data = intent.getParcelableExtra<CarModels>(data) as CarModels
        binding.image.setImageResource(data.avatar!!)
        binding.title.text = data.pembuatMobil
        binding.modelMobil.text = data.modelMobil
        binding.jenisMobil.text = data.pembuatMobil
        binding.desccontent.text = data.deskripsiMobil

        binding.backarrow.setOnClickListener { finish() }
        setContentView(binding.root)

    }
//    val avatar: Int?,
//    val pembuatMobil: String?,
//    val modelMobil: String?,
//    val keluaranMobil: String?,
//    val deskripsiMobil: String?,
    companion object{
        const val data = "Data"
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}