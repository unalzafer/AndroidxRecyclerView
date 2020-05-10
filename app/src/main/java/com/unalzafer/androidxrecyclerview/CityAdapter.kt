package com.unalzafer.androidxrecyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_city.view.*

class CityAdapter(private val cityList: List<City>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {
    //item nesnelerinin tanımı
    class CityViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivPoster: ImageView = itemView.ivPoster
        val tvName: TextView = itemView.tvName
        val tvPlate: TextView = itemView.tvPlate
    }
    //viewholder nesnesi oluşturup satır düzeni için görünüm
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_city, parent, false)
        return CityViewHolder(view)
    }
    //Listedeki toplam eleman sayısını döndürür
    override fun getItemCount(): Int {
        return cityList.size
    }
    //ViewHolder nesnesini alır ve içindeki görünümlerde belirli bir satır için uygun liste verilerini ayarlar.
    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val currentItem = cityList[position]

        holder.tvName.text = currentItem.name
        holder.tvPlate.text = currentItem.plate.toString()
    }
}