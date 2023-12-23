package com.gouravsh.smarthomeapp.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.PlayArrow
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gouravsh.smarthomeapp.ui.common.AppTopBar
import com.gouravsh.smarthomeapp.ui.navigation.NavigationDestination

object HomeScreenDestination : NavigationDestination {
    override val route: String
        get() = "home"
    override val titleRes: Int
        get() = TODO("Not yet implemented")

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(modifier: Modifier = Modifier) {
    Scaffold(
        topBar = { AppTopBar() },
        containerColor = Color(0xFF30429F)
    ) { it ->
        Column(
            modifier = modifier.padding(
                bottom = it.calculateBottomPadding(),
                top = it.calculateTopPadding() + 30.dp, start = 23.dp, end = 23.dp
            ),
            horizontalAlignment = Alignment.CenterHorizontally,

            ) {
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            )
            {

                Row(modifier = Modifier.padding(horizontal = 15.dp, vertical = 20.dp)) {
                    Icon(
                        imageVector = Icons.Filled.Warning, contentDescription = null,
                        modifier = modifier.size(55.dp)
                    )
                    Column(modifier = Modifier.padding(start = 12.dp, end = 16.dp)) {
                        Text(

                            text = "Lorem Ipsum Blah blah",
                            style = MaterialTheme.typography.titleMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier.height(3.dp))
                        Text(
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.bodyMedium
                        )
                    }
                    Spacer(modifier = Modifier.width(40.dp))
                    Switch(modifier = Modifier, checked = true,
                        onCheckedChange = {})
                }


            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 25.dp)
            )
            {

                Card(
                    Modifier
                        .fillMaxWidth()
                        .weight(0.4f),
                    shape = RectangleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Row(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)) {
                        Icon(
                            imageVector = Icons.Outlined.Menu,
                            contentDescription = null,
                            modifier = Modifier.size(70.dp)
                        )
                        Spacer(Modifier.width(20.dp))
                        Switch(
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .scale(1.1f), checked = false,
                            onCheckedChange = {})
                    }
                    Column(modifier = Modifier.padding(horizontal = 18.dp)) {
                        Text(
                            modifier = Modifier.padding(vertical = 6.dp),
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier.padding(top = 3.dp, bottom = 18.dp),
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.ExtraLight
                        )
                    }
                }
                Spacer(modifier = Modifier.width(20.dp))
                Card(
                    Modifier
                        .fillMaxWidth()
                        .weight(0.4f),
                    shape = RectangleShape,
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    )
                ) {
                    Row(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)) {
                        Icon(
                            imageVector = Icons.Outlined.PlayArrow,
                            contentDescription = null,
                            modifier = Modifier.size(70.dp)
                        )
                        Spacer(Modifier.width(20.dp))
                        Switch(
                            modifier = Modifier
                                .padding(top = 8.dp)
                                .scale(1.1f), checked = false,
                            onCheckedChange = {})
                    }
                    Column(modifier = Modifier.padding(horizontal = 18.dp)) {
                        Text(
                            modifier = Modifier.padding(vertical = 6.dp),
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.bodyMedium,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            modifier = Modifier.padding(top = 3.dp, bottom = 18.dp),
                            text = "Lorem Ipsum",
                            style = MaterialTheme.typography.bodySmall,
                            fontWeight = FontWeight.ExtraLight
                        )
                    }
                }

            }
            Card(
                modifier = Modifier.fillMaxWidth(),
                shape = RectangleShape,
                colors = CardDefaults.cardColors(
                    containerColor = Color.White
                )
            )
            {
                Column(
                    modifier = Modifier.padding(
                        vertical = 20.dp,
                        horizontal = 25.dp
                    )
                ) {
                    Text(
                        text = "Lorem Ipsum Ipsum",
                        style = MaterialTheme.typography.bodyLarge,
                        fontSize = 20.sp
                    )
                    Spacer(Modifier.height(10.dp))
                    Slider(enabled = true,
                        modifier = Modifier
                            .scale(1.5f)
                            .padding(horizontal = 40.dp),
                        value = 0.7f,
                        onValueChange = {},
                        colors = SliderDefaults.colors(
                            activeTickColor = MaterialTheme.colorScheme.primary
                        ),
                        thumb = {
                            Card(
                                shape = RoundedCornerShape(25.dp), modifier = Modifier.size(25.dp),
                                colors = CardDefaults.cardColors(
                                    containerColor = Color.White
                                )
                            ) {
                                Icon(
                                    imageVector = Icons.Filled.AddCircle,
                                    contentDescription = null,
                                    modifier = Modifier.fillMaxSize()
                                )
                            }
                        }
                    )
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Lorem Ipsum",
                            fontWeight = FontWeight.Bold,
                            fontSize = 24.sp
                        )
                        Switch(checked = true, onCheckedChange = {})
                    }
                }
            }
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = 15.dp),
            ) {
                Text(
                    text = "Lorem Lorem Lorem lorem ",
                    color = Color.White
                )
                Text(
                    text = "Lorem Lorem Lorem lorem lorem lorem lorem",
                    color = Color.White
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    HomeScreen()
}