package com.example.kernel.presentation.home.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryCard(
    name: String,
    image: String,
    onclick: () -> Unit
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .padding(20.dp)
                .clip(RoundedCornerShape(10.dp))
            ,
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 20.dp,
                pressedElevation = 0.dp
            ),
            onClick = { onclick() },
            colors = CardDefaults.cardColors(
                containerColor = if (isSystemInDarkTheme()) Color.Black else Color.White
            )
        ){
            AsyncImage(
                alignment = Alignment.Center,
                modifier = Modifier
                    .fillMaxHeight(0.8f)
                    .fillMaxWidth()
                    .padding(10.dp)
                ,
                model = image,
                contentDescription = "category image"
            )
        }
        Text(
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(5.dp)
                .fillMaxHeight(1f)
                .fillMaxWidth()
            ,
            text = name,
        )
    }
}