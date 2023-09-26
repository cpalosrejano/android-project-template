package io.kikiriki.app.domain.user

import io.kikiriki.app.data.model.domain.User
import io.kikiriki.app.data.repository.user.UserRepository
import javax.inject.Inject

class GetUserUseCase @Inject constructor(
    private val userRepository: UserRepository
) {

    suspend operator fun invoke() : Result<User> {
        return userRepository.getUser("null")
    }

}