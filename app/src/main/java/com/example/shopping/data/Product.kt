package com.example.shopping.data

import com.example.shopping.R

class Product(
    val img : Int,
    val Name : String,
    val Price : String
) {

}

val shoes = listOf<Product>(
    Product(img = R.drawable.x , Name = "Nike Training" , Price = "69.99$"),
    Product(img = R.drawable.x , Name = "Nike Training" , Price = "69.99$"),
    Product(img = R.drawable.x , Name = "Nike Training" , Price = "69.99$"),
    Product(img = R.drawable.x , Name = "Nike Training" , Price = "69.99$"),
)


