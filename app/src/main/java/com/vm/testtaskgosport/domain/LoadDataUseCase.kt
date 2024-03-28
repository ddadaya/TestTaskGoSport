package com.vm.testtaskgosport.domain

class LoadDataUseCase(private val repository : FoodRepository) {
    suspend operator fun invoke() = repository.loadData()
}