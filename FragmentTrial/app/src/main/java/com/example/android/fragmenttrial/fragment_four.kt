package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment_Four: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_four,container,false)
        loadfrag5(
            fragment_Five()
        )
        loadfrag9(
            fragment_nine()
        )

        return view
    }
    fun loadfrag5(frag5:fragment_Five){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag5,frag5)
        ft.commit()
    }
    fun loadfrag9(frag9:fragment_nine){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag9,frag9)
        ft.commit()
    }
}