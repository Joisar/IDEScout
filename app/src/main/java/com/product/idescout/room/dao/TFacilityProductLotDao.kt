package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityProductLot

@Dao
interface TFacilityProductLotDao {
    @Query("SELECT * FROM t_facility_product_lot")
    fun getTFacilityProductLots(): List<TFacilityProductLot>

    @Insert
    fun insertTFacilityProductLots(vararg TFacilityProductLots: TFacilityProductLot)

    @Update
    fun updateTFacilityProductLot(TFacilityProductLot: TFacilityProductLot)

    @Delete
    fun deleteTFacilityProductLot(TFacilityProductLot: TFacilityProductLot)
}