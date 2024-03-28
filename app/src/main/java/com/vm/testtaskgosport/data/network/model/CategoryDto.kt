package com.vm.testtaskgosport.data.network.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CategoryDto(
    @SerializedName("idCategory")
    @Expose
    val idCategory: String,

    @SerializedName("strCategory")
    @Expose
    val strCategory: String
)