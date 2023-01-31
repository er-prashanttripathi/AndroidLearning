package com.example.android.apicheck.model

data class Data(
    val categoryId: String,
    val category_ofproduct: Category,
    val createdAt: String,
    val description: String,
    val descriptionHindi: String,
    val priority: Int,
    val productId: String,
    val productImages_ofproduct: List<UploadedImage>,
    val productName: String,
    val productNameHindi: String,
    val updatedAt: String,
    val warehouseId: String
)