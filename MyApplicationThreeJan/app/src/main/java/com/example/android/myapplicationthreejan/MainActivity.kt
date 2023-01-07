package com.example.android.myapplicationthreejan

import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
//    private var employeeArrayList = ArrayList<Employee>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val b1 = findViewById<Button>(R.id.btnnew)
    val btncall=findViewById<Button>(R.id.btnCallActivity)
    val btndata=findViewById<Button>(R.id.btnDataPassActivity)
    btncall.setOnClickListener {
        val intent = Intent(this@MainActivity, CallingValidationRegEx::class.java)
        startActivity(intent)
    }
    btndata.setOnClickListener {
        val intent = Intent(this@MainActivity, EditScrollDataPass::class.java)
        startActivity(intent)
    }
/*        val b3 = findViewById<Button>(R.id.btnobject)
        b3.setOnClickListener {
            addEmployee()
            val intent = Intent(this@MainActivity, MainActivity3::class.java).also {
                it.putExtra("var_objdata", employeeArrayList)
                startActivity(it)
            }
        }*/
        b1.setOnClickListener {
            passActivity()
//            startActivity(Intent(this, MainActivity2::class.java))
        }
        /*    btnnew.setOnClickListener {
                passActivity()
                startActivity(Intent(this,R.layout.activity_main2::class.java))
            }*/
        val b2 = findViewById<Button>(R.id.btnUrl)
        b2.setOnClickListener {
            val intentUrl = Intent(Intent.ACTION_VIEW, Uri.parse("https://getbootstrap.com/"))
            startActivity(intentUrl)
        }
 /*       //to call a specific No
        val btncallvar=findViewById<Button>(R.id.btncall)
        btncallvar.setOnClickListener {
            val intentvar=Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9956101951"))
            startActivity(intentvar)
//       To Call Any No Entered
        val etPhoneNovar = findViewById<EditText>(R.id.etPhoneNo)
//        etPhoneNovar.addTextChangedListener(object :TextWatcher{
//            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//
//            }
//
//            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
//
//            }
//
//            override fun afterTextChanged(p0: Editable?) {
//                if (mobileValidate(etPhoneNo.text.toString()))
//                    Toast.makeText(this@MainActivity,"Validated",Toast.LENGTH_SHORT).show()
//                else
//                    etPhoneNo.setError("Number must start with 6,7,8 or 9")
//
//            }
//
//        })
        // etPhoneNovar.filters= arrayOf<InputFilter>(LengthFilter(10))// code to set max character length



        val phoneNo = etPhoneNovar.text
        val btncallvar = findViewById<Button>(R.id.btncall)
        checkPermission()//to take user permission to Make call
        btncallvar.setOnClickListener {
            if (etPhoneNovar.text.toString()
                    .isNotEmpty() && etPhoneNovar.text.toString().length == 10
            ) {
                //Toast.makeText(this,"Validated",Toast.LENGTH_SHORT).show()
                val validate = mobileValidate(etPhoneNo.text.toString())
                if (validate) {
                    val intentvar = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNo))
                    startActivity(intentvar)
                    Toast.makeText(this@MainActivity, "Validated", Toast.LENGTH_SHORT).show()
                } else {
                    etPhoneNo.error = "Number must start with 6,7,8 or 9"
                }


            } else {
                etPhoneNovar.error = "Please Enter Phone No"
                return@setOnClickListener
            }

        }

    }

    //mobi9le no start with 6,7,8 9 only logic
    private fun mobileValidate(text: String?): Boolean {
        var p = Pattern.compile("[6-9][0-9]{9}")
        var m = p.matcher(text)
        return m.matches()
*/
    }
/*
    private fun checkPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 101)
        }
    }*/
    private fun passActivity() {
        val edtTxtvar = findViewById<EditText>(R.id.edtTxt)
        val myIntent = Intent(this, MainActivity2::class.java).also {
            it.putExtra("var_passdata", edtTxtvar.text.toString())
            startActivity(it)
        }
    }
  /*  private fun addEmployee() {
        val v1 = findViewById<EditText>(R.id.etV1)
        val v2 = findViewById<EditText>(R.id.etV2)
        val v3 = findViewById<EditText>(R.id.etV3)
        val v4 = findViewById<EditText>(R.id.etV4)
        val v5 = findViewById<EditText>(R.id.etV5)
        val v6 = findViewById<EditText>(R.id.etV6)
        val v7 = findViewById<EditText>(R.id.etV7)
        val v8 = findViewById<EditText>(R.id.etV8)
        val v9 = findViewById<EditText>(R.id.etV9)
        val v10 = findViewById<EditText>(R.id.etV10)

        employeeArrayList.add(
            Employee(
                v1.text.toString(),
                v2.text.toString(),
                v3.text.toString(),
                v4.text.toString(),
                v5.text.toString(),
                v6.text.toString(),
                v7.text.toString(),
                v8.text.toString(),
                v9.text.toString(),
                v10.text.toString()
            )
                Employee(
                    "Mr.X",
                    "Z",
                    "Mr.Z",
                    "Mrs. M",
                    "Mrs S",
                    "N-Delhi",
                    "Delhi",
                    9999999999,
                    "111122223333",
                    "221211"
                )
        )
        employeeArrayList.add(
            Employee(
                "Mr.X1",
                "Z1",
                "Mr.Z1",
                "Mrs. M1",
                "Mrs S1",
                "Lko",
                "U.P",
                2222222222,
                "000000000000",
                "090987"
            )
        )
    }*/
}
