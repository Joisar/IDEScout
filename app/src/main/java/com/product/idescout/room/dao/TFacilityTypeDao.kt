package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityType

@Dao
interface TFacilityTypeDao {
    @Query("SELECT * FROM t_facility_type")
    fun getTFacilityTypes(): List<TFacilityType>

    @Insert
    fun insertTFacilityTypes(vararg TFacilityTypes: TFacilityType)

    @Update
    fun updateTFacilityType(TFacilityType: TFacilityType)

    @Delete
    fun deleteTFacilityType(TFacilityType: TFacilityType)
}