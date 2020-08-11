package com.yog.daggerhiltdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var student: Student

    @Inject
    lateinit var mainRepo: MainRepo



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        student.rollNo=10
        student.name="rr"

        Log.d(TAG, "Roll No: ${student.rollNo} Name: ${student.name} util:${student.utility.fun1()}")

        mainRepo.f2()


    }

    companion object
    {
        private const val TAG="MainActivity"
    }
}