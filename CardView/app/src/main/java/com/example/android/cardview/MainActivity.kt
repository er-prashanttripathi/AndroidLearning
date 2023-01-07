package com.example.android.cardview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.android.cardview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var listthecategories= arrayListOf<phonedetailsclass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        listthecategories=ArrayList<phonedetailsclass>()

        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        listthecategories.add(phonedetailsclass(personName = "xyz1", personNumber = "9999999991"))
        listthecategories.add(phonedetailsclass(personName = "xyz2", personNumber = "9999999992"))
        listthecategories.add(phonedetailsclass(personName = "xyz3", personNumber = "9999999993"))
        listthecategories.add(phonedetailsclass(personName = "xyz4", personNumber = "9999999994"))
        binding.rcv1.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        binding.rcv1.adapter=rcvAdapter(this,listthecategories)

    }
}