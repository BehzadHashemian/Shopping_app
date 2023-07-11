package com.example.shopping

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import menu.categories

@Composable
fun Category_Row(){
    LazyRow(modifier = Modifier.fillMaxWidth().padding(start = 10.dp)){
        items(categories){
            category ->
            Row(modifier = Modifier.padding(6.dp).height(40.dp).background(MaterialTheme.colorScheme.primaryContainer ,  MaterialTheme.shapes.small).padding(horizontal = 7.dp) ,    verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.Center) {
                Icon(painter = painterResource(id = category.image) , contentDescription = category.name , modifier = Modifier.padding(end = 6.dp).width(20.dp))
                Text(text = category.name , style = MaterialTheme.typography.bodyMedium , color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
        }
    }
}

@Preview
@Composable
fun Category_Row_Prev(){
    Category_Row()
}