package com.example.a30days.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.text.googlefonts.Font
import com.example.a30days.R

val googleFontProvider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs
)

val RobotoFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Roboto"),
        fontProvider = googleFontProvider
    )
)

val NeutonFontFamily = FontFamily(
    Font(
        googleFont = GoogleFont("Neuton"),
        fontProvider = googleFontProvider
    )
)

val DefaultTypography = Typography()


val AppTypography = Typography(
    displayLarge = DefaultTypography.displayLarge.copy(fontFamily = NeutonFontFamily),
    displayMedium = DefaultTypography.displayMedium.copy(fontFamily = NeutonFontFamily),
    displaySmall = DefaultTypography.displaySmall.copy(fontFamily = NeutonFontFamily),

    headlineLarge = DefaultTypography.headlineLarge.copy(fontFamily = NeutonFontFamily),
    headlineMedium = DefaultTypography.headlineMedium.copy(fontFamily = NeutonFontFamily),
    headlineSmall = DefaultTypography.headlineSmall.copy(fontFamily = NeutonFontFamily),

    titleLarge = DefaultTypography.titleLarge.copy(fontFamily = NeutonFontFamily),
    titleMedium = DefaultTypography.titleMedium.copy(fontFamily = NeutonFontFamily),
    titleSmall = DefaultTypography.titleSmall.copy(fontFamily = NeutonFontFamily),

    bodyLarge = DefaultTypography.bodyLarge.copy(fontFamily = RobotoFontFamily),
    bodyMedium = DefaultTypography.bodyMedium.copy(fontFamily = RobotoFontFamily),
    bodySmall = DefaultTypography.bodySmall.copy(fontFamily = RobotoFontFamily),

    labelLarge = DefaultTypography.labelLarge.copy(fontFamily = RobotoFontFamily),
    labelMedium = DefaultTypography.labelMedium.copy(fontFamily = RobotoFontFamily),
    labelSmall = DefaultTypography.labelSmall.copy(fontFamily = RobotoFontFamily)
)

