package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_ui_language",
    primaryKeys = ["LangLabelId"],
    foreignKeys = [
        ForeignKey(
            entity = TUiLanguageMenu::class,
            childColumns = arrayOf("MenuId"),
            parentColumns = arrayOf("MenuId")
        )],
    indices = [
        Index("MenuId")]
)
data class TUiLanguage(
    @ColumnInfo(name = "LangLabelId") val langLabelId: Long,
    @ColumnInfo(name = "MenuId") val menuId: Long,
    @ColumnInfo(name = "LangKey") val langKey: String,
    @ColumnInfo(name = "LangText") val langText: String,
    @ColumnInfo(name = "LangCode") val langCode: String,
    @ColumnInfo(name = "UseSite") val useSite: String,
    @ColumnInfo(name = "UseFor") val useFor: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
