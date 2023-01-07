package com.example.android.lifecycleobserver

import android.content.ContentValues.TAG
import android.util.Log
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

class MyObserver:LifecycleObserver {
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun onCreate(){
        Log.d("Main", "onCreate: ObserverOfOnCreate")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun OnStart(){
        Log.d("Main", "OnStart: ObserverOfOnStart")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun OnResume(){
        Log.d("Main", "OnStart: ObserverOfOnResume")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun OnPause(){
        Log.d("Main", "OnStart: ObserverOfOnPause")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun OnStop(){
        Log.d("Main", "OnStart: ObserverOfOnStop")
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun OnDestroy(){
        Log.d("Main", "OnStart: ObserverOfOnDestroy")
    }

}