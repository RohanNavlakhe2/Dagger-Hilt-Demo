package com.yog.daggerhiltdemo

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class NewFragment:Fragment(R.layout.activity_main) {
   private val viewModel:MainViewModel by viewModels()
}