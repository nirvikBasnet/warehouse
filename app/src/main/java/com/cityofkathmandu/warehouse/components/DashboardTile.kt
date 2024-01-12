package com.cityofkathmandu.warehouse.components

import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DashboardTile(tile : Tile){
    Surface(
        modifier = Modifier
            .height(150.dp)
            .width(150.dp)
            .padding(1.dp)/*Padding for surface*/,
        shadowElevation = 40.dp,
        shape = RoundedCornerShape(20.dp)
    ) {
        Column(modifier = Modifier
            .padding(10.dp)) {

            Icon(imageVector = tile.icon ,
                contentDescription = tile.description)

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
    DashboardTile(tile)
}