package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacility

@Dao
interface TFacilityDao {
    @Query("SELECT * FROM t_facility")
    fun getTFacilities(): List<TFacility>

    @Insert
    fun insertTFacilities(vararg TFacilities: TFacility)

    @Update
    fun updateTFacility(TFacility: TFacility)

    @Delete
    fun deleteTFacility(TFacility: TFacility)
}