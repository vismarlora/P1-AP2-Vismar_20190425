package com.example.p1_ap2_vismar_20190425.di

import android.content.Context
import androidx.room.Room
import com.example.p1_ap2_vismar_20190425.data.PrestamoDao
import com.example.p1_ap2_vismar_20190425.data.PrestamosDb
import com.example.p1_ap2_vismar_20190425.data.repository.PrestamoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton

    fun providesPrestamosDb(@ApplicationContext context: Context): PrestamosDb {
        return Room.databaseBuilder(
            context,
            PrestamosDb::class.java, "PrestamosDb")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun providesPrestamoDao(prestamosDb:PrestamosDb): PrestamoDao {
        return prestamosDb.prestamoDao
    }

    @Provides
    fun providesPrestamoRepository(prestamoDao: PrestamoDao): PrestamoRepository {
        return PrestamoRepository(prestamoDao)
    }
}