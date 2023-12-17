package com.gouravsh.smarthomeapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.gouravsh.smarthomeapp.screens.IntroDestination
import com.gouravsh.smarthomeapp.screens.IntroScreen

@Composable
fun SmartHomeNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
){
    NavHost(
        navController= navController,
        startDestination = IntroDestination.route,
        modifier = modifier
    ){
        composable(
            route = IntroDestination.route
        ){
            IntroScreen()
        }
    }
}