package com.f4l.lat_top1_ch4.student_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.f4l.lat_top1_ch4.R

class StudentAdapter(var list: ArrayList<StudentData>) : RecyclerView.Adapter<StudentAdapter.StudentViewHolder>() {
    class StudentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        var nama = itemView.findViewById<TextView>(R.id.vNama)
        var nim = itemView.findViewById<TextView>(R.id.vNim)
        var foto = itemView.findViewById<ImageView>(R.id.img_mhs)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StudentViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return StudentViewHolder(view)
    }

    override fun onBindViewHolder(holder: StudentViewHolder, position: Int) {
        holder.nama.text = list[position].nama
        holder.nim.text = list[position].nim
        holder.foto.setImageResource(list[position].foto)
    }

    override fun getItemCount(): Int = list.size

    fun setData(listData: ArrayList<StudentData>){
        this.list = listData
    }
}