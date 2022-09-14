package com.f4l.lat_top1_ch4.latihan1

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.f4l.lat_top1_ch4.R

class NewsAdapter(var newsList : ArrayList<NewsData>):RecyclerView.Adapter<NewsAdapter.NewsViewHolder>(){
    var onClick: ((NewsData) -> Unit)? = null

    class NewsViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
        var judul = itemView.findViewById<TextView>(R.id.vJudul)
        var tgl = itemView.findViewById<TextView>(R.id.vTgl)
        var jurnalis = itemView.findViewById<TextView>(R.id.vJurnalis)
        var foto = itemView.findViewById<ImageView>(R.id.vFoto)
        var card = itemView.findViewById<CardView>(R.id.btn_card_news)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        var view = LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.judul.text = newsList[position].judul
        holder.jurnalis.text = newsList[position].jurnalis
        holder.tgl.text = newsList[position].tgl
        holder.foto.setImageResource(newsList[position].foto)
        val isiDetail = newsList[position].isi
        holder.card.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {
                var bundle = Bundle()
                bundle.putString("judul",holder.judul.text.toString())
                bundle.putString("jurnalis",holder.jurnalis.text.toString())
                bundle.putString("tgl",holder.tgl.text.toString())
                bundle.putString("isi", isiDetail)

                Navigation.findNavController(holder.itemView).navigate(R.id.action_newsFragment_to_detailFragment, bundle)
            }

        })
    }

    override fun getItemCount(): Int = newsList.size

    fun setList(listData : ArrayList<NewsData>){
        this.newsList = listData
    }
}