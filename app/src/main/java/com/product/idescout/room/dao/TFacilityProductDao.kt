package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityProduct

@Dao
interface TFacilityProductDao {
    @Query("SELECT * FROM t_facility_product")
    fun getTFacilityProducts(): List<TFacilityProduct>

    @Insert
    fun insertTFacilityProducts(vararg TFacilityProducts: TFacilityProduct)

    @Update
    fun updateTFacilityProduct(TFacilityProduct: TFacilityProduct)

    @Delete
    fun deleteTFacilityProduct(TFacilityProduct: TFacilityProduct)
}