package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TCountry

@Dao
interface TCountryDao {
    @Query("SELECT * FROM t_country")
    fun getTCountries(): List<TCountry>

    @Insert
    fun insertTCountries(vararg TCountries: TCountry)

    @Update
    fun updateTCountry(TCountry: TCountry)

    @Delete
    fun deleteTCountry(TCountry: TCountry)
}