package com.example.projcet

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projcet.databinding.ListlayoutBinding

class MyAdapter(val context: Context) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private val ListInput : ArrayList<Mahasiswa> = arrayListOf()

    inner class MyViewHolder(val binding: ListlayoutBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(autoRead: Mahasiswa){
             binding.nama.text = autoRead.nama
             binding.alamat.text = autoRead.alamat
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(ListlayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return ListInput.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val Inputan = ListInput[position]
        holder.bind(Inputan)

    }
                            //list juga bisa
    fun setMahasiswa(data : ArrayList<Mahasiswa>){
        ListInput.clear()
        ListInput.addAll(data)
        notifyDataSetChanged()
    }


}