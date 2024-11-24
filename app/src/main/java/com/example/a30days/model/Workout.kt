package com.example.a30days.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Workout(
    @StringRes val dayResId: Int,
    @StringRes val titleResId: Int,
    @StringRes val descriptionResId: Int,
    @DrawableRes val imageResId: Int
)