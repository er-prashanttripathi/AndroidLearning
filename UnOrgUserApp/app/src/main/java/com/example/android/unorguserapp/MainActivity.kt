package com.example.android.unorguserapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableString
import android.text.Spanned
import android.widget.TextView
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import android.text.style.StrikethroughSpan
import android.text.style.StyleSpan
import android.text.style.UnderlineSpan
import android.util.Log
import kotlinx.android.synthetic.main.fragment_product_description.*


class MainActivity : AppCompatActivity() {




        private lateinit var navController: NavController
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)




            val navHostFragment=supportFragmentManager
                .findFragmentById(R.id.fragmentContainerView) as NavHostFragment
//   Code to impliment back button (POP Stack button)
            navController = navHostFragment.navController


//            setupActionBarWithNavController(navController)
        }

        override fun onSupportNavigateUp(): Boolean {
            return navController.navigateUp()||super.onSupportNavigateUp()
        }
    }

//-----------------------------------
//class MainActivity : AppCompatActivity() {
//    private lateinit var binding: ActivityMainBinding
//        override fun onCreate(savedInstanceState: Bundle?) {
//            super.onCreate(savedInstanceState)
//            setContentView(R.layout.activity_main)
//            val btn3: Button =findViewById(R.id.btnfragment3)
//            val btn6: Button =findViewById(R.id.btnfragment6)
//            val btn14: Button =findViewById(R.id.btnfragment14)
//            val btn15: Button =findViewById(R.id.btnfragment15)
//
//
//            btn3.setOnClickListener{
//                loadfrag1(
//                    page3()
//                )
//            }
//            btn6.setOnClickListener {
//                loadfrag2(
//                    Page6()
//                )
//            }
//            btn14.setOnClickListener{
//                loadfrag3(
//                    page14()
//                )
//            }
//            btn15.setOnClickListener{
//                loadfrag4(
//                    page15()
//                )
//            }
//        }
//        fun loadfrag1(frag1:page3){
//            val ft =supportFragmentManager.beginTransaction()
//            ft.replace(R.id.fragmentcontainer,frag1)
//            ft.commit()
//        }
//
//fun loadfrag2(frag2:Page6){
//    val ft =supportFragmentManager.beginTransaction()
//    ft.replace(R.id.fragmentcontainer,frag2)
//    ft.commit()
//}
//            fun loadfrag3(frag3:page14){
//            val ft =supportFragmentManager.beginTransaction()
//            ft.replace(R.id.fragmentcontainer,frag3)
//            ft.commit()
//        }
//        fun loadfrag4(frag4:page15){
//            val ft =supportFragmentManager.beginTransaction()
//            ft.replace(R.id.fragmentcontainer,frag4)
//            ft.commit()
//        }
//
//
//    }