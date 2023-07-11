package menu

import com.example.shopping.R

data class Categories(val image: Int, val name: String)


val categories = listOf<Categories>(
    Categories(R.drawable.trending, "Trending"),
    Categories(R.drawable.shoes, "Shoes"),
    Categories(R.drawable.cloth, "Clothes"),
    Categories(R.drawable.accessories, "Accessories")
)