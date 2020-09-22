package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TAdjType

@Dao
interface TAdjTypeDao {
    @Query("SELECT * FROM t_adj_type")
    fun getTAdjTypes(): List<TAdjType>

    @Insert
    fun insertTAdjTypes(vararg TAdjTypes: TAdjType)

    @Update
    fun updateTAdjType(TAdjType: TAdjType)

    @Delete
    fun deleteTAdjType(TAdjType: TAdjType)
}