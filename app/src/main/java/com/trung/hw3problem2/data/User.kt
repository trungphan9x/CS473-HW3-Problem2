package com.trung.hw3problem2.data

import java.io.Serializable

data class User (
    var firstname: String = "",
    var lastname: String = "",
    val username: String = "",
    var password: String =""

) : Serializable