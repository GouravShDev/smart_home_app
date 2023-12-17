package com.gouravsh.smarthomeapp.ui.common

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun PrimaryButton(
    text: String,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: TextStyle = MaterialTheme.typography.displayMedium,
    onClick: () -> Unit,
) {
    Box(
        modifier = Modifier.run {
            defaultMinSize(200.dp)
                .clip(MaterialTheme.shapes.medium)
                .background(MaterialTheme.colorScheme.primary)
                .clickable(onClick = onClick)
        }
    ) {
        Text(
            text = text,
            color = textColor,
            style = textStyle,
            modifier = Modifier
                .padding(all = 16.dp)
                .align(Alignment.Center)
        )
    }
}