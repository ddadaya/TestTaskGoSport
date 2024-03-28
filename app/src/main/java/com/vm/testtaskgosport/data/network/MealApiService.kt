package com.vm.testtaskgosport.data.network

import com.vm.testtaskgosport.data.network.model.CategoriesJsonContainer
import com.vm.testtaskgosport.data.network.model.MealJsonContainer
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
//https://themealdb.com/api/json/v1/1/search.php?s=
interface MealApiService {
    @GET("search.php?s=")
    suspend fun getMeals(): MealJsonContainer

    @GET("categories.php")
    suspend fun getCategories(): CategoriesJsonContainer
}