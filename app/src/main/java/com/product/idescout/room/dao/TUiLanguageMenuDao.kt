package com.product.idescout.room.dao

import androidx.room.*
import com.product.idescout.room.entity.TUiLanguageMenu

@Dao
interface TUiLanguageMenuDao {
    @Query("SELECT * FROM t_ui_language_menu")
    fun getTUiLanguageMenus(): List<TUiLanguageMenu>

    @Insert
    fun insertTUiLanguageMenus(vararg TUiLanguageMenus: TUiLanguageMenu)

    @Update
    fun updateTUiLanguageMenu(TUiLanguageMenu: TUiLanguageMenu)

    @Delete
    fun deleteTUiLanguageMenu(TUiLanguageMenu: TUiLanguageMenu)
}