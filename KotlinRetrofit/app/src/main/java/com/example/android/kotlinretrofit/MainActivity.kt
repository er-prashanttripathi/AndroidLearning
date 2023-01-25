package com.example.android.kotlinretrofit


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.kotlinretrofit.databinding.ActivitytwoBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val Base_Url = "https://api.github.com/"

class MainActivity : AppCompatActivity() {
    //1------------dataBinding Implimentation start----------------
    private lateinit var binding:ActivitytwoBinding

    //------------dataBinding Implimentation till here----------------

    lateinit var myAdapter: MyAdapter
    lateinit var linearLayoutManager: LinearLayoutManager



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //2------------dataBinding Implimentation start----------------
//        setContentView(R.layout.activity_main) //can be removed ,since used databinding
        binding = DataBindingUtil.setContentView(this@MainActivity,R.layout.activitytwo)



        //------------dataBinding Implimentation till here----------------

//        var rec = findViewById<RecyclerView>(R.id.id_recyclerView_Users)
        binding.idrecyclerViewUsers.setHasFixedSize(true)
        linearLayoutManager = LinearLayoutManager(this)
        binding.idrecyclerViewUsers.layoutManager = linearLayoutManager

        getMyData()
    }

    private fun getMyData() {
        val retroBuilObj = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Base_Url)
            .build()
            .create(MyInterface::class.java)

        val retrofitData = retroBuilObj.getData()
        //pass callback of object in enque(), inside enque PREE [ctrl+shift+space] auto code will generate
        retrofitData.enqueue(object : Callback<List<MyDataItem>?> {

            override fun onResponse(
                call: Call<List<MyDataItem>?>,
                response: Response<List<MyDataItem>?>
            )
/*        just to show textview without Recyclerview
    {
                val myStringBuilder=StringBuilder()
                val responseBody=response.body()!! //!! used to make responsebody notNull
                for(myData in responseBody){
                    myStringBuilder.append(myData.avatar_url)
                    myStringBuilder.append(myData.events_url)
                    myStringBuilder.append(myData.followers_url)
                    myStringBuilder.append(myData.id)
                    myStringBuilder.append(myData.login)
                    myStringBuilder.append(myData.site_admin)
                    myStringBuilder.append(myData.type)
                    myStringBuilder.append(myData.url)
                    myStringBuilder.append("\n")
                }
                val r=findViewById<TextView>(R.id.txtData)
                r.text=myStringBuilder
            }*/

            {
//                val myStringBuilder = StringBuilder()
                val responseBody = response.body()!! //!! used to make responsebody notNull


                myAdapter = MyAdapter(baseContext, responseBody)
                myAdapter.notifyDataSetChanged()
//                var rec = findViewById<RecyclerView>(R.id.id_recyclerView_Users)
                binding.idrecyclerViewUsers.adapter = myAdapter


            }

            override fun onFailure(call: Call<List<MyDataItem>?>, t: Throwable) {
                Log.d("My_mainActivity", "onFailure: " + t.message)
            }
        })
    }
}