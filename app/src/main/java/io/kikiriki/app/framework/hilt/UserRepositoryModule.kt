package io.kikiriki.app.framework.hilt

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import io.kikiriki.app.data.repository.user.UserRepository
import io.kikiriki.app.data.repository.user.UserRepositoryImpl
import io.kikiriki.app.data.repository.user.local.UserLocalDataSource
import io.kikiriki.app.data.repository.user.mock.UserMockDataSource
import io.kikiriki.app.data.repository.user.remote.UserRemoteDataSource

@Module
@InstallIn(ActivityComponent::class)
abstract class UserRepositoryModule {

    @Binds
    abstract fun bindNoteRemoteDataSource(implementation: UserRemoteDataSource) : UserRepository.RemoteDataSource

    @Binds
    abstract fun bindNoteLocalDataSource(implementation: UserLocalDataSource) : UserRepository.LocalDataSource

    @Binds
    abstract fun bindNoteMockDataSource(implementation: UserMockDataSource) : UserRepository.MockDataSource

    @Binds
    abstract fun bindNoteRepository(implementation: UserRepositoryImpl) : UserRepository
}