package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TUiLanguage

@Dao
interface TUiLanguageDao {
    @Query("SELECT * FROM t_ui_language")
    fun getTUiLanguages(): List<TUiLanguage>

    @Insert
    fun insertTUiLanguages(vararg TUiLanguages: TUiLanguage)

    @Update
    fun updateTUiLanguage(TUiLanguage: TUiLanguage)

    @Delete
    fun deleteTUiLanguage(TUiLanguage: TUiLanguage)
}