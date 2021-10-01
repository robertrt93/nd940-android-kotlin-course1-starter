package com.udacity.shoestore.models

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Instruction(
    val id: Int,
    val name: String,
    val description: String
    ) : Parcelable