package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_itemlist",
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
data class TItemlist(
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "ItemCode") val itemCode: String,
    @ColumnInfo(name = "ItemName") val itemName: String,
    @ColumnInfo(name = "ShortName") val shortName: String,
    @ColumnInfo(name = "MasterID") val masterID: String?,
    @ColumnInfo(name = "ItemGroupId") val itemGroupId: Long,
    @ColumnInfo(name = "ProductSubGroupId") val productSubGroupId: Long,
    @ColumnInfo(name = "DosageFormId") val dosageFormId: Long,
    @ColumnInfo(name = "bKeyItem") val bKeyItem: Long,
    @ColumnInfo(name = "Price") val price: Double,
    @ColumnInfo(name = "PackSize") val packSize: String,
    @ColumnInfo(name = "ItemSL") val itemSL: Long?,
    @ColumnInfo(name = "ItemSLTracer") val itemSLTracer: Long?,
    @ColumnInfo(name = "ExternalItemNo") val externalItemNo: String?,
    @ColumnInfo(name = "bTracerProduct") val bTracerProduct: Long,
    @ColumnInfo(name = "SortOrder") val sortOrder: Long?,
    @ColumnInfo(name = "UnitId") val unitId: Long?,
    @ColumnInfo(name = "bChaProduct") val bChaProduct: Long,
    @ColumnInfo(name = "ItemCodeDHIS2") val itemCodeDHIS2: Double?,
    @ColumnInfo(name = "CameCode") val cameCode: String?,
    @ColumnInfo(name = "isActive") val isActive: Long?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
