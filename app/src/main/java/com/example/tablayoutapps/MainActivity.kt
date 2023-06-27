package com.example.tablayoutapps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutapps.adapter.ViewPageAdapter
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val arrayTabs: Array<String> = arrayOf("Movie", "Book", "Game")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val viewPager = findViewById<ViewPager2>(R.id.vp2)
        val tabsLayout = findViewById<TabLayout>(R.id.tabLayout)

        val adapter = ViewPageAdapter(
            supportFragmentManager,
            lifecycle,
        )

        viewPager.adapter = adapter

        // criando conexao entre a viewpager e o nosso tablayout
        TabLayoutMediator(tabsLayout, viewPager) {
            // aqui definimos que o nosso tablayout vai ser definido pelo valor do array
            tab, position -> tab.text = arrayTabs[position]
        }.attach()
    }
}