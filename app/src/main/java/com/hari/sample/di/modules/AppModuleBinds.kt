package com.hari.sample.di.modules

import com.hari.sample.data.db.RoomDatabase
import com.hari.sample.data.db.UserDatabase
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class AppModuleBinds {

    @Binds
    abstract fun bindUserDatabase(impl: RoomDatabase): UserDatabase
}