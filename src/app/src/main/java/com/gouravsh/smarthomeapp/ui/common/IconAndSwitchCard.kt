package com.gouravsh.smarthomeapp.ui.common

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun IconAndSwitchCard(
    modifier: Modifier = Modifier,
    icon: ImageVector,
    contentDescription: String? = null
) {
    Card(
        modifier
            .fillMaxWidth(),
        shape = RectangleShape,
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.onPrimary
        )
    ) {
        Row(modifier = Modifier.padding(vertical = 10.dp, horizontal = 8.dp)) {
            Icon(
                imageVector = icon,
                contentDescription = contentDescription,
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