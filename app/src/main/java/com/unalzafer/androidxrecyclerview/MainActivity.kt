package com.unalzafer.androidxrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //listeyi adaptor'e bağla
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)//manager sınıfı liste görünümü belirleme
            adapter = CityAdapter(cityList)
        }
    }
    //Örnek liste
    private val cityList = listOf(
        City("Trabzon", 61),
        City("İstanbul", 34),
        City("İzmir", 35),
        City("Rize", 53),
        City("Sivas", 58)
    )
}
