package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TTranslation

@Dao
interface TTranslationDao {
    @Query("SELECT * FROM t_translations")
    fun getTTranslations(): List<TTranslation>

    @Insert
    fun insertTTranslations(vararg TTranslations: TTranslation)

    @Update
    fun updateTTranslation(TTranslation: TTranslation)

    @Delete
    fun deleteTTranslation(TTranslation: TTranslation)
}