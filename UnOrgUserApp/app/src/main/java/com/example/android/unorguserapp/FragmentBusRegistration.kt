package com.example.android.unorguserapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.android.unorguserapp.databinding.FragmentBusRegistrationBinding

class FragmentBusRegistration : Fragment() {

    lateinit var _binding: FragmentBusRegistrationBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding=FragmentBusRegistrationBinding.inflate(inflater,container, false)
        // Inflate the layout for this fragment
//        val view= inflater.inflate(R.layout.fragment_bus_registration, container, false)
//        val button=view.findViewById<Button>(R.id.btn_shop_name)

        _binding.apply { btnShopName.setOnClickListener {
            findNavController().navigate(R.id.action_page15_to_page14)
        } }

        return _binding.root
    }

}