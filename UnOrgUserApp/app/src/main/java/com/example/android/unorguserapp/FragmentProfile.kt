package com.example.android.unorguserapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.fragment.findNavController

class FragmentProfile : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_profile, container, false)
        val button=view.findViewById<TextView>(R.id.about_us_txt)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_page14_to_product_description)
        }

        return view
    }

}