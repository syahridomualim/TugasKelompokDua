package com.example.newproject.data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class University(
    val name: String,
    val location: String,
    val description: String,
    val photos: String
) : Parcelable