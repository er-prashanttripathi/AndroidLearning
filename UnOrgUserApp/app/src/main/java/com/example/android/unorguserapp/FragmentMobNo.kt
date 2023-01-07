package com.example.android.unorguserapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import com.example.android.unorguserapp.databinding.FragmentMobnoBinding
import com.example.android.unorguserapp.databinding.FragmentProductDescriptionBinding

class FragmentMobNo : Fragment() {

    //view binding
    private var _binding: FragmentMobnoBinding?=null
    private val binding get() = _binding!!//to make binding variable null safe
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //view binding
        _binding=FragmentMobnoBinding.inflate(inflater,container, false)
        binding.btnSubmitRegister.setOnClickListener {
           /* -----------without view binding begins----------------
//            findNavController().navigate(R.id.action_page3_to_page6)
//        // Inflate the layout for this fragment
//        val view= inflater.inflate(R.layout.fragment_mobno, container, false)
//        val button=view.findViewById<Button>(R.id.btn_submit_register)
//        button.setOnClickListener {
            -----------without view binding endss----------------*/
            findNavController().navigate(R.id.action_page3_to_page6)
        }

//        return view
        return binding.root
    }

}


//------------------------------------------------------
//class page3 : Fragment() {
//
//    override fun onCreateView(
////        inflater: LayoutInflater, container: ViewGroup?,
////        savedInstanceState: Bundle?
////    ): View? {
////        // Inflate the layout for this fragment
////        return inflater.inflate(R.layout.page3, container, false)
////    }
////-------------------------------
//
//    inflater: LayoutInflater,
//    container: ViewGroup?,
//    savedInstanceState: Bundle?
//    ): View? { val view=inflater.inflate(R.layout.page3,container,false)
//
//        return view
//    }
//}