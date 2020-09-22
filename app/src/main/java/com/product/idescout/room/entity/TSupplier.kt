package com.product.idescout.room.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index

@Entity(
    tableName = "t_supplier",
    primaryKeys = ["SupplierId"],
    foreignKeys = [
        ForeignKey(
            entity = TFacility::class,
            childColumns = arrayOf("FacilityId"),
            parentColumns = arrayOf("FacilityId")
        )],
    indices = [
        Index("FacilityId")]
)
data class TSupplier(
    @ColumnInfo(name = "SupplierId") val supplierId: Long,
    @ColumnInfo(name = "SupplierName") val supplierName: String,
    @ColumnInfo(name = "SupplierAddress") val supplierAddress: String?,
    @ColumnInfo(name = "ContactName") val contactName: String?,
    @ColumnInfo(name = "ContactNo") val contactNo: String,
    @ColumnInfo(name = "Fax") val fax: String?,
    @ColumnInfo(name = "Email") val email: String?,
    @ColumnInfo(name = "Url") val url: String?,
    @ColumnInfo(name = "LoanAmount") val loanAmount: Double?,
    @ColumnInfo(name = "UpdateTs") val updateTs: String?,
    @ColumnInfo(name = "CreateTs") val createTs: String?,
    @ColumnInfo(name = "FacilityId") val facilityId: Long?,
    @ColumnInfo(name = "ISO3") val ISO3: String?
)
