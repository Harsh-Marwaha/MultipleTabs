package com.example.multipletabs.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.multipletabs.R
import com.example.multipletabs.adapters.ViewPagerAdapter
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        var tabLayout : TabLayout
        var viewPager : ViewPager

        tabLayout=findViewById(R.id.tabLayout)
        viewPager=findViewById(R.id.viewPager)

        var adapter : ViewPagerAdapter

        adapter= ViewPagerAdapter(supportFragmentManager)

        viewPager.adapter = adapter

        tabLayout.setupWithViewPager(viewPager)
    }
}