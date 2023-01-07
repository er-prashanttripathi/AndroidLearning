package com.example.android.databindingtrial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.android.databindingtrial.databinding.ActivityDataBindingModalBinding
import com.example.android.databindingtrial.databinding.ActivityMainBinding

class dataBindingModal : AppCompatActivity()

{lateinit var binding: ActivityDataBindingModalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_data_binding_modal)
        var TestdataClass = DataClassTest("t1","t2","t3","t4")
        binding.viewmodelnew=TestdataClass
    }
}