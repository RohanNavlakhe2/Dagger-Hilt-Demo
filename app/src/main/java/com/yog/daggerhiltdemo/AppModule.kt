package com.yog.daggerhiltdemo

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent

@Module
@InstallIn(ApplicationComponent::class)
object AppModule {

    @Provides
    fun getUtil()=Utility()

    @Provides
    fun getStudent(utility: Utility):Student= Student(utility = utility)


}