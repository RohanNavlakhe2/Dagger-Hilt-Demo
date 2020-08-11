package com.yog.daggerhiltdemo

import android.util.Log
import javax.inject.Inject

class MainRepo @Inject constructor(private val utility: Utility) {

    fun f2()
    {
        Log.d(TAG,"Main Repo ${utility.fun1()}")
    }

    companion object
    {
        const val TAG="MainRepo"
    }
}