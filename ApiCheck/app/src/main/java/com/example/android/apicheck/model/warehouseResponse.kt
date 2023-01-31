package com.example.android.apicheck.model

data class warehouseResponse(
    val `data`: List<WareHouse>,
    val message: String,
    val success: Boolean
)