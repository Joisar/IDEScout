package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilityDetail

@Dao
interface TFacilityDetailDao {
    @Query("SELECT * FROM t_facility_details")
    fun getTFacilityDetails(): List<TFacilityDetail>

    @Insert
    fun insertTFacilityDetails(vararg TFacilityDetails: TFacilityDetail)

    @Update
    fun updateTFacilityDetail(TFacilityDetail: TFacilityDetail)

    @Delete
    fun deleteTFacilityDetail(TFacilityDetail: TFacilityDetail)
}