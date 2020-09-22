package com.product.idescout.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.product.idescout.room.dao.*
import com.product.idescout.room.entity.*

@Database(
    entities = arrayOf(
        Employee::class,
        Formaccess::class,
        Formlist::class,
        Synchurl::class,
        TAdjType::class,
        TApi::class,
        TCfmA7masterstockstatus::class,
        TCfmA7stockstatus::class,
        TCountry::class,
        TCountryall::class,
        TDailystock::class,
        TDistrict::class,
        TFacility::class,
        TFacilityDetail::class,
        TFacilityGroupMap::class,
        TFacilityLevel::class,
        TFacilityProduct::class,
        TFacilityProductLot::class,
        TFacilityType::class,
        TFacilitylog::class,
        TGeneric::class,
        TInitialSetup::class,
        TIssuedto::class,
        TItemgroup::class,
        TItemlist::class,
        TItemlistMaster::class,
        TMonth::class,
        TMostypeFacility::class,
        TOrderbook::class,
        TOrderbookitem::class,
        TOwnerType::class,
        TProductgroupMapping::class,
        TRegion::class,
        TServiceArea::class,
        TStocktakeitem::class,
        TStocktakemaster::class,
        TStore::class,
        TStoreProduct::class,
        TSupplier::class,
        TTransaction::class,
        TTransactionItem::class,
        TTransactionType::class,
        TTranslation::class,
        TUiLanguage::class,
        TUiLanguageMenu::class,
        TYear::class,
        TZone::class
    ),
    version = 2
)
abstract class AppDatabase : RoomDatabase() {




    companion object {
        @JvmField
        val MIGRATION_1_2 = Migration1To2()

        var INSTANCE: AppDatabase? = null
        var mContext: Context? = null
        const val db_name = "benin_esigl.db"

        fun getDatabase(context: Context): AppDatabase? {
            AppDatabase.mContext = context
            if (AppDatabase.INSTANCE == null) {
                synchronized(AppDatabase::class.java) {
                    if (AppDatabase.INSTANCE == null) {
                        AppDatabase.INSTANCE = Room.databaseBuilder(
                            context,
                            AppDatabase::class.java, AppDatabase.db_name
                        )
                            .allowMainThreadQueries()
                            .createFromAsset(AppDatabase.db_name)
                            .build()
                    }
                }
            }
            return AppDatabase.INSTANCE
        }
    }

    abstract fun employeeDao(): EmployeeDao

    abstract fun formaccessDao(): FormaccessDao

    abstract fun formlistDao(): FormlistDao

    abstract fun synchurlDao(): SynchurlDao

    abstract fun TAdjTypeDao(): TAdjTypeDao

    abstract fun TApiDao(): TApiDao

    abstract fun TCfmA7masterstockstatusDao(): TCfmA7masterstockstatusDao

    abstract fun TCfmA7stockstatusDao(): TCfmA7stockstatusDao

    abstract fun TCountryDao(): TCountryDao

    abstract fun TCountryallDao(): TCountryallDao

    abstract fun TDailystockDao(): TDailystockDao

    abstract fun TDistrictDao(): TDistrictDao

    abstract fun TFacilityDao(): TFacilityDao

    abstract fun TFacilityDetailDao(): TFacilityDetailDao

    abstract fun TFacilityGroupMapDao(): TFacilityGroupMapDao

    abstract fun TFacilityLevelDao(): TFacilityLevelDao

    abstract fun TFacilityProductDao(): TFacilityProductDao

    abstract fun TFacilityProductLotDao(): TFacilityProductLotDao

    abstract fun TFacilityTypeDao(): TFacilityTypeDao

    abstract fun TFacilitylogDao(): TFacilitylogDao

    abstract fun TGenericDao(): TGenericDao

    abstract fun TInitialSetupDao(): TInitialSetupDao

    abstract fun TIssuedtoDao(): TIssuedtoDao

    abstract fun TItemgroupDao(): TItemgroupDao

    abstract fun TItemlistDao(): TItemlistDao

    abstract fun TItemlistMasterDao(): TItemlistMasterDao

    abstract fun TMonthDao(): TMonthDao

    abstract fun TMostypeFacilityDao(): TMostypeFacilityDao

    abstract fun TOrderbookDao(): TOrderbookDao

    abstract fun TOrderbookitemDao(): TOrderbookitemDao

    abstract fun TOwnerTypeDao(): TOwnerTypeDao

    abstract fun TProductgroupMappingDao(): TProductgroupMappingDao

    abstract fun TRegionDao(): TRegionDao

    abstract fun TServiceAreaDao(): TServiceAreaDao

    abstract fun TStocktakeitemDao(): TStocktakeitemDao

    abstract fun TStocktakemasterDao(): TStocktakemasterDao

    abstract fun TStoreDao(): TStoreDao

    abstract fun TStoreProductDao(): TStoreProductDao

    abstract fun TSupplierDao(): TSupplierDao

    abstract fun TTransactionDao(): TTransactionDao

    abstract fun TTransactionItemDao(): TTransactionItemDao

    abstract fun TTransactionTypeDao(): TTransactionTypeDao

    abstract fun TTranslationDao(): TTranslationDao

    abstract fun TUiLanguageDao(): TUiLanguageDao

    abstract fun TUiLanguageMenuDao(): TUiLanguageMenuDao

    abstract fun TYearDao(): TYearDao

    abstract fun TZoneDao(): TZoneDao
}