package com.gouravsh.smarthomeapp.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.rounded.AccountCircle
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gouravsh.smarthomeapp.models.DashboardItem
import com.gouravsh.smarthomeapp.ui.theme.Shape

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen() {
    val dashboardItem = arrayOf(
        DashboardItem(title = "Lorem", onTap = {}),
        DashboardItem(title = "Lorem", onTap = {}),
        DashboardItem(title = "Lorem", onTap = {}),
        DashboardItem(title = "Lorem", onTap = {}),
        DashboardItem(title = "Log out", onTap = {}) {
            Icon(
                imageVector = Icons.Default.ExitToApp,
                contentDescription = null,
                Modifier.size(40.dp),
                tint = MaterialTheme.colorScheme.surfaceVariant
            )
        },
    )
    Scaffold(
        containerColor = MaterialTheme.colorScheme.surface,
    ) {
        Box(
            modifier = Modifier
                .padding(it)
                .padding(12.dp)
                .clip(Shape.large)
        ) {
            Column(
                Modifier
                    .clip(Shape.large),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {


                Box(
                    modifier = Modifier.fillMaxWidth(),
                    Alignment.BottomEnd

                ) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = "Lorem Ipsum", style = MaterialTheme.typography.headlineMedium)
                        Spacer(modifier = Modifier.width(40.dp))
                        Icon(
                            imageVector = Icons.Rounded.AccountCircle,
                            contentDescription = null,
                            modifier = Modifier.size(58.dp),
                            tint = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
                Spacer(modifier = Modifier.height(16.dp))
                dashboardItem.mapIndexed { index, it ->
                    Box(
                        modifier = Modifier
                            .background(color = MaterialTheme.colorScheme.onPrimary)
                            .padding(16.dp)

                    ) {
                        Column {
                            Row(
                                horizontalArrangement = Arrangement.SpaceBetween,
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(text = it.title, style = MaterialTheme.typography.titleMedium)
                                it.trailingIcon.invoke()
                            }
                            if (index != dashboardItem.size - 1)
                                Divider()
                        }

                    }
                }


            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    DashboardScreen()
}