package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_productgroup_mapping",
    primaryKeys = ["GenericId"],
    foreignKeys = [
        ForeignKey(
            entity = TItemgroup::class,
            childColumns = arrayOf("ItemGroupId"),
            parentColumns = arrayOf("ItemGroupId")
        )],
    indices = [
        Index("ItemGroupId")]
)
data class TProductgroupMapping(
    @ColumnInfo(name = "GenericId") val genericId: String,
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
