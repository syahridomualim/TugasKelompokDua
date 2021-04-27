package com.example.newproject.adapter

import com.example.newproject.data.University

interface OnItemCallback {
    fun onItemClicked(university: University)
}