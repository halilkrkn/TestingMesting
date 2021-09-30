package com.example.testingmesting.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "shopping_item")
data class ShoppingItem(
    var name: String,
    var amount: Int,
    var price: Float,
    var imageUrl: String,

    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
)
