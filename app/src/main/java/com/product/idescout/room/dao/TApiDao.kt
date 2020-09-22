package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TApi

@Dao
interface TApiDao {
    @Query("SELECT * FROM t_api")
    fun getTApis(): List<TApi>

    @Insert
    fun insertTApis(vararg TApis: TApi)

    @Update
    fun updateTApi(TApi: TApi)

    @Delete
    fun deleteTApi(TApi: TApi)
}