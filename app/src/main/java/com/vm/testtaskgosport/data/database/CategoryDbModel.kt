package com.vm.testtaskgosport.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity
data class CategoryDbModel(
    @PrimaryKey
    @SerializedName("idCategory")
    @Expose
    val idCategory: String,

    @SerializedName("strCategory")
    @Expose
    val strCategory: String
)