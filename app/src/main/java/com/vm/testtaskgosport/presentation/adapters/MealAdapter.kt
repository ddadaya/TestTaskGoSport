package com.vm.testtaskgosport.presentation.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.squareup.picasso.Picasso
import com.vm.testtaskgosport.databinding.MealItemBinding
import com.vm.testtaskgosport.domain.Meal

class MealAdapter: ListAdapter<Meal, MealViewHolder>(MealItemDiffCallback) {
    override fun onCreateViewHolder(parent : ViewGroup, viewType : Int) : MealViewHolder {
        val binding = MealItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return MealViewHolder(binding)
    }

    override fun onBindViewHolder(holder : MealViewHolder, position : Int) {
        val item = getItem(position)
        with(holder.binding){
            mealTv.text = item.strMeal
            ingredientsTv.text = item.formatIngredients()
            Picasso.get()
                .load(item.strMealThumb)
                .into(mealIv)
        }
    }
}