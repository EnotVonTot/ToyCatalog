package com.example.toycatalog

import android.content.ClipData.Item

data class Items(val imageId: Int, val title: String)
class ItemsList  {val list = arrayListOf(
        Items(R.drawable.item1, "Грузовик WPL Army Truck RTR"),
        Items(R.drawable.item2, "Микроавтобус WPL D-42 RTR"),
        Items(R.drawable.item3, "Внедорожник WPL C34 KM"),
        Items(R.drawable.item4, "Внедорожник WPL WPLC-24-R"),
        Items(R.drawable.item5, "Грузовик WPL WPLB-24"),
        Items(R.drawable.item6, "Грузовик WPL Урал B36 RTR"),
            )}
