package com.product.idescout

import android.content.Context
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.room.Room
import androidx.room.RoomDatabase
import com.idescout.sql.SqlScoutServer
import com.product.idescout.room.AppDatabase
import java.io.*


class MainActivity : AppCompatActivity() {

    lateinit var mContext: Context;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        sqlScoutServer = SqlScoutServer.create(this, packageName)

        mContext = this@MainActivity

        Handler().postDelayed(
            {
                Log.d("export", "emps:"+AppDatabase.getDatabase(applicationContext)!!.employeeDao().getEmployees().size)
            },
            10000
        )
    }

    private var sqlScoutServer: SqlScoutServer? = null


    override fun onResume() {
        sqlScoutServer!!.resume()
        super.onResume()
    }

    override fun onPause() {
        sqlScoutServer!!.destroy()
        super.onPause()
    }

    override fun onStop() {
        sqlScoutServer!!.destroy()
        super.onStop()
    }

    override fun onDestroy() {
        sqlScoutServer!!.destroy()
        super.onDestroy()
    }

}
