package com.example.shopping.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.DockedSearchBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun searchBox(){
    var searchText by remember { mutableStateOf("") }
    var searchActive by remember { mutableStateOf(false) }
    var searchItems = remember {
        mutableListOf(
            "First Item",
            "Second Item",
        )
    }
    DockedSearchBar(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        query = searchText,
        onQueryChange = {
            searchText = it
        },
        onSearch = {
            searchActive = false
        },
        active = searchActive,
        onActiveChange = {
            searchActive = it
        },
        placeholder = { Text(text = "Search" , style = MaterialTheme.typography.bodySmall) },
        leadingIcon = {
            Icon(imageVector = Icons.Default.Search, contentDescription = "search Icon")
        },
        trailingIcon = {
            if (searchActive) {
                Icon(
                    imageVector = Icons.Default.Close,
                    contentDescription = "search Icon",

                    Modifier
                        .alpha(0.5F)
                        .graphicsLayer(alpha = .5F)
                        .clickable {
                            if (searchText.isNotEmpty()) {
                                searchText = ""
                            } else
                                searchActive = !searchActive
                        })
            }},
    ) {
        searchItems.forEach(){
            Row( modifier = Modifier.padding(10.dp)) {
                Icon(imageVector = Icons.Default.History, contentDescription = "history icon" , modifier = Modifier
                    .padding(end = 10.dp, start = 6.dp)
                    .graphicsLayer(alpha = .5F))
                Text(text = it , style = MaterialTheme.typography.bodySmall)
            }
        }
    }
}