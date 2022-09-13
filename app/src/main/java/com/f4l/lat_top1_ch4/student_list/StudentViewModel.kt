package com.f4l.lat_top1_ch4.student_list

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.f4l.lat_top1_ch4.R

class StudentViewModel : ViewModel() {
    // TODO: Implement the ViewModel
    val listData = arrayListOf(
        StudentData("Fani", "20110021", R.drawable.ic_launcher_foreground),
        StudentData("Ahmad", "20110180", R.drawable.ic_launcher_foreground),
        StudentData("Raihan", "20110034", R.drawable.ic_launcher_foreground),
        StudentData("Sendy", "20110101", R.drawable.ic_launcher_foreground),
        StudentData("Azmiy", "20110234", R.drawable.ic_launcher_foreground),
        StudentData("Suhendar", "20110019", R.drawable.ic_launcher_foreground),
        StudentData("Syifa", "20110118", R.drawable.ic_launcher_foreground),
        StudentData("Indi", "20110097", R.drawable.ic_launcher_foreground),
        StudentData("Intan", "20110071", R.drawable.ic_launcher_foreground),
        StudentData("Abdul", "20110111", R.drawable.ic_launcher_foreground),
    )

    val studentList : MutableLiveData<List<StudentData>> = MutableLiveData()

    fun getStudent() {
        var student = listData
        studentList.value = student
    }
}