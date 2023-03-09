package com.braderrr.carmobile.utama

import android.content.Intent
import com.braderrr.carmobile.utama.SplashActivity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.braderrr.carmobile.R
import com.braderrr.carmobile.adapters.MobilAdapter
import com.braderrr.carmobile.databinding.ActivityMainBinding
import com.braderrr.carmobile.inteface.OnCarListClickListener
import com.braderrr.carmobile.models.CarModels

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    //interaksi kalau ada null biarkan sajah
    //paling dasar jika buat activy
    // ketika buat activy usahakan saat binding
    private val carList: ArrayList<CarModels> = ArrayList()
    private var adapter: RecyclerView.Adapter<MobilAdapter.Viewholder>? = null
    private var layoutManager: RecyclerView.LayoutManager? = null
        //ketika dijalankan
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        addData()
        setContentView(binding.root)
        adapter = MobilAdapter(carList)
        layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.carList.adapter = adapter
        binding.carList.layoutManager = layoutManager

        //interface onCarClickListener
        (adapter as MobilAdapter).onCarListClickListener(object: OnCarListClickListener{
            override fun onCarListClick(data: CarModels) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                intent.putExtra(DetailActivity.data,data)
                startActivity(intent)
            }
        })
            binding.about.setOnClickListener { startActivity(Intent(this, AboutActivity::class.java )) }
    }

    private fun addData(){
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))
        carList.add(CarModels(
            R.drawable.citycar, getString(R.string.cityCarPembuat),getString(R.string.cityCarModel), getString(
                R.string.cityCarKeluaran
            ), getString(R.string.cityCarDeskripsi)))

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}