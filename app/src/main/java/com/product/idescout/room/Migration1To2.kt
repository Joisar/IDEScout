package com.product.idescout.room

import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

class Migration1To2 : Migration(1, 2) {
    override fun migrate(database: SupportSQLiteDatabase) {
        // By implementing a Migration class, we're telling Room that it should use the data
        // from version 1 to version 2.
    }
}