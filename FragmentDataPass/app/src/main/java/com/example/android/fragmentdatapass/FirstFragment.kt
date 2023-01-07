package com.example.android.fragmentdatapass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
/*        val button=view.findViewById<Button>(R.id.button1)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_dataFragment)
        }
        -------------------------------------------*/
        val view=inflater.inflate(R.layout.fragment_first, container, false)
        val btnNxtFrag:Button=view.findViewById(R.id.btnNavigation)
        btnNxtFrag.setOnClickListener {
            val editText:EditText=view.findViewById(R.id.etV1)
            val input=editText.text.toString()
            //we cannot transfer data using intents in fragment, so we use bundles in place of fragment
            val bundle=Bundle()
            bundle.putString("mydatakey",input)
            //want to transfer to second fragment
            findNavController().navigate(
                R.id.secondFragment,bundle            )
        }
        return view
    }
}