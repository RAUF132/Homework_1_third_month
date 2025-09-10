package com.example.homework_1_thirdmonth

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.homework_1_thirdmonth.databinding.ItemCarBinding
class CarAdapter(val carList: List<CarModel> ): RecyclerView.Adapter<CarAdapter.CarViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarViewHolder {
        return CarViewHolder(ItemCarBinding.inflate(LayoutInflater.from(parent.context,),
            parent, false))
    }

    override fun onBindViewHolder(
        holder: CarViewHolder,
        position: Int
    ) {
        holder.onBind(carList[position])
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    class CarViewHolder(private val binding: ItemCarBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(carModel: CarModel){

            Glide.with(binding.carImage).load(carModel.img).into(binding.carImage)

            binding.price.text = carModel.price
            binding.title.text = carModel.title
        }

    }

}