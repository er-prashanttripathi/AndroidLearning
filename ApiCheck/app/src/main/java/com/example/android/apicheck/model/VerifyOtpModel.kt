package com.example.android.apicheck.model

data class VerifyOtpModel(
    val access_token: String,
    val expiry: Int,
    val getName: Boolean,
    val message: String,
    val success: Boolean
)