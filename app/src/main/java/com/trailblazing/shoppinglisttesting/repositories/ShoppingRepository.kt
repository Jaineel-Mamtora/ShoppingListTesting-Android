package com.trailblazing.shoppinglisttesting.repositories

import androidx.lifecycle.LiveData
import com.trailblazing.shoppinglisttesting.data.local.ShoppingItem
import com.trailblazing.shoppinglisttesting.data.remote.responses.ImageResponse
import com.trailblazing.shoppinglisttesting.other.Resource

interface ShoppingRepository {

    suspend fun insertShoppingItem(shoppingItem: ShoppingItem)

    suspend fun deleteShoppingItem(shoppingItem: ShoppingItem)

    fun observeAllShoppingItems(): LiveData<List<ShoppingItem>>

    fun observeTotalPrice(): LiveData<Float>

    suspend fun searchForImage(imageQuery: String): Resource<ImageResponse>

}