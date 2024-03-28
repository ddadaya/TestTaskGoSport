package com.vm.testtaskgosport.data.network.model

import com.google.gson.annotations.SerializedName

data class CategoriesJsonContainer(
    @SerializedName("categories")
    val categories: List<CategoryDto>
)