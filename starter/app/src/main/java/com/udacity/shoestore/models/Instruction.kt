package com.udacity.shoestore.models

import android.graphics.drawable.Drawable
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

data class Instruction(
        val id: Int,
        val name: String,
        val description: String,
        val drawable: Drawable
    )