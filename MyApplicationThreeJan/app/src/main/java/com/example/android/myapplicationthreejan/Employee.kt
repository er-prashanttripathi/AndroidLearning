package com.example.android.myapplicationthreejan

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Employee(
    val Emp_Name:String,
    val Emp_Surname:String,
    val Emp_F_Name:String,
    val Emp_M_Name:String,
    val Emp_SpouseName:String,
    val Emp_City:String,
    val Emp_State:String,
    val Emp_MNo: String,
    val Emp_AadharNo:String,
    val Emp_PINCode:String):Parcelable{

}
