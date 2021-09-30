package com.example.testingmesting.data.local

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface ShoppingDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    @Delete
    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    @Query("SELECT * FROM shopping_item")
    fun observeShoppingItems(): LiveData<List<ShoppingItem>>

    @Query("SELECT SUM(price * amount) From shopping_item")
    fun observeShoppingPrice(): LiveData<Float>


}