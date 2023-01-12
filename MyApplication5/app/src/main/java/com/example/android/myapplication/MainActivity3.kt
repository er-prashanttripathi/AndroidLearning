package com.example.android.myapplication

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.coroutines.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        CoroutineScope(Dispatchers.IO).launch {
            printFollowers()
        }
    }

/*//    -------------using job & launch--------------
    private suspend fun printFollowers() {
        var fbFollower=0
    var instaFollowers=0
      val job=  CoroutineScope(Dispatchers.IO).launch {
            fbFollower= getFbFollower()
        }
    val job2=  CoroutineScope(Dispatchers.IO).launch {
        instaFollowers= getInstaFollower()
    }
        job.join()// further program/logic/function will work only after execution of this
    job2.join()// comment these two join lines to check default flow
        Log.d(TAG,"fb followers: $fbFollower, Insta followers: $instaFollowers")
    }*/

/*-----async logic------------------
    private suspend fun printFollowers() {
        val job=  CoroutineScope(Dispatchers.IO).async {
            getFbFollower()
        }
        Log.d(TAG,"async value is:"+ job.await().toString())//async.await() to get data/output
    }*/
/*private suspend fun printFollowers() {
    val job=  CoroutineScope(Dispatchers.IO).async{
        getFbFollower()
    }
    val job2=  CoroutineScope(Dispatchers.IO).async{
        getInstaFollower()
    }
    job.join()// further program/logic/function will work only after execution of this
    job2.join()// comment these two join lines to check default flow
    Log.d(TAG,"fb followers="+ job.await().toString()+" Insta Followers: "+job.await().toString())
}*/
private suspend fun printFollowers() {
    val job=  CoroutineScope(Dispatchers.IO).launch {
    var fbval=async { getFbFollower() }
        var instaval=async { getInstaFollower() }
        Log.d(TAG, "fb-${fbval.await()} insta- ${instaval.await()}")
        Log.d(TAG, "fb-$fbval.a insta- $instaval") // to check for deferred in log

    }
}
    private suspend fun getFbFollower(): Int {
delay(1000)
        return  55
    }
    private suspend fun getInstaFollower(): Int {
        delay(1000)
        return  333
    }
}