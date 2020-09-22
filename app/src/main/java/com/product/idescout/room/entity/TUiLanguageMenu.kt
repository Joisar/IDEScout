package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_ui_language_menu",
    primaryKeys = ["MenuId"]
)
data class TUiLanguageMenu(
    @ColumnInfo(name = "MenuId") val menuId: Long,
    @ColumnInfo(name = "MenuKey") val menuKey: String,
    @ColumnInfo(name = "MenuURL") val menuURL: String,
    @ColumnInfo(name = "MenuName") val menuName: String,
    @ColumnInfo(name = "LangCode") val langCode: String,
    @ColumnInfo(name = "UseSite") val useSite: String?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "DesktopForm") val desktopForm: String?,
    @ColumnInfo(name = "AppForm") val appForm: String?
)
