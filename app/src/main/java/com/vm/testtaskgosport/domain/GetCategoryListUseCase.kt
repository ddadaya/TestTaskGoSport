package com.vm.testtaskgosport.domain

class GetCategoryListUseCase(private val repository: FoodRepository) {
    operator fun invoke() = repository.getCategoryList()
}