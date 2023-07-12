package com.example.shopping.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopping.data.Product
import com.example.shopping.data.shoes

@Composable
fun CompactGridItem(label:String , product : List<Product>){
    Column(modifier = Modifier.padding(horizontal = 10.dp ,  vertical = 25.dp)) {
        Row(modifier = Modifier.fillMaxWidth().padding(horizontal = 10.dp) , verticalAlignment = Alignment.CenterVertically , horizontalArrangement = Arrangement.SpaceBetween) {
            Text(text = label ,  fontSize = 20.sp)
            TextButton(onClick = { /*TODO*/ } ) {
                Text(text = "View All", style = MaterialTheme.typography.labelSmall , fontSize =12.sp)
            }
        }
        LazyRow(){
            items(product){
                 prod ->
                Product_Card(product = prod)


            }
        }
    }
}



@Preview
@Composable
fun compactPrev(){
    CompactGridItem("Trending" , shoes)
}