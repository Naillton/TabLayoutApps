package com.example.tablayoutapps.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.tablayoutapps.fragments.BookFragment
import com.example.tablayoutapps.fragments.GameFragment
import com.example.tablayoutapps.fragments.MovieFragment

// Criando um adaptador passando o gerenciador de fragmentos e o lifecycle
class ViewPageAdapter(
    fragmentManager: FragmentManager,
    lifecycle: Lifecycle): FragmentStateAdapter(fragmentManager, lifecycle) {
        private val fragmentSize: Int = 3
    override fun getItemCount(): Int {
        return this.fragmentSize
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return MovieFragment()
            1 -> return BookFragment()
            2 -> return GameFragment()
        }
        return Fragment()
    }
}