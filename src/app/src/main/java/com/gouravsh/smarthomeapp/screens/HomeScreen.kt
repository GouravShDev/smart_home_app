package com.gouravsh.smarthomeapp.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.twotone.Home
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun HomeScreen() {
    Scaffold(
        containerColor = MaterialTheme.colorScheme.surface
    ) {
        Box(
            Modifier
                .padding(32.dp)
                .padding(bottom = it.calculateBottomPadding())
        ) {
            Column(
                Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                Text(
                    text = "SMART HOME",
                    style = MaterialTheme.typography.displayLarge,

                    )
                Box(modifier = Modifier.height(height = 16.dp))

                Icon(
                    imageVector = Icons.TwoTone.Home,
                    contentDescription = null,
                    Modifier
                        .fillMaxSize()
                        .height(80.dp),
                    tint = MaterialTheme.colorScheme.background
                )


            }
        }
    }


}