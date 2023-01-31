package com.example.android.apicheck.model

data class UploadedImage(
    val createdAt: String,
    val id: Int,
    val imgUrl: String,
    val productId: String,
    val updatedAt: String
)