package com.f4l.lat_top1_ch4.latihan1

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.lifecycle.Observer
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import com.f4l.lat_top1_ch4.R
import kotlinx.android.synthetic.main.fragment_news.*
import kotlinx.android.synthetic.main.item_news.*

class NewsFragment : Fragment() {

    companion object {
        fun newInstance() = NewsFragment()
    }

    private lateinit var viewModel: NewsViewModel
    private lateinit var adp : NewsAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        return inflater.inflate(R.layout.fragment_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        dataNews()
        viewModel = ViewModelProvider(this).get(NewsViewModel::class.java)
        viewModel.getNews()
        viewModel.mList.observe(viewLifecycleOwner, Observer {
            adp.setList(it as ArrayList<NewsData>)
        })
    }

fun dataNews(){
    adp = NewsAdapter(ArrayList())
    rvNews.adapter = adp
    rvNews.layoutManager = LinearLayoutManager(context)
    }

}