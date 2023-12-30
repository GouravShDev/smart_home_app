package com.gouravsh.smarthomeapp.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AccountBox
import androidx.compose.material.icons.outlined.Lock
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gouravsh.smarthomeapp.R
import com.gouravsh.smarthomeapp.ui.common.PrimaryButton
import com.gouravsh.smarthomeapp.ui.navigation.NavigationDestination

object SignInDestination : NavigationDestination {
    override val route: String
        get() = "signIn"
    override val titleRes: Int
        get() = R.string.signIn_title
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignInScreen(
    modifier: Modifier = Modifier,
    navigateToHome: () -> Unit
) {
    var name by remember {
        mutableStateOf("")
    }


    var password by remember {
        mutableStateOf("")
    }
    Column(
        modifier = modifier.padding(horizontal = 24.dp, vertical = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(
            Modifier.height(20.dp)
        )
        Text(
            text = "Sign In",
            style = MaterialTheme.typography.displaySmall,

            )
        Spacer(modifier = modifier.height(20.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Name") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                containerColor = Color.White
            ),
            leadingIcon = { Icon(Icons.Outlined.AccountBox, contentDescription = null) }
        )
        Spacer(Modifier.height(23.dp))
        OutlinedTextField(
            modifier = Modifier.fillMaxWidth(),
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Name") },
            colors = TextFieldDefaults.outlinedTextFieldColors(
                focusedLeadingIconColor = MaterialTheme.colorScheme.primary,
                containerColor = Color.White
            ),
            leadingIcon = { Icon(Icons.Outlined.Lock, contentDescription = null) }
        )
        Spacer(modifier = Modifier.height(30.dp))
        PrimaryButton(text = "LOREM", onClick = navigateToHome)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "or", style = MaterialTheme.typography.displaySmall)
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp),
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(9.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color(0xFFA367B1))
            ) {
                Text(
                    text = "Lorem",
                    style = MaterialTheme.typography.displaySmall,
                    color = Color.Black
                )
            }
            TextButton(
                modifier = Modifier
                    .width(150.dp)
                    .height(80.dp),
                onClick = { /*TODO*/ },
                shape = RoundedCornerShape(9.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White
                ),
                border = BorderStroke(3.dp, Color(0xFFA367B1))
            ) {
                Text(
                    text = "Lorem",
                    style = MaterialTheme.typography.displaySmall,
                    color = Color.Black
                )
            }
        }

        Spacer(modifier = modifier.height(90.dp))
        Text(text = "Lorem Ipsum blah? Lorem Ipsiom")
    }
}

@Preview(showBackground = true)
@Composable
fun SignInScreenPreview() {
    SignInScreen(navigateToHome = {})
}