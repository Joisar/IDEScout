package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_itemlist_master",
    primaryKeys = ["ItemNo"],
    foreignKeys = [
        ForeignKey(
            entity = TItemgroup::class,
            childColumns = arrayOf("ItemGroupId"),
            parentColumns = arrayOf("ItemGroupId")
        )],
    indices = [
        Index("ItemGroupId")]
)
data class TItemlistMaster(
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "CameCode") val cameCode: String?,
    @ColumnInfo(name = "ItemName") val itemName: String,
    @ColumnInfo(name = "ShortName") val shortName: String,
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long,
    @ColumnInfo(name = "ProductSubGroupId") val productSubGroupId: Long,
    @ColumnInfo(name = "DosageFormId") val dosageFormId: Long,
    @ColumnInfo(name = "bKeyItem") val bKeyItem: Long,
    @ColumnInfo(name = "Price") val price: Long,
    @ColumnInfo(name = "PackSize") val packSize: String,
    @ColumnInfo(name = "bTracerProduct") val bTracerProduct: Long,
    @ColumnInfo(name = "SortOrder") val sortOrder: Long?,
    @ColumnInfo(name = "UnitId") val unitId: Long?,
    @ColumnInfo(name = "GenericId") val genericId: String?,
    @ColumnInfo(name = "RouteId") val routeId: Double?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
