package com.example.shopping

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopping.ui.theme.ShoppingTheme

@Composable
fun HomePage(){
    ShoppingTheme() {
        Column {
            Column(
                modifier = Modifier.fillMaxSize().padding(20.dp).padding(top = 100.dp)
            ) {
                Text(text = "Hello", style = MaterialTheme.typography.titleLarge)
                Text(text = "Welcome to Store", style = MaterialTheme.typography.bodyMedium)
            }
        }

    }
}
@Preview(showBackground = true)
@Composable
fun HomePagePrev(){
    HomePage()
}
