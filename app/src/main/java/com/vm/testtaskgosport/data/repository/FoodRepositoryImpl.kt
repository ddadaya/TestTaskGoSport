package com.vm.testtaskgosport.data.repository

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.map
import com.vm.testtaskgosport.data.database.AppDatabase
import com.vm.testtaskgosport.data.mapper.MealMapper
import com.vm.testtaskgosport.domain.Meal
import com.vm.testtaskgosport.domain.FoodRepository
import com.vm.testtaskgosport.data.network.ApiFactoryMeals
import com.vm.testtaskgosport.domain.Category

class FoodRepositoryImpl(application: Application): FoodRepository {
    private val mealDao = AppDatabase.getInstance(application).mealDao()
    private val apiService = ApiFactoryMeals.mealApiService
    private val mapper = MealMapper()

    override fun getFoodList() : LiveData<List<Meal>> {
        return (mealDao.getMealsDb()).map { it ->
            it.map {
                mapper.mapMealDbModelToEntity(it)
            }
        }
    }

    override fun getCategoryList() : LiveData<List<Category>> {
        return (mealDao.getCategoriesDb()).map { it ->
            it.map {
                mapper.mapCategoryDbModelToEntity(it)
            }
        }
    }

    override suspend fun loadData() {
        try {
            val meals = apiService.getMeals()
            val categories = apiService.getCategories()
            val mealDbModelList = meals.meals.map { mapper.mapMealDtoToDbModel(it) }
            val categoryDbModelList = categories.categories.map { mapper.mapCategoryDtoToDbModel(it) }
            mealDao.insertMeals(mealDbModelList)
            mealDao.insertCategories(categoryDbModelList)
        } catch (_ : Exception) {
        }
    }
}