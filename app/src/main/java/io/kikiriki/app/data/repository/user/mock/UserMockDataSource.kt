package io.kikiriki.app.data.repository.user.mock

import io.kikiriki.app.data.model.domain.User
import io.kikiriki.app.data.repository.user.UserRepository
import kotlinx.coroutines.delay
import javax.inject.Inject

class UserMockDataSource @Inject constructor() : UserRepository.MockDataSource {

    override suspend fun getUser(token: String): Result<User> {
        delay(700)
        return Result.success(
            User(
                id = 0,
                name = "Cristian",
                email = "cpalosrejano@gmail.com",
                birthDate = null,
                avatar = null
            )
        )
    }

}