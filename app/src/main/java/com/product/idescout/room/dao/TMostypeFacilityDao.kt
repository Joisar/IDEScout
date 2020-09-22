package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TMostypeFacility

@Dao
interface TMostypeFacilityDao {
    @Query("SELECT * FROM t_mostype_facility")
    fun getTMostypeFacilities(): List<TMostypeFacility>

    @Insert
    fun insertTMostypeFacilities(vararg TMostypeFacilities: TMostypeFacility)

    @Update
    fun updateTMostypeFacility(TMostypeFacility: TMostypeFacility)

    @Delete
    fun deleteTMostypeFacility(TMostypeFacility: TMostypeFacility)
}