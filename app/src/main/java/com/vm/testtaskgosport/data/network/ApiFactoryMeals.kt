package com.vm.testtaskgosport.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactoryMeals {
    private const val BASE_URL = "https://themealdb.com/api/json/v1/1/"
    private val retrofit = Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .baseUrl(BASE_URL)
        .build()
    val mealApiService : MealApiService = retrofit.create(MealApiService::class.java)
}