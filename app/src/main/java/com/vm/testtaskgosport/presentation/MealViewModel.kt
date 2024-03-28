package com.vm.testtaskgosport.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.vm.testtaskgosport.data.database.AppDatabase
import com.vm.testtaskgosport.data.repository.FoodRepositoryImpl
import com.vm.testtaskgosport.domain.GetCategoryListUseCase
import com.vm.testtaskgosport.domain.GetFoodListUseCase
import com.vm.testtaskgosport.domain.LoadDataUseCase
import kotlinx.coroutines.launch

class MealViewModel(application : Application): AndroidViewModel(application) {
    private val repository = FoodRepositoryImpl(application)
    private val getCategoryListUseCase = GetCategoryListUseCase(repository)
    private val getMealListUseCase = GetFoodListUseCase(repository)
    private val loadDataUseCate = LoadDataUseCase(repository)

    val mealList = getMealListUseCase()
    val categoryList = getCategoryListUseCase()

    init{
        viewModelScope.launch{
            loadDataUseCate()
        }
    }
}