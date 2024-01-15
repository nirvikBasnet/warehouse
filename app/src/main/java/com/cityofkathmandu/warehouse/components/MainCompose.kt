package com.cityofkathmandu.warehouse.components

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cityofkathmandu.warehouse.R
import com.cityofkathmandu.warehouse.navigation.NavigationItem

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainCompose(navController: NavController){

   Scaffold(
       topBar = { CenterAlignedTopAppBar(title = { Text(text = "Warehouse") }) },
   ) {
       Column(modifier = Modifier
           .fillMaxSize()
           .padding(it)) {
           TopMessageBar(modifier = Modifier.background(Color.Green), message = "15/01/24 9:33 AM")
           Column(modifier = Modifier
               .fillMaxSize()
               .weight(3f, true)) {
               Column(modifier = Modifier
                   .fillMaxSize()
                   .weight(2f, true)) {
                   Image(modifier = Modifier.fillMaxSize(), painter = painterResource(id = R.drawable.fork_lift_logo),
                       contentDescription = "Warehouse Image" )
               }
               Column(modifier = Modifier
                   .fillMaxSize()
                   .weight(1f, true)
                   .padding(5.dp)) {
                   firstColumn(navController)
                   secondColumn(navController)
               }
           }

       }

   }



}

@Composable
fun firstColumn(navController: NavController){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        DashboardTile(tile =Tile("Receive", "Receive", Icons.Default.ArrowForward, NavigationItem.Receive.route),navController )
        DashboardTile(tile =Tile("Return", "Return", Icons.Default.ArrowBack, NavigationItem.Return.route), navController )
        DashboardTile(tile =Tile("Pickup", "Pickup", Icons.Default.ShoppingCart, NavigationItem.Pickup.route), navController )
    }

    }


@Composable
fun secondColumn(navController: NavController){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        DashboardTile(tile =Tile("Move", "Move", Icons.Default.ExitToApp, NavigationItem.Move.route) , navController)
        DashboardTile(tile =Tile("Cycle Count", "Cycle Count", Icons.Default.List, NavigationItem.CycleCount.route) , navController)
        DashboardTile(tile =Tile("More", "More", Icons.Default.MoreVert, NavigationItem.More.route), navController )
    }

}

@Composable
@Preview
fun MainComposePreview(){
    MainCompose(navController = rememberNavController())
}