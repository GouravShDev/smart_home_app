package com.gouravsh.smarthomeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.gouravsh.smarthomeapp.screens.IntroDestination
import com.gouravsh.smarthomeapp.screens.IntroScreen
import com.gouravsh.smarthomeapp.screens.SignInDestination
import com.gouravsh.smarthomeapp.screens.SignInScreen

@Composable
fun SmartHomeNavHost(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = IntroDestination.route,
        modifier = modifier
    ) {
        composable(
            route = IntroDestination.route
        ) {
            IntroScreen(navigateToSignIn = { navController.navigate(SignInDestination.route) })
        }
        composable(
            route = SignInDestination.route
        )
        {
            SignInScreen()
        }
    }

}


