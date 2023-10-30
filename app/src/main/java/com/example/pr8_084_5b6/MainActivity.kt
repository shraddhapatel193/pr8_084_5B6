package com.example.pr8_084_5b6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pr8_084_5b6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}