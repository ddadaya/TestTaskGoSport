package com.vm.testtaskgosport.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator

import com.vm.testtaskgosport.databinding.ActivityMainBinding
import com.vm.testtaskgosport.domain.Category
import com.vm.testtaskgosport.presentation.adapters.ViewPagerAdapter

class MainActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    private val viewModel by lazy {
        ViewModelProvider(this)[MealViewModel::class.java]
    }

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(binding.root)
        var abc = false
        viewModel.categoryList.observe(this){
            if(!abc){
                setupTabs(it)
                abc = true
            }
        }
    }

    private fun setupTabs(categories: List<Category>) {
        val adapter = ViewPagerAdapter(this, categories)
        binding.viewPager2.adapter = adapter
        TabLayoutMediator(binding.tabLayout, binding.viewPager2) { tab, position ->
            tab.text = categories[position].strCategory
        }.attach()
    }
}