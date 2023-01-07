package com.example.android.myapplicationthreejan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EditScrollDataPass : AppCompatActivity() {
    private var employeeArrayList = ArrayList<Employee>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_scroll_data_pass)
        val b3 = findViewById<Button>(R.id.btnobject)



        b3.setOnClickListener {
            addEmployee()
            val intent = Intent(this@EditScrollDataPass, MainActivity3::class.java).also {
                it.putExtra("var_objdata", employeeArrayList)
                startActivity(it)
            }

        }
    }

    private fun addEmployee() {
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
            /*    Employee(
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
                )*/
        )
/*        employeeArrayList.add(
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
        )*/
    }
}

