package com.braderrr.carmobile.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.braderrr.carmobile.databinding.CarListBinding
import com.braderrr.carmobile.inteface.OnCarListClickListener
import com.braderrr.carmobile.models.CarModels
import com.bumptech.glide.Glide


class MobilAdapter(private var carList: List<CarModels>): RecyclerView.Adapter<MobilAdapter.Viewholder>() {
    inner class Viewholder(val binding: CarListBinding): RecyclerView.ViewHolder(binding.root)
    private lateinit var onCarListClickListener: OnCarListClickListener

    fun onCarListClickListener(onCarListClickListener: OnCarListClickListener){
        this.onCarListClickListener = onCarListClickListener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilAdapter.Viewholder {
        val binding = CarListBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return Viewholder(binding)
    }

    override fun onBindViewHolder(holder: MobilAdapter.Viewholder, position: Int) {
        with(holder){
            with(carList[position]){
                Glide.with(itemView.context).load(avatar).circleCrop().into(binding.image)
                binding.namaMobil.text = modelMobil
                binding.merk.text = pembuatMobil
                //List Click
                itemView.setOnClickListener { onCarListClickListener.onCarListClick(carList[position]) }
                if(position == carList.lastIndex){
                    val params = itemView.layoutParams as RecyclerView.LayoutParams
                    params.bottomMargin = 120
                    itemView.layoutParams = params
                }else if(position == 0){
                    val params = itemView.layoutParams as RecyclerView.LayoutParams
                    params.topMargin = 10
                    itemView.layoutParams = params
                }
            }
        }
    }

    override fun getItemCount() = carList.size
}



