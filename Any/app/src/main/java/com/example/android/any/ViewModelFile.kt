package com.example.android.any

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ViewModelFile:ViewModel() {
//    var myobj= MutableLiveData("E")

    private var _lastAccessedCourse: MutableLiveData<EmployeeDataClass> =MutableLiveData()
    var myObj=EmployeeDataClass("Mr X", "xyz.pvt.ltd", "Dy.ASP", "10", "XYZeepur", "20", "China")
}