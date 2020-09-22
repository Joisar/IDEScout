package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_translations",
    primaryKeys = ["TranslationId"]
)
data class TTranslation(
    @ColumnInfo(name = "TranslationId") val translationId: Long,
    @ColumnInfo(name = "TableName") val tableName: String,
    @ColumnInfo(name = "RecordId") val recordId: String,
    @ColumnInfo(name = "EnglishText") val englishText: String,
    @ColumnInfo(name = "LangText") val langText: String,
    @ColumnInfo(name = "LangCode") val langCode: String,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
