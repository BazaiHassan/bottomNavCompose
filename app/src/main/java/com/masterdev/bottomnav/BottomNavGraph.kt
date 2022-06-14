package com.masterdev.bottomnav

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.masterdev.bottomnav.pages.HomeScreen
import com.masterdev.bottomnav.pages.ProfileScreen
import com.masterdev.bottomnav.pages.SettingScreen


@Composable
fun BottomNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = BottomBarScreen.Home.route
    ) {
        composable(route = BottomBarScreen.Home.route){
            HomeScreen()
        }

        composable(route = BottomBarScreen.Profile.route){
            ProfileScreen()
        }

        composable(route = BottomBarScreen.Settings.route){
            SettingScreen()
        }
    }

}