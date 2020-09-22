package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity

@Entity(
    tableName = "t_owner_type",
    primaryKeys = ["OwnerTypeId"]
)
data class TOwnerType(
    @ColumnInfo(name = "OwnerTypeId") val ownerTypeId: Long,
    @ColumnInfo(name = "OwnerTypeName") val ownerTypeName: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
