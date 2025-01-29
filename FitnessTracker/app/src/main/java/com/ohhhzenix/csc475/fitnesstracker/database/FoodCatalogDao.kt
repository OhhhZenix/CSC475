package com.ohhhzenix.csc475.fitnesstracker.database

import androidx.room.Dao
import androidx.room.Query
import androidx.room.Upsert

@Dao
interface FoodCatalogDao {

    @Upsert
    suspend fun addFood(food: FoodCatalog)

    @Query("SELECT * FROM food_catalogs WHERE id = :id")
    suspend fun getFood(id: Int): FoodCatalog?

    @Query("SELECT * FROM food_catalogs")
    suspend fun getAllFood(): List<FoodCatalog>

    @Query("UPDATE food_catalogs SET name = :name, calories = :calories WHERE id = :id")
    suspend fun updateFood(id: Int, name: String, calories: Double)

    @Query("DELETE FROM food_catalogs WHERE id = :id")
    suspend fun removeFood(id: Int)
}