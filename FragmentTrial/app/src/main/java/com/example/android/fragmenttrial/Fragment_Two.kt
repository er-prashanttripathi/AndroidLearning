package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragment_Two: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_two,container,false)
        val btn5: Button =view.findViewById(R.id.btn5)
        val btn6: Button =view.findViewById(R.id.btn6)
        btn5.setOnClickListener{
            loadfrag8(
                fragment_eight()
            )
        }
        btn6.setOnClickListener {
            loadfrag10(
                fragment_ten()
            )
        }
        return view
    }
    fun loadfrag10(frag10:fragment_ten){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag810,frag10)
        ft.commit()
    }
    fun loadfrag8(frag8:fragment_eight){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag810,frag8)
        ft.commit()
    }


}