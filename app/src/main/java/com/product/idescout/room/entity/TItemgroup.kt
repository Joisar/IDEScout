package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_itemgroup",
    primaryKeys = ["ItemGroupId"]
)
data class TItemgroup(
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long,
    @ColumnInfo(name = "GroupName") val groupName: String,
    @ColumnInfo(name = "ShortName") val shortName: String?,
    @ColumnInfo(name = "BMajorGroup") val BMajorGroup: Long,
    @ColumnInfo(name = "SortOrder") val sortOrder: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
