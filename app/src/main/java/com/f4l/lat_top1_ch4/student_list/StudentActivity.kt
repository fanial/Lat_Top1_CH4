package com.f4l.lat_top1_ch4.student_list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.f4l.lat_top1_ch4.R

class StudentActivity : AppCompatActivity() {
    lateinit var rvStudent : RecyclerView
    lateinit var adapter : StudentAdapter
    lateinit var studentVm : StudentViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setDataStudent()

        studentVm = ViewModelProvider(this).get(StudentViewModel::class.java)

        studentVm.getStudent()
        studentVm.studentList.observe(this, Observer {
            adapter.setData(it as ArrayList<StudentData>)
        })

    }
    fun setDataStudent(){
        rvStudent = findViewById(R.id.rv_main)
        adapter = StudentAdapter(ArrayList())

        rvStudent.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL, false)
        rvStudent.adapter = adapter
    }
}