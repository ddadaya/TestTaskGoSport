package com.vm.testtaskgosport.data.mapper

import com.vm.testtaskgosport.data.database.CategoryDbModel
import com.vm.testtaskgosport.data.database.MealDbModel
import com.vm.testtaskgosport.data.network.model.CategoryDto
import com.vm.testtaskgosport.data.network.model.MealDto
import com.vm.testtaskgosport.domain.Category
import com.vm.testtaskgosport.domain.Meal

class MealMapper {
    fun mapMealDtoToDbModel(dto: MealDto) = MealDbModel(
        strMeal = dto.strMeal,
        strMealThumb = dto.strMealThumb,
        strCategory = dto.strCategory,
        strIngredient1 = dto.strIngredient1,
        strIngredient2 = dto.strIngredient2,
        strIngredient3 = dto.strIngredient3,
        strIngredient4 = dto.strIngredient4,
        strIngredient5 = dto.strIngredient5,
        strIngredient6 = dto.strIngredient6,
        strIngredient7 = dto.strIngredient7,
        strIngredient8 = dto.strIngredient8,
        strIngredient9 = dto.strIngredient9,
        strIngredient10 = dto.strIngredient10,
        strIngredient11 = dto.strIngredient11,
        strIngredient12 = dto.strIngredient12,
        strIngredient13 = dto.strIngredient13,
        strIngredient14 = dto.strIngredient14,
        strIngredient15 = dto.strIngredient15,
        strIngredient16 = dto.strIngredient16,
        strIngredient17 = dto.strIngredient17,
        strIngredient18 = dto.strIngredient18,
        strIngredient19 = dto.strIngredient19,
        strIngredient20 = dto.strIngredient20
    )

    fun mapCategoryDtoToDbModel(dto:CategoryDto) = CategoryDbModel(
        idCategory = dto.idCategory,
        strCategory = dto.strCategory
    )

    fun mapMealDbModelToEntity(dbModel: MealDbModel) = Meal(
        strMeal = dbModel.strMeal,
        strMealThumb = dbModel.strMealThumb,
        strCategory = dbModel.strCategory,
        strIngredient1 = dbModel.strIngredient1,
        strIngredient2 = dbModel.strIngredient2,
        strIngredient3 = dbModel.strIngredient3,
        strIngredient4 = dbModel.strIngredient4,
        strIngredient5 = dbModel.strIngredient5,
        strIngredient6 = dbModel.strIngredient6,
        strIngredient7 = dbModel.strIngredient7,
        strIngredient8 = dbModel.strIngredient8,
        strIngredient9 = dbModel.strIngredient9,
        strIngredient10 = dbModel.strIngredient10,
        strIngredient11 = dbModel.strIngredient11,
        strIngredient12 = dbModel.strIngredient12,
        strIngredient13 = dbModel.strIngredient13,
        strIngredient14 = dbModel.strIngredient14,
        strIngredient15 = dbModel.strIngredient15,
        strIngredient16 = dbModel.strIngredient16,
        strIngredient17 = dbModel.strIngredient17,
        strIngredient18 = dbModel.strIngredient18,
        strIngredient19 = dbModel.strIngredient19,
        strIngredient20 = dbModel.strIngredient20
    )
    fun mapCategoryDbModelToEntity(dbModel: CategoryDbModel) = Category(
        idCategory = dbModel.idCategory,
        strCategory = dbModel.strCategory
    )
}