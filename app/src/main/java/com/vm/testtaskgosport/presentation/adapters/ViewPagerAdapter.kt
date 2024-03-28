package com.vm.testtaskgosport.presentation.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.vm.testtaskgosport.domain.Category
import com.vm.testtaskgosport.presentation.TabsFragment

class ViewPagerAdapter(fa: FragmentActivity, private val categories: List<Category>) : FragmentStateAdapter(fa) {
    override fun getItemCount() = categories.size

    override fun createFragment(position: Int): Fragment {
        return TabsFragment.newInstance(categories[position].strCategory)
    }
}