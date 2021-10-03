package com.trung.hw3problem2.data

import java.io.Serializable

data class ElectronicProduct (
    val title: String,
    val price: Double,
    val color: String,
    val image: String,
    val itemId: String,
    val desc: String
) : Serializable