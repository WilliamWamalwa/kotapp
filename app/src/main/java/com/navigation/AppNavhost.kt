package com.starglen.zawadimart.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navigation.ROUT_HOME
import com.navigation.ROUT_ABOUT
import com.navigation.ROUT_DASHBOARD
import com.navigation.ROUT_INTENT
import com.navigation.ROUT_ITEMS
import com.navigation.ROUT_SERVICE
import com.navigation.ROUT_SPLASHSCREEN
import com.starglen.zawadimart.ui.screens.about.AboutScreen
import com.starglen.zawadimart.ui.screens.dashboard.DashboardScreen
import com.starglen.zawadimart.ui.screens.home.HomeScreen
import com.starglen.zawadimart.ui.screens.intent.IntentScreen
import com.starglen.zawadimart.ui.screens.items.ItemsScreen
import com.starglen.zawadimart.ui.screens.servicescreen.ServiceScreen
import com.starglen.zawadimart.ui.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = ROUT_SPLASHSCREEN
) {

    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier
    ) {
        composable(ROUT_HOME) {
            HomeScreen(navController)
        }
        composable(ROUT_ABOUT) {
            AboutScreen(navController)
        }
        composable(ROUT_INTENT) {
            IntentScreen(navController)
        }
        composable(ROUT_DASHBOARD) {
            DashboardScreen(navController)
        }
        composable(ROUT_ITEMS) {
            ItemsScreen(navController)
        }
        composable(ROUT_SERVICE) {
            ServiceScreen(navController)
        }
        composable(ROUT_SPLASHSCREEN) {
            SplashScreen(navController)
        }


    }
}