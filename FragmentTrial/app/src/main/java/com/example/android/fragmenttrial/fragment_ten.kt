package com.example.android.fragmenttrial

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class fragment_ten : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? { val view=inflater.inflate(R.layout.fragment_ten,container,false)
        loadfrag14(
            Fragment_fourteen()
        )
        loadfrag15(
            Fragment_fifteen()
        )
        loadfrag16(
            Fragment_sixteen()
        )
        loadfrag17(
            Fragment_seventeen()
        )
        return view
    }
    fun loadfrag14(frag14:Fragment_fourteen){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag14,frag14)
        ft.commit()
    }
    fun loadfrag15(frag15:Fragment_fifteen){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag15,frag15)
        ft.commit()
    }
    fun loadfrag16(frag16:Fragment_sixteen){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag16,frag16)
        ft.commit()
    }
    fun loadfrag17(frag17:Fragment_seventeen){
        val ft =parentFragmentManager.beginTransaction()
        ft.replace(R.id.mainfrag17,frag17)
        ft.commit()
    }
}