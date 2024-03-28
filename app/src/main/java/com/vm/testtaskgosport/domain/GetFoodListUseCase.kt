package com.vm.testtaskgosport.domain

class GetFoodListUseCase (private val repository: FoodRepository) {
    operator fun invoke() = repository.getFoodList()
}