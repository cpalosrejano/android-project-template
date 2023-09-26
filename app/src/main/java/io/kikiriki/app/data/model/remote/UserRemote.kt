package io.kikiriki.app.data.model.remote

import io.kikiriki.app.data.model.domain.User
import io.kikiriki.app.utils.extension.toDate

data class UserRemote(
    val id: Long?,
    val name: String?,
    val email: String?,
    val birthDate: String?,
    val avatar: String?
)

fun UserRemote.toDomain() : User {
    return User(
        id = id,
        name = name,
        email = email,
        birthDate = birthDate.toDate(),
        avatar = avatar
    )
}