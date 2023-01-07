package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment_Three: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_three,container,false)
        loadfrag5(
            fragment_Five()
        )
        loadfrag6(
            fragment_six()
        )
        loadfrag7(
            fragment_seven()
        )
        return view
    }
    fun loadfrag5(frag5:fragment_Five){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag5,frag5)
        ft.commit()
    }
    fun loadfrag6(frag6:fragment_six){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag7,frag6)
        ft.commit()
    }
    fun loadfrag7(frag7:fragment_seven){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag8,frag7)
        ft.commit()
    }
}