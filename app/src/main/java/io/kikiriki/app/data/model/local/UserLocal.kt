package io.kikiriki.app.data.model.local

import io.kikiriki.app.data.model.domain.User
import io.kikiriki.app.utils.extension.toDate

data class UserLocal(
    val id: Long?,
    val name: String?,
    val email: String?,
    val birthDate: String?,
    val avatar: String?
)

fun UserLocal.toDomain() : User {
    return User(
        id = id,
        name = name,
        email = email,
        birthDate = birthDate.toDate(),
        avatar = avatar
    )
}