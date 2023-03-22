package com.example.android1homework6practice.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.android1homework6practice.R
import com.example.android1homework6practice.ui.Fragments.CatFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fragmentManager = supportFragmentManager

        fragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view, CatFragment())
            .commit()
    }
}