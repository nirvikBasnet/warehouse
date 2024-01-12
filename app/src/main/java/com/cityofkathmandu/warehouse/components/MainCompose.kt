package com.cityofkathmandu.warehouse.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun MainCompose(){

    Column {
        firstColumn()
        secondColumn()
    }

}

@Composable
fun firstColumn(){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        DashboardTile(tile =Tile("Receive", "Receive", Icons.Default.ArrowForward, "ReceiveScreen") )
        DashboardTile(tile =Tile("Return", "Return", Icons.Default.ArrowBack, "ReceiveScreen") )
        DashboardTile(tile =Tile("Pickup", "Pickup", Icons.Default.ShoppingCart, "ReceiveScreen") )
    }

    }


@Composable
fun secondColumn(){
    Row (
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ){
        DashboardTile(tile =Tile("Move", "Move", Icons.Default.ExitToApp, "ReceiveScreen") )
        DashboardTile(tile =Tile("Cycle Count", "Cycle Count", Icons.Default.List, "ReceiveScreen") )
        DashboardTile(tile =Tile("More", "More", Icons.Default.MoreVert, "ReceiveScreen") )
    }

}

@Composable
@Preview
fun MainComposePreview(){
    MainCompose()
}