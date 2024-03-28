package com.vm.testtaskgosport.presentation.adapters

import androidx.recyclerview.widget.DiffUtil
import com.vm.testtaskgosport.domain.Meal

object MealItemDiffCallback: DiffUtil.ItemCallback<Meal>() {
    override fun areItemsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Meal, newItem: Meal): Boolean {
        return oldItem.strMealThumb == newItem.strMealThumb
    }
}