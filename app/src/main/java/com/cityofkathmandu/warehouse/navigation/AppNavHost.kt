package com.cityofkathmandu.warehouse.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.cityofkathmandu.warehouse.screens.CycleCountScreen
import com.cityofkathmandu.warehouse.screens.HomeScreen
import com.cityofkathmandu.warehouse.screens.MoreScreen
import com.cityofkathmandu.warehouse.screens.MoveScreen
import com.cityofkathmandu.warehouse.screens.PickupScreen
import com.cityofkathmandu.warehouse.screens.ReceiveScreen
import com.cityofkathmandu.warehouse.screens.ReturnScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController,
    startDestination: String = NavigationItem.Home.route,
) {
    NavHost(modifier = modifier, navController = navController, startDestination = startDestination){
        /*
        Main Screen or Home Screen
         */
        composable(NavigationItem.Home.route){
            HomeScreen(navController)
        }

        /*
        Fist column of tiles
         */
        composable(NavigationItem.Receive.route){
            ReceiveScreen(navController)
        }
        composable(NavigationItem.Return.route){
            ReturnScreen(navController)
        }
        composable(NavigationItem.Pickup.route){
            PickupScreen(navController)
        }
        /*
        Second column of tiles
         */
        composable(NavigationItem.Move.route){
            MoveScreen(navController)
        }
        composable(NavigationItem.CycleCount.route){
            CycleCountScreen(navController)
        }
        composable(NavigationItem.More.route){
            MoreScreen(navController)
        }
    }
}
