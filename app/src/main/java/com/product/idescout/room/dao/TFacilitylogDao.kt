package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TFacilitylog

@Dao
interface TFacilitylogDao {
    @Query("SELECT * FROM t_facilitylog")
    fun getTFacilitylogs(): List<TFacilitylog>

    @Insert
    fun insertTFacilitylogs(vararg TFacilitylogs: TFacilitylog)

    @Update
    fun updateTFacilitylog(TFacilitylog: TFacilitylog)

    @Delete
    fun deleteTFacilitylog(TFacilitylog: TFacilitylog)
}