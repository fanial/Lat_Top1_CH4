package com.f4l.lat_top1_ch4.latihan1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.f4l.lat_top1_ch4.R

class NewsViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val listBerita = arrayListOf(
        NewsData("Berita Persib Bandung: Kondisi Terkini Erwin Ramdani Usai Naik Meja Operasi", "13/09/2022", "Arkhelaus Wisnu Triyogo", "Rafi menyebut, tim medis Persib memutuskan untuk membawa pulang pemain kelahiran 11 Maret 1993 ini ke Bandung untuk menjalani perawatan lebih lanjut. “Setelah dilakukan operasi dan pemberian antibiotik, kami membawa Erwin untuk pulang dan menjalani perawatan di Bandung,” ujar Rafi.", R.drawable.ic_image_24),
        NewsData("Putri Candrawathi Ikut Tembak Brigadir J, Ditanggapi soal Temuan Komnas HAM","13/09/2022","Salomo Tarigan","teanyar, Arman Hanis yang juga Pengacara Putri Candrawathi membantah Komnas HAM soal dugaan kliennya turut ikut terlibat menembak  Brigadir J di rumah dinas suaminya Ferdy Sambo di Kompleks Polri Duren Tiga, Jakarta Selatan.",R.drawable.ic_image_24),
        NewsData("Tarif Ojol Batal Naik Hari Ini Hingga Harga Semen di Papua Meroket Hingga Rp 650 Ribu","10/09/2022","Rr. Ariyani Yakti Widyastuti","Direktur Lalu Lintas Angkutan Jalan Kementerian Perhubungan Suharto menyatakan telah membuat kesepakatan dengan aplikator untuk mengundur pemberlakuan tarif ojek online hingga 11 September 2022. \n" +
                "\"Tapi karena jika tarif baru diberlakukan pada waktu tersebut, pasti akan menimbulkan potensi permasalahan di lapangan,\" tutur saat dihubungi Tempo, Sabtu, 10 September 2022. ",R.drawable.ic_image_24),
        NewsData("Gudang JNE Express Depok Terbakar","12/09/2022","Jay","Kabid Pengendalian dan Operasi Damkar Depok, Welman Naipospos mengatakan pihaknya mendapat kabar sekitar pukul 04.51 WIB. \n" +
                "\"Saat ini kita sudah menerjunkan 12 unit mobil Damkar,\" katanya.\n" + "“Titik api berasal dari lantai 2 gudang dan menyebar hampir kesuluruh gudang,” tambahnya.",R.drawable.ic_image_24),
        NewsData("Spesialis Curanmor di Kebomas Gresik Ditangkap Polisi","13/09/2022","Syuhud","TE tercatat sebagai residivis yang baru lima bulan keluar dari Hotel Prodeo (penjara). Kapolres Gresik, AKBP Mochamad Nur Azis, mengatakan bahwa petugas meringkus pelaku setelah mendapat laporan terkait curanmor di Kecamatan Kebomas pada Rabu (7/9/2022).",R.drawable.ic_image_24),
        NewsData("Richard Lee Tunjukkan Bukti soal Skincare yang Dipromosikan Kartika Putri Tak Miliki Izin BPOM","26/04/2022","Aditia Saputra","Melalui unggahan video, Richard membuktikan bahwa pernyataannya tak sekadar isapan jempol belaka. Sambil memegang dan memutar-mutar produk skincare tersebut, Richard balik bertanya apakah produk tersebut benar-benar ada izin BPOM-nya.",R.drawable.ic_image_24),
        NewsData("Luna Maya Luncurkan Skincare Baru di Surabaya: Wajah Cerah Tak Harus Putih","28/03/2022","Dian Kurniawan","Founder dan CEO produk kecantikan NAMA ini juga meluncurkan rangkaian skincare terbarunya yaitu Kakadu series. NAMA sebelumnya juga sukses mengeluarkan C-Booster Brightening and Age Defying Face Serum pada 2021 lalu.",R.drawable.ic_image_24),
        NewsData("Samsung Electronics Perkenalkan Layar Micro LED Terbaru Pasar Asia Tenggara & Oseania","2022","Ignatia Maria Sri Sayekti","“Micro LED mewakili masa depan inovasi layar. Samsung memimpin dalam adopsi Micro LED di Asia Tenggara dan Oseania dengan seri The Wall andalan kami. Memperkaya jajaran The Wall dengan peluncuran model All-in-One, kami menawarkan pengalaman yang lebih imersif dan inovasi dalam pemasangan, yang secara signifikan menyederhanakan prosesnya, serupa seperti memasang TV konsumen,” kata Leslie Goh, Head of Regional Display Solutions, Southeast Asia & Oceania, Samsung Electronics.",R.drawable.ic_image_24),
        NewsData("Wow! IT (Immersive Tech) Luncurkan 20 Produk IoT Terbaru","01/09/2022","Eko Lannue Ardy","Sebagian besar dari produk yang diluncurkan sudah tersedia sejak 29 Agustus 2022 di channel seperti\n" +
                "Urban Republic, Erafone, iBox, Samsung by NASA, laman ecommerce eraspace.com, IT Official Store di Tokopedia serta Shopee dan Urban Republic Official Store di Tokopedia.",R.drawable.ic_image_24),
        NewsData("Test","Test","Test","Test",R.drawable.ic_image_24),
        NewsData("Test","Test","Test","Test",R.drawable.ic_image_24),
        NewsData("Test","Test","Test","Test",R.drawable.ic_image_24),
        NewsData("Test","Test","Test","Test",R.drawable.ic_image_24),
        NewsData("Test","Test","Test","Test",R.drawable.ic_image_24),
    )
    val mList : MutableLiveData<List<NewsData>> = MutableLiveData()

    fun getNews(){
        var news = listBerita
        mList.value = news
    }
}