package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_facility_product",
    primaryKeys = ["FacilityId", "ProductStockId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TItemlistMaster::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        )],
    indices = [
        Index("FacilityId"),
        Index("ItemNo")]
)
data class TFacilityProduct(
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "ProductStockId") val productStockId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "StoreId") val storeId: Long?,
    @ColumnInfo(name = "StockQty") val stockQty: Long?,
    @ColumnInfo(name = "AMC") val AMC: Long?,
    @ColumnInfo(name = "PurchasePrice") val purchasePrice: Long?,
    @ColumnInfo(name = "SalesPrice") val salesPrice: Long?,
    @ColumnInfo(name = "VatPerc") val vatPerc: Long?,
    @ColumnInfo(name = "ProfitPerc") val profitPerc: Long?,
    @ColumnInfo(name = "UpdateBy") val updateBy: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
