package com.f4l.lat_top1_ch4.latihan1

import java.io.Serializable


data class NewsData(val judul : String, val tgl : String, val jurnalis : String, val isi : String ,val foto : Int) : Serializable{
}