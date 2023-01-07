package com.example.android.onewaydatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.onewaydatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
//    lateinit var binding: ActivityMainBinding
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        var myobjectrefrence=MyDataClass("t1","t2","t3","t4","t5")
//        var myobjectrefrence2=MyDataClass("t21","t22","t23","t24","t25")
        binding.myDataRefrence=myobjectrefrence
//        binding.myDataRefrence=myobjectrefrence2
       /* binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        val TextObj=MyDataClass("textOne","text2","text3","text4","text5")
        binding.myDataRefrence=TextObj*/
    }
}