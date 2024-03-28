package com.vm.testtaskgosport.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MealDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCategories(categories: List<CategoryDbModel>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertMeals(meals: List<MealDbModel>)

    @Query("SELECT * FROM CategoryDbModel ")
    fun getCategoriesDb(): LiveData<List<CategoryDbModel>>

    @Query("SELECT * FROM MealDbModel ")
    fun getMealsDb(): LiveData<List<MealDbModel>>
}