package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TGeneric

@Dao
interface TGenericDao {
    @Query("SELECT * FROM t_generics")
    fun getTGenerics(): List<TGeneric>

    @Insert
    fun insertTGenerics(vararg TGenerics: TGeneric)

    @Update
    fun updateTGeneric(TGeneric: TGeneric)

    @Delete
    fun deleteTGeneric(TGeneric: TGeneric)
}