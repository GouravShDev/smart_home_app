package com.gouravsh.smarthomeapp.models

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class DashboardItem @OptIn(ExperimentalFoundationApi::class) constructor(
    val title: String,
    val onTap: () -> Unit,
    val trailingIcon: @Composable () -> Unit = {

        Icon(
            imageVector = Icons.Filled.KeyboardArrowRight,
            contentDescription = null,
            Modifier
                .size(40.dp)
                .combinedClickable(
                    onClick = onTap
                ),
            tint = MaterialTheme.colorScheme.primary
        )

    }


)