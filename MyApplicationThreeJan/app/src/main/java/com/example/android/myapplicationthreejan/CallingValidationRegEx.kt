package com.example.android.myapplicationthreejan
import android.Manifest
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.app.ActivityCompat
import kotlinx.android.synthetic.main.activity_calling_validation_reg_ex.*
import kotlinx.android.synthetic.main.activity_main.*
import java.util.regex.Pattern
class CallingValidationRegEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calling_validation_reg_ex)
        /*        //to call a specific No
        val btncallvar=findViewById<Button>(R.id.btncall)
        btncallvar.setOnClickListener {
            val intentvar=Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+"9956101951"))
            startActivity(intentvar)*/
//       To Call Any No Entered
        val etPhoneNovar = findViewById<EditText>(R.id.etPhoneNonew)
 /*       etPhoneNovar.addTextChangedListener(object :TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun afterTextChanged(p0: Editable?) {
                if (mobileValidate(etPhoneNo.text.toString()))
                    Toast.makeText(this@MainActivity,"Validated",Toast.LENGTH_SHORT).show()
                else
                    etPhoneNo.setError("Number must start with 6,7,8 or 9")

            }

        })
         etPhoneNovar.filters= arrayOf<InputFilter>(LengthFilter(10))// code to set max character length
*/
        val phoneNo = etPhoneNovar.text
        val btncallvar = findViewById<Button>(R.id.btncallnew)
        checkPermission()//to take user permission to Make call
        btncallvar.setOnClickListener {
            if (etPhoneNovar.text.toString()
                    .isNotEmpty() && etPhoneNovar.text.toString().length == 10
            ) {
                //Toast.makeText(this,"Validated",Toast.LENGTH_SHORT).show()
                val validate = mobileValidate(etPhoneNonew.text.toString())
                if (validate) {
                    val intentvar = Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + phoneNo))
                    startActivity(intentvar)
                    Toast.makeText(this@CallingValidationRegEx, "Validated", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    etPhoneNonew.error = "Number must start with 6,7,8 or 9"
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

    }
    private fun checkPermission() {
        if (ActivityCompat.checkSelfPermission(
                this,
                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.CALL_PHONE), 101)
        }
    }
}
