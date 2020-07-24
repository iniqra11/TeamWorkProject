package com.example.teamworks.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.teamworks.adapter.MyPagerAdapter
import com.example.teamworks.R
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val fragmentPagerAdapter =
            MyPagerAdapter(supportFragmentManager)
        viewPager.adapter = fragmentPagerAdapter
        tabLayout.setupWithViewPager(viewPager)
    }
}