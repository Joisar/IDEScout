package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_facility_product_lot",
    primaryKeys = ["LotId", "FacilityId", "ProductStockId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        ),
        ForeignKey(
            entity = TStore::class,
            childColumns = arrayOf("StoreId"),
            parentColumns = arrayOf("StoreId")
        )],
    indices = [
        Index("FacilityId"),
        Index("StoreId")]
)
data class TFacilityProductLot(
    @ColumnInfo(name = "LotId") val lotId: Long,
    @ColumnInfo(name = "FacilityId") val facilityId: Long,
    @ColumnInfo(name = "ProductStockId") val productStockId: Long,
    @ColumnInfo(name = "StoreId") val storeId: Long?,
    @ColumnInfo(name = "BatchNo", typeAffinity = ColumnInfo.BLOB) val batchNo: ByteArray?,
    @ColumnInfo(name = "LotBarcode") val lotBarcode: String?,
    @ColumnInfo(name = "LotQty") val lotQty: Long,
    @ColumnInfo(name = "ExpiryDate") val expiryDate: String?,
    @ColumnInfo(name = "UpdateBy") val updateBy: Long,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?
)
