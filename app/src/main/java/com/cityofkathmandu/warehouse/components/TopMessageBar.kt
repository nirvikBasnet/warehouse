package com.cityofkathmandu.warehouse.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopMessageBar(modifier: Modifier, message: String){
    Box(modifier = modifier
        .height(20.dp)
        .fillMaxWidth(),
        contentAlignment = Alignment.Center){
        Text(text = "Last Synchronised : $message")
    }
}

@Composable
@Preview
fun TopMessageBarPreview(){
    TopMessageBar(modifier = Modifier.background(Color.Green), message = "15/01/24 9:33 AM")
}