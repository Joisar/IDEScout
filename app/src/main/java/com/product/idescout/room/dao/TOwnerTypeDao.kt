package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TOwnerType

@Dao
interface TOwnerTypeDao {
    @Query("SELECT * FROM t_owner_type")
    fun getTOwnerTypes(): List<TOwnerType>

    @Insert
    fun insertTOwnerTypes(vararg TOwnerTypes: TOwnerType)

    @Update
    fun updateTOwnerType(TOwnerType: TOwnerType)

    @Delete
    fun deleteTOwnerType(TOwnerType: TOwnerType)
}