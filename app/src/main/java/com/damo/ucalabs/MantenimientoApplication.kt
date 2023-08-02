package com.damo.ucalabs

import android.app.Application
import androidx.room.Room

class MantenimientoApplication : Application() {

    companion object{
        lateinit var database: MantenimientoDB
    }

//Desconosco porque no reconoce el override
     fun OnCreate(){
        super.onCreate()
        database = Room.databaseBuilder(this, MantenimientoDB::class.java, "MantenimientoDb").build()
    }
}