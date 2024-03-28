package com.vm.testtaskgosport.domain

import androidx.lifecycle.LiveData

interface FoodRepository {
    fun getFoodList(): LiveData<List<Meal>>
    fun getCategoryList(): LiveData<List<Category>>

    suspend fun loadData()
}