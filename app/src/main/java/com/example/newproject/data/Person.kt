package com.example.newproject.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Person(
    var name: String,
    var motto: String,
    var phoneNumber: String,
    var img: String
) : Parcelable
