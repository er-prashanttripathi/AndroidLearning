package com.example.android.apicheck.model

data class WareHouse(
    val cityId: String,
    val createdAt: String,
    val latitude: String,
    val longitude: String,
    val radius: Int,
    val updatedAt: String,
    val wareHouseName: String,
    val wareHouseStatus: Boolean,
    val warehouseId: String
)