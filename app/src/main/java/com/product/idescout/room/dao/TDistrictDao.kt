package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TDistrict

@Dao
interface TDistrictDao {
    @Query("SELECT * FROM t_districts")
    fun getTDistricts(): List<TDistrict>

    @Insert
    fun insertTDistricts(vararg TDistricts: TDistrict)

    @Update
    fun updateTDistrict(TDistrict: TDistrict)

    @Delete
    fun deleteTDistrict(TDistrict: TDistrict)
}