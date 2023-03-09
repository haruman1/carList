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
        tambahMobil()
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

    private fun tambahMobil(){
        carList.add(CarModels(R.drawable.citycar, getString(R.string.citycarJenis), getString(R.string.cityCarMerk), getString(R.string.cityCarKeluaran), getString(R.string.cityCarDeskripsi)))

        carList.add(CarModels(R.drawable.hactback_bmw, getString(R.string.hatchbackJenis), getString(R.string.hatchbackCarmerk), getString(R.string.hatchbackCarKeluaran), getString(R.string.HatchbackCarDeskripsi)))

        carList.add(CarModels(R.drawable.mpv_sigra, getString(R.string.MPVJenis), getString(R.string.MPVMerk), getString(R.string.MPVCarKeluaran), getString(R.string.MPVCarDeskripsi)))

        carList.add(CarModels(R.drawable.suv_pajero, getString(R.string.SUVJenis), getString(R.string.SUVMerk), getString(R.string.SUVCarKeluaran), getString(R.string.SUVCarDeskripsi)))


        carList.add(CarModels(R.drawable.chevrolet_wagon, getString(R.string.wagonJenis), getString(R.string.wagonCarMerk), getString(R.string.wagonCarKeluaran), getString(R.string.wagonCarDeskripsi)))


        carList.add(CarModels(R.drawable.sport_chevrolet, getString(R.string.sportCarJenis), getString(R.string.sportCarMerk), getString(R.string.sportCarKeluaran), getString(R.string.sportCarDeskripsi)))

        carList.add(CarModels(R.drawable.hypercar_mclaren, getString(R.string.hyperCarJenis), getString(R.string.hyperCarMerk), getString(R.string.hyperCarKeluaran), getString(R.string.hyperCarDeskripsi)))

        carList.add(CarModels(R.drawable.supercar_masserati, getString(R.string.superCarJenis), getString(R.string.superCarMerk), getString(R.string.superCarKeluaran), getString(R.string.superCarDeskripsi)))

        carList.add(CarModels(R.drawable.crossover_kiaev6, getString(R.string.crossoverCarJenis), getString(R.string.crossoverCarMerk), getString(R.string.crossoverCarKeluaran), getString(R.string.crossoverCarDeskripsi)))

        carList.add(CarModels(R.drawable.pickup_mitsubishi, getString(R.string.pickCarJenis), getString(R.string.pickCarMerk), getString(R.string.pickCarKeluaran), getString(R.string.pickCarDeskripsi)))


    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}