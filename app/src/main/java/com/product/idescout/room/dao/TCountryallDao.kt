package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TCountryall

@Dao
interface TCountryallDao {
    @Query("SELECT * FROM t_countryall")
    fun getTCountryalls(): List<TCountryall>

    @Insert
    fun insertTCountryalls(vararg TCountryalls: TCountryall)

    @Update
    fun updateTCountryall(TCountryall: TCountryall)

    @Delete
    fun deleteTCountryall(TCountryall: TCountryall)
}