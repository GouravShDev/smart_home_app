package com.gouravsh.smarthomeapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.compose.md_theme_light_onPrimary
import com.gouravsh.smarthomeapp.R


val lato = FontFamily(
    Font(R.font.lato_black, weight = FontWeight.Black),
    Font(R.font.lato_bold, weight = FontWeight.Bold),
    Font(R.font.lato_regular, weight = FontWeight.Normal)
)

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 48.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
        color = md_theme_light_onPrimary,
    ),
    displayMedium = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.SemiBold,
        fontSize = 38.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
        color = md_theme_light_onPrimary,
    ),
    displaySmall = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 34.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
        color = md_theme_light_onPrimary,
    ),
    headlineLarge = TextStyle(),
    headlineMedium = TextStyle(),
    headlineSmall = TextStyle(),
    titleLarge = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    titleMedium = TextStyle(),
    titleSmall = TextStyle(),
    bodyLarge = TextStyle(
        fontFamily = lato,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(),
    bodySmall = TextStyle(),
    labelLarge = TextStyle(),
    labelMedium = TextStyle(),
    labelSmall = TextStyle(),


    /* Other default text styles to override
    labelSmall = TextStyle(
    fontFamily = FontFamily.Default,
    fontWeight = FontWeight.Medium,
    fontSize = 11.sp,
    lineHeight = 16.sp,
    letterSpacing = 0.5.sp
    )
    */
)