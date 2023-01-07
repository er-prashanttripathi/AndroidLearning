package com.example.android.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton:Button=findViewById(R.id.roll_button)
//        rollButton.text="Lets Roll Dude"
//        rollButton.setOnClickListener {
//            Toast.makeText(this,"Hello Sangam Sir",Toast.LENGTH_LONG).show()
//        }
        rollButton.setOnClickListener {
            rollDice()
        }
        diceImage=findViewById(R.id.diceimg)

    }

    private fun rollDice() {
//        val resultText1:TextView=findViewById(R.id.result_text)
        val myVal1=Random.nextInt(6)+1
        val imgvariable=when(myVal1){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }
//        val diceImage:ImageView=findViewById(R.id.diceimg)
        diceImage.setImageResource(imgvariable)

//        resultText1.text="Dice Rolled"
//        resultText1.text=myVal1.toString()
//        Toast.makeText(this,myVal1,Toast.LENGTH_LONG).show()
    }
}