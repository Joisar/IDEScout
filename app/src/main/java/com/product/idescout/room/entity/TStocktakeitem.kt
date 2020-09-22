package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_stocktakeitems",
    primaryKeys = ["StockTakeItemsId"],
    foreignKeys = [
        ForeignKey(
            entity = TStocktakemaster::class,
            childColumns = arrayOf("StockTakeId"),
            parentColumns = arrayOf("StockTakeId")
        ),
        ForeignKey(
            entity = TItemlist::class,
            childColumns = arrayOf("ItemNo"),
            parentColumns = arrayOf("ItemNo")
        ),
        ForeignKey(
            entity = TFacilityProductLot::class,
            childColumns = arrayOf("ProductStockId", "FacilityId", "LotId"),
            parentColumns = arrayOf("ProductStockId", "FacilityId", "LotId")
        )],
    indices = [
        Index("StockTakeId"),
        Index("ItemNo"),
        Index("ProductStockId", "FacilityId", "LotId")]
)
data class TStocktakeitem(
    @ColumnInfo(name = "StockTakeItemsId") val stockTakeItemsId: Long,
    @ColumnInfo(name = "StockTakeId") val stockTakeId: Long,
    @ColumnInfo(name = "ItemNo") val itemNo: Long,
    @ColumnInfo(name = "ProductStockId") val productStockId: Long,
    @ColumnInfo(name = "PhysicalQty") val physicalQty: Long?,
    @ColumnInfo(name = "StoreQty") val storeQty: Long?,
    @ColumnInfo(name = "AdjTypeId") val adjTypeId: Long?,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "LotId") val lotId: Long?,
    @ColumnInfo(name = "Remarks") val remarks: String?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String,
    @ColumnInfo(name = "CreateTs") val createTs: String,
    @ColumnInfo(name = "AMC") val AMC: Long?,
    @ColumnInfo(name = "PurchasePrice") val purchasePrice: Double?,
    @ColumnInfo(name = "SalesPrice") val salesPrice: Double?,
    @ColumnInfo(name = "BatchNo") val batchNo: String?,
    @ColumnInfo(name = "ExpiryDate") val expiryDate: String?
)
