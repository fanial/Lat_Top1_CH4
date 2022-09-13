package com.f4l.lat_top1_ch4

import androidx.lifecycle.ViewModel

class UseViewModel : ViewModel() {
    var hasil = 0
    fun calculate(panjang:Int, lebar : Int, tinggi : Int){
        hasil = panjang * lebar * tinggi
    }
}