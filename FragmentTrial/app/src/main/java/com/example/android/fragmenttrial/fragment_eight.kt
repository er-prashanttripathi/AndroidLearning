package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment_eight : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_eight,container,false)
        loadfrag11(
            Fragment_eleven()
        )
        loadfrag12(
            Fragment_twelve()
        )
        loadfrag13(
            Fragment_thirteen()
        )
        return view
    }
    fun loadfrag11(frag11:Fragment_eleven){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag11,frag11)
        ft.commit()
    }
    fun loadfrag12(frag12:Fragment_twelve){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag12,frag12)
        ft.commit()
    }
    fun loadfrag13(frag13:Fragment_thirteen){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag13,frag13)
        ft.commit()
    }
}