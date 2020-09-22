package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TStoreProduct

@Dao
interface TStoreProductDao {
    @Query("SELECT * FROM t_store_product")
    fun getTStoreProducts(): List<TStoreProduct>

    @Insert
    fun insertTStoreProducts(vararg TStoreProducts: TStoreProduct)

    @Update
    fun updateTStoreProduct(TStoreProduct: TStoreProduct)

    @Delete
    fun deleteTStoreProduct(TStoreProduct: TStoreProduct)
}