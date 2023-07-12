package com.example.shopping.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.MonitorHeart
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconToggleButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopping.R
import com.example.shopping.data.Product

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Product_Card(product : Product){
    val isFavorite = remember { mutableStateOf(false) }
    Card(onClick = { /*TODO*/ } , modifier = Modifier
        .padding(5.dp)
        .width(200.dp)) {
        Surface(tonalElevation = 4.dp ) {
            Column() {
                Box {
                    Image(
                        painter = painterResource(id = product.img),
                        contentDescription = "img",
                        modifier = Modifier
                            .padding(top = 20.dp)
                            .width(200.dp)
                            .height(200.dp)
                            .padding(10.dp),
                    )
                    IconToggleButton(modifier = Modifier.padding(start = 150.dp) ,checked = isFavorite.value,
                        onCheckedChange = { isFavorite.value = it }) {
                        val favoriteIcon: ImageVector = if (isFavorite.value) {
                            Icons.Default.Favorite
                        } else {
                            Icons.Default.FavoriteBorder
                        }
                        Icon(imageVector = favoriteIcon, contentDescription = "Favorite Icon")
                    }
                }
                Row(Modifier.padding(vertical = 4.dp)) {
                    Text(
                        text = product.Name,
                        style = MaterialTheme.typography.bodyMedium,
                        fontSize = 16.sp,
                        modifier = Modifier.padding(horizontal = 10.dp)
                    )
                }
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 15.dp, vertical = 4.dp),
                    horizontalArrangement = Arrangement.End
                ) {
                    Text(
                        text = product.Price,
                        style = MaterialTheme.typography.labelSmall,
                        fontSize = 14.sp,
                        fontStyle = FontStyle.Italic,
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun Product_CardPrev(){
  //  Product_Card()
}