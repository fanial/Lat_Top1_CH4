package com.f4l.lat_top1_ch4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider

class UseViewModelActivity : AppCompatActivity() {
    lateinit var viewModel: UseViewModel
    lateinit var inTinggi : EditText
    lateinit var inLebar : EditText
    lateinit var inPanjang : EditText
    lateinit var btn_hasil : Button
    lateinit var vHasil : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_use_view_model)
        inLebar = findViewById(R.id.inLebar)
        inTinggi = findViewById(R.id.inTinggi)
        inPanjang = findViewById(R.id.inTinggi)
        btn_hasil = findViewById(R.id.btn_hasil)
        vHasil = findViewById(R.id.vHasil)

        viewModel = ViewModelProvider(this).get(UseViewModel::class.java)
        vHasil.text = viewModel.hasil.toString()

        btn_hasil.setOnClickListener {
            var p = inPanjang.text.toString().toInt()
            var l = inLebar.text.toString().toInt()
            var t = inTinggi.text.toString().toInt()
            viewModel.calculate(p,l,t)
            vHasil.text = viewModel.hasil.toString()
        }
    }
}