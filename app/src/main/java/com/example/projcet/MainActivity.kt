package com.example.projcet

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.projcet.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val grid  = GridLayoutManager(this,2)
        binding.RecyclerHome.layoutManager = grid




        val dataSekolah = arrayListOf<Mahasiswa>()

        dataSekolah.add(Mahasiswa("andy","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("dimas","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))
        dataSekolah.add(Mahasiswa("yuza","Mojokerto"))

        val adapter1 = MyAdapter(this)
        adapter1.setMahasiswa(dataSekolah)
        binding.RecyclerHome.adapter = adapter1



    }
}