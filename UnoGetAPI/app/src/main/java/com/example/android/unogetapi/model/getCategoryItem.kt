package com.example.android.unogetapi.model

data class getCategoryItem(
    val categoryId: String,
    val categoryName: String,
    val categoryNameHindi: String,
    val createdAt: String,
    val imgUrl: String,
    val priority: Int,
    val updatedAt: String
)