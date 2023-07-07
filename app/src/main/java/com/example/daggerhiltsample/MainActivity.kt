package com.example.daggerhiltsample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.daggerhiltsample.presentation.MyViewModel
import com.example.daggerhiltsample.ui.theme.DaggerHiltSampleTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DaggerHiltSampleTheme {
                val viewModel= hiltViewModel<MyViewModel>()
            }
        }
    }
}
