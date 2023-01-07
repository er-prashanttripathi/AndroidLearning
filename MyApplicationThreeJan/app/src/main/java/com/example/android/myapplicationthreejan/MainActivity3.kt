package com.example.android.myapplicationthreejan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
/*
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
*/

/*//        val receiveobj=intent.getStringExtra("var_objdata")
//        var myarray:ArrayList<Employee>?= ArrayList()
//        ----------------------------------------------------
//        for(i in receiveobj!!){
//            edt
//        }
//        --------------------------------------------
//        val edt1=findViewById<TextView>(R.id.et1)
//        val edt2=findViewById<TextView>(R.id.et2)
//        edt1.text=myarray[0].toString()
//        edt2.text=receiveobj.toString()*/

    companion object{
        const val actthree= "var_objdata"
    }
    private var eemployeeArrayList3rdAct:ArrayList<Employee>?= ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        eemployeeArrayList3rdAct=intent.getParcelableArrayListExtra(actthree)
       /* for (i in eemployeeArrayList3rdAct!!){
            Log.d("random121111", "onCreate: ${i.toString()}")
        }*/
        et1.text=eemployeeArrayList3rdAct?.get(0)?.Emp_Name
        et2.text=eemployeeArrayList3rdAct?.get(0)?.Emp_Surname
        et3.text=eemployeeArrayList3rdAct?.get(0)?.Emp_F_Name
        et4.text=eemployeeArrayList3rdAct?.get(0)?.Emp_M_Name
        et5.text=eemployeeArrayList3rdAct?.get(0)?.Emp_City
        et6.text=eemployeeArrayList3rdAct?.get(0)?.Emp_State
        et7.text=eemployeeArrayList3rdAct?.get(0)?.Emp_SpouseName
        et8.text=eemployeeArrayList3rdAct?.get(0)?.Emp_AadharNo
        et9.text=eemployeeArrayList3rdAct?.get(0)?.Emp_PINCode
        et10.text= eemployeeArrayList3rdAct?.get(0)?.Emp_MNo.toString()

    }
}