package com.example.android.apicheck.model

data class productResponse(
    val message: String,
    val product: Product,
    val success: Boolean,
    val uploadedImages: List<UploadedImage>
)