package com.example.daggerhiltsample.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daggerhiltsample.presentation.MyViewModel
import com.example.daggerhiltsample.presentation.ui.theme.DaggerHiltSampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltSampleTheme {
                //val v: MyViewModel = hiltViewModel()
                val viewModel= hiltViewModel<MyViewModel>()
            }
        }
    }
}
