package com.yog.daggerhiltdemo

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel


class MainViewModel @ViewModelInject constructor(val mainRepo: MainRepo):ViewModel() {
}