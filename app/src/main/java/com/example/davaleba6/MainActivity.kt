package com.example.davaleba6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.viewpager2.widget.ViewPager2
import com.example.davaleba6.adapters.ViewPagerFragmentAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager2
    private lateinit var tabLayout: TabLayout
    private lateinit var adapter: ViewPagerFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()

        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager){ tab, position ->
            tab.text = "tab " + (position + 1)

        }.attach()

    }

    fun init() {

        viewPager = findViewById(R.id.viewPager)
        tabLayout = findViewById(R.id.tabLayout)
        adapter = ViewPagerFragmentAdapter(this)

    }
}