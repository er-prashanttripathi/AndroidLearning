package com.example.android.fragmentdatapass

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_second, container, false)
        val textView:TextView=view.findViewById(R.id.textView)
        //fetch data
        val args=this.arguments
        val inputData=args?.get("mydatakey")
        textView.text=inputData.toString()
        return view
    }
}
