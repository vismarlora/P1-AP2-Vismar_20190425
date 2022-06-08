package com.example.p1_ap2_vismar_20190425.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.p1_ap2_vismar_20190425.model.Prestamo

@Database(
    entities = [
        Prestamo::class
    ],
    exportSchema = false,
    version = 1
)
abstract class PrestamosDb: RoomDatabase() {
    abstract val prestamoDao: PrestamoDao
}