package com.example.shopping
import android.annotation.SuppressLint
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.shopping.components.Category_Row
import com.example.shopping.components.CompactGridItem
import com.example.shopping.components.searchBox
import com.example.shopping.data.shoes
import com.example.shopping.ui.theme.AppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomePage(){

    AppTheme {
        Surface(tonalElevation = 2.dp) {
            Scaffold {
                LazyColumn(modifier = Modifier.fillMaxSize(), contentPadding = PaddingValues(5.dp)) {
                    item {
                        Column(
                            modifier = Modifier.padding(top = 100.dp , start = 20.dp)
                        ) {
                            Text(
                                text = "Hello",
                                style = MaterialTheme.typography.titleLarge,
                                fontSize = 64.sp,
                                textAlign = TextAlign.Start
                            )
                            Text(
                                text = "Welcome to Store",
                                style = MaterialTheme.typography.bodyMedium,
                                modifier = Modifier.padding(start = 4.dp)
                            )
                        }
                    }
                    stickyHeader {
                        Surface() {
                            searchBox()
                        }
                    }
                    item {
                        Category_Row()
                    }
                    item() {
                        CompactGridItem(label = "Trending", product = shoes)
                    }
                    item() {
                        CompactGridItem(label = "Shoes", product = shoes)
                    }
                    item() {
                        CompactGridItem(label = "Clothes", product = shoes)
                    }
                    item() {
                        CompactGridItem(label = "Accessories", product = shoes)
                    }
                }
            }
        }
    }

}
@Preview(showBackground = true)
@Composable
fun HomePagePrev(){
    HomePage()
}


