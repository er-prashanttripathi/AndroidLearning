package com.example.android.unorguserapp

import android.graphics.Paint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.load.resource.bitmap.CircleCrop
import com.example.android.unorguserapp.databinding.FragmentProductDescriptionBinding
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_product_description.*

class FragmentProductDescription : Fragment() {
    val weightKg= arrayOf("Select weight","1 kg","2 kg","5 kg","10 kg","25 kg")// spinner kg values
    val costPerKg= arrayOf("₹0.0","₹100","₹200","₹500","₹1000","₹2500")// spinner cost values
    val oldCostPerKg= arrayOf("₹0.0","₹200","₹500","₹1000","₹2500","₹5000")// spinner cost values

    //view binding
    private var _binding: FragmentProductDescriptionBinding?=null
    private val binding get() = _binding!!//to make binding variable null safe


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_product_description, container, false)
        val imageViewSmall=view.findViewById<ImageView>(R.id.img_small)
        val imageViewZoom=view.findViewById<ImageView>(R.id.img_zoom)
        val spinnerKg=view.findViewById<Spinner>(R.id.spinner_Kg)
        val stxtCostUpdate=view.findViewById<TextView>(R.id.txt_cost)

//Strikethrough text logic
        val txtStrikePrice=view.findViewById<TextView>(R.id.txt_strike_price)
        txtStrikePrice.setPaintFlags(Paint.STRIKE_THRU_TEXT_FLAG);

//        weightKg[0]="Select weight"// value added to be shown for default spinner value
        val arrayAdapter= ArrayAdapter<String>(requireContext(),android.R.layout.simple_spinner_dropdown_item,weightKg)
        spinnerKg.adapter=arrayAdapter
        spinnerKg.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                if (weightKg[position]!=weightKg[0])//to stop toast on fragment launch in which spinner is implimented
                {
                Toast.makeText(requireContext(),"Selected Wt is: "+weightKg[position],Toast.LENGTH_LONG).show()
//                    stxtCostUpdate.text=weightKg[position].toString()
                    stxtCostUpdate.text=costPerKg[position].toString()
                    txtStrikePrice.text=oldCostPerKg[position].toString()
            }}

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

        }
        Glide.with(requireContext())
//            .load("https://picsum.photos/200")
            .load("https://www.bigbasket.com/media/uploads/p/l/40236230_3-aashirvaad-atta-with-multigrains-high-fibre-soft-rotis.jpg")
            .fitCenter()
//            .centerCrop()
            .skipMemoryCache(true)
//            .circleCrop()
            .transform(CircleCrop())
            .override(400,400)
//            .transform(RoundedCorners(30,10)) ######ISSUES
//            .transform(BlurTransformation())   #######ISSUES
            .diskCacheStrategy(DiskCacheStrategy.NONE)
            .placeholder(R.drawable.product)
            .into(imageViewSmall)
        Picasso.get().load("https://www.bigbasket.com/media/uploads/p/l/40236230_3-aashirvaad-atta-with-multigrains-high-fibre-soft-rotis.jpg").placeholder(R.drawable.product)
            .error(R.drawable.product)
            .into(imageViewZoom)


        return view
    }

}

