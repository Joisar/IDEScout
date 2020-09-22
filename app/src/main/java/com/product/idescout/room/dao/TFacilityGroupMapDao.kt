package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityGroupMap

@Dao
interface TFacilityGroupMapDao {
    @Query("SELECT * FROM t_facility_group_map")
    fun getTFacilityGroupMaps(): List<TFacilityGroupMap>

    @Insert
    fun insertTFacilityGroupMaps(vararg TFacilityGroupMaps: TFacilityGroupMap)

    @Update
    fun updateTFacilityGroupMap(TFacilityGroupMap: TFacilityGroupMap)

    @Delete
    fun deleteTFacilityGroupMap(TFacilityGroupMap: TFacilityGroupMap)
}