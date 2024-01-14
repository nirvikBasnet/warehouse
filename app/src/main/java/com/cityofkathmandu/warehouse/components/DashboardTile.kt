package com.cityofkathmandu.warehouse.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.cityofkathmandu.warehouse.navigation.NavigationItem


@Composable
fun DashboardTile(tile : Tile,navController: NavController){
    Surface(
        modifier = Modifier
            .height(120.dp)
            .width(120.dp)
            .padding(1.dp)/*Padding for surface*/,
        shadowElevation = 40.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(modifier = Modifier
            .padding(10.dp)
            .clickable {
                navController.navigate(tile.route)
            },
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly) {

            Icon(modifier = Modifier.fillMaxSize(0.5f), imageVector = tile.icon ,
                contentDescription = tile.description)

            Text(text = tile.title, fontWeight = FontWeight.Bold)

        }
    }
}


data class Tile(
    val title: String,
    val description : String,
    val icon : ImageVector,
    val route : String
)

@Composable
@Preview
fun DashboardTilePreview(){
    val tile = Tile("Receive", "Receive", Icons.Default.List, "ReceiveScreen")
    DashboardTile(tile, rememberNavController())
}