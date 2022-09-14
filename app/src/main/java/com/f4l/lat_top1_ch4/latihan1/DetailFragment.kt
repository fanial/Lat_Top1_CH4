package com.f4l.lat_top1_ch4.latihan1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.f4l.lat_top1_ch4.R
import kotlinx.android.synthetic.main.fragment_detail.*

class DetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var getJudul = arguments?.getString("judul")
        var getJurnalis = arguments?.getString("jurnalis")
        val getTgl = arguments?.getString("tgl")
        val getIsi = arguments?.getString("isi")

        vDetailJudul.text = getJudul
        vDetailJurnalis.text = getJurnalis
        vDetailTgl.text = getTgl
        vIsi.text = getIsi

    }

}