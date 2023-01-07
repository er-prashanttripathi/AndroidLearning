package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class fragment_One: Fragment() {
    override fun onCreateView(

        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_one,container,false)
        val btn3: Button =view.findViewById(R.id.btn3)
        val btn4: Button =view.findViewById(R.id.btn4)
        btn3.setOnClickListener{
            loadfrag3(
                fragment_Three()
            )
        }
        btn4.setOnClickListener {
            loadfrag4(
                fragment_Four()
            )
        }
        return view
    }
    fun loadfrag4(frag4:fragment_Four){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag34,frag4)
        ft.commit()
    }
    fun loadfrag3(frag3:fragment_Three){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag34,frag3)
        ft.commit()
    }


}
