package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityLevel

@Dao
interface TFacilityLevelDao {
    @Query("SELECT * FROM t_facility_level")
    fun getTFacilityLevels(): List<TFacilityLevel>

    @Insert
    fun insertTFacilityLevels(vararg TFacilityLevels: TFacilityLevel)

    @Update
    fun updateTFacilityLevel(TFacilityLevel: TFacilityLevel)

    @Delete
    fun deleteTFacilityLevel(TFacilityLevel: TFacilityLevel)
}